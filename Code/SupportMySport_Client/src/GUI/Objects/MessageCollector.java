/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Objects;

import CommunicationInterfaces.CompetitionDTO;
import MessageInterfaces.IMessageCollector;
import MessageInterfaces.InvitationCallback;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Johannes
 */
public class MessageCollector extends UnicastRemoteObject implements IMessageCollector {

    public MessageCollector() throws RemoteException {
    }

    @Override
    public List<Serializable> getMessages() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasMessages() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void gettingInvitationFromMessageListener(Serializable message) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
