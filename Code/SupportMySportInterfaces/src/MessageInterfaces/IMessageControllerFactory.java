/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageInterfaces;

import CommunicationInterfaces.ClubMemberDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 *
 * @author Johannes
 */
public interface IMessageControllerFactory extends Remote {

    public boolean hasMessage() throws RemoteException;

    public Collection<?> getMessages() throws RemoteException;

}
