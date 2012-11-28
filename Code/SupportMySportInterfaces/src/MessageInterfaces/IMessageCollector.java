/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageInterfaces;

import CommunicationInterfaces.CompetitionDTO;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Johannes
 */
public interface IMessageCollector extends InvitationCallback {

    public List<Serializable> getMessages() throws RemoteException;

    public boolean hasMessages() throws RemoteException;
}
