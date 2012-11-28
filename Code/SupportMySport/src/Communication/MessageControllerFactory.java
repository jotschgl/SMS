/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.ClubMemberDTO;
import Domaene.DomainFacade;
import MessageInterfaces.IMessageControllerFactory;
import MessageInterfaces.InvitationCallback;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author rafa
 */
public class MessageControllerFactory extends UnicastRemoteObject implements IMessageControllerFactory {

    DomainFacade dm = new DomainFacade();

    public MessageControllerFactory() throws RemoteException {
    }

    @Override
    public void subscribe(ClubMemberDTO member, InvitationCallback mc) throws RemoteException {
        dm.listenForInvitations("smsFactory", "smsTopic", member.getId() + "", mc);
    }
}
