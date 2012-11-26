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
import MessageInterfaces.IMessageObject;
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
    public Collection<IMessageObject> getMessages(String clientID) throws RemoteException {
        dm.listenForInvitations(clientID, clientID, clientID, mc);
        return mc.getMo();
    }

    @Override
    public void zusagen(IMessageObject message, ClubMemberDTO member) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void absagen(IMessageObject message, ClubMemberDTO member) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    class MessageCollector implements InvitationCallback {

        List<IMessageObject> mo = new LinkedList<IMessageObject>();

        public List<IMessageObject> getMo() {
            return mo;
        }

        @Override
        public void gettingInvitationFromMessageListener(CompetitionDTO message) {
            IMessageObject m = (IMessageObject) message;
            mo.add(m);
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
