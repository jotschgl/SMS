/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import MessageInterfaces.InvitationCallback;
import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.CompetitionDTO;
import Domaene.DomainFacade;
import MessageInterfaces.IMessageCollector;
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

    public MessageControllerFactory() throws RemoteException {
    }

    @Override
    public void subscribe(ClubMemberDTO member, IMessageCollector mc) throws RemoteException {
        dm.listenForInvitations("smsFactory", "smsTopic", member.getId() + "", mc);
    }

    @Override
    public boolean hasMessage(String clientID) throws RemoteException {
        return mc.hasMessages();
    }

    @Override
    public Collection<Serializable> getMessages(String clientID) throws RemoteException {

        return mc.getMo();
    }
}
