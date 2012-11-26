/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Johannes
 */
public interface IUseCaseControllerFactory extends Remote {

    public IClubMemberDTOControllerFactory createClubMemberController() throws RemoteException;

    public ICompetitionDTOControllerFactory createCompetitionController() throws RemoteException;

    public IRoleDTOControllerFactory createRoleController() throws RemoteException;

    public IDepartmentDTOControllerFactory createDepartmentController() throws RemoteException;
}
