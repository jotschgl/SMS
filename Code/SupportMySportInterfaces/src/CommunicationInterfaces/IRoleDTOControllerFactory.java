/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 *
 * @author Dennis
 */
public interface IRoleDTOControllerFactory extends Remote {
    
    public Collection<FunctionRoleDTO> getAllRoles() throws RemoteException;
    
}
