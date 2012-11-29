/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Objects;

import CommunicationInterfaces.CompetitionDTO;
import MessageInterfaces.IMessageCollector;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

/**
 *
 * @author Johannes
 */
public class MessageCollector extends UnicastRemoteObject implements IMessageCollector {

    private LinkedList<Serializable> messages = new LinkedList<Serializable>();

    public LinkedList<Serializable> getMessages() {
        return messages;
    }

    public MessageCollector() throws RemoteException {
    }

    public void gettingInvitationFromMessageListener(Serializable message) throws RemoteException {
        System.out.println("GETTING MESSAGE CALLBACK FROM SERVER, IN MESSAGECOLLECTOR.");
        messages.add(message);
    }
}