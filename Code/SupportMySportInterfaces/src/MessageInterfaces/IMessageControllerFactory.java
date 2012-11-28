/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageInterfaces;

import CommunicationInterfaces.ClubMemberDTO;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 *
 * @author Johannes
 */
public interface IMessageControllerFactory extends Remote {
    
    public void subscribe(ClubMemberDTO member, InvitationCallback mc) throws RemoteException;

}
