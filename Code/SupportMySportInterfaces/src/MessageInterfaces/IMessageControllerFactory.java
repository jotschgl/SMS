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
    
    public void subscribe(ClubMemberDTO member) throws RemoteException;

    public boolean hasMessage() throws RemoteException;

    public Collection<IMessageObject> getMessages() throws RemoteException;
    
    public void zusagen(IMessageObject message, ClubMemberDTO member) throws RemoteException;
    
    public void absagen(IMessageObject message, ClubMemberDTO member) throws RemoteException;
}
