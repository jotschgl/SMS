/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Communication.JMS.Interfaces.InvitationCallback;
import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.CompetitionDTO;
import Controller.LoginController;
import Domaene.DomainFacade;
import MessageInterfaces.IMessageControllerFactory;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rafa
 */
public class MessageControllerFactory implements IMessageControllerFactory {

    DomainFacade dm = new DomainFacade();
    MessageCollector mc = new MessageCollector();

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
        dm.listenForInvitations("jms/Topic1", "jms/Weltmeisterschaft", clientID, mc);
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
