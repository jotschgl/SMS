/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Communication.JMS.Interfaces.InvitationCallback;
import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.CompetitionDTO;
import Domaene.DomainFacade;
import MessageInterfaces.IMessageControllerFactory;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rafa
 */
public class MessageControllerFactory extends UnicastRemoteObject implements IMessageControllerFactory {

    DomainFacade dm = new DomainFacade();
    MessageCollector mc = new MessageCollector();
    
    public MessageControllerFactory() throws RemoteException{
        
    }

    @Override
    public void subscribe(ClubMemberDTO member) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasMessage(String clientID) throws RemoteException {
        return mc.hasMessages();
    }

    @Override
    public Collection<Serializable> getMessages(String clientID) throws RemoteException {
        dm.listenForInvitations("smsFactory", "smsTopic", clientID, mc);
        return mc.getMo();
    }

    class MessageCollector implements InvitationCallback {

        List<Serializable> mo = new LinkedList<Serializable>();

        public List<Serializable> getMo() {
            return mo;
        }

        @Override
        public void gettingInvitationFromMessageListener(CompetitionDTO message) {
            mo.add(message);
        }

        public boolean hasMessages() {
            if (mo.size() > 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
