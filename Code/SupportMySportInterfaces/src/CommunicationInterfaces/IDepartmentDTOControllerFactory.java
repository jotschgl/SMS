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
public interface IDepartmentDTOControllerFactory extends Remote {
    
    public Collection<TeamDTO> getAllTeamsOfDepartment(int departmentID) throws RemoteException;
    
    public void updateTeam(TeamDTO teamDTO) throws RemoteException;
}
