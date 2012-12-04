/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

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

    public void subscribe(int id, IMessageCollector mc){
        dm.listenForInvitations("smsFactory", "smsTopic", id + "", mc);
    }
}
