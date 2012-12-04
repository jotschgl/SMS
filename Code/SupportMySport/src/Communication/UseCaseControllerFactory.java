/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Dennis
 */
public class UseCaseControllerFactory extends UnicastRemoteObject implements  UseCaseControllerFactoryRemote{

    public UseCaseControllerFactory() throws RemoteException{
        super();
    }
    
    @Override
    public ClubMemberDTOControllerFactoryRemote createClubMemberController() throws RemoteException {
        return new ClubMemberDTOControllerFactory();
    }
    
    @Override
    public CompetitionDTOControllerFactoryRemote createCompetitionController() throws RemoteException {
        return new CompetitionDTOControllerFactory();
    }

    @Override
    public RoleDTOControllerFactoryRemote createRoleController() throws RemoteException {
        return new RoleDTOControllerFactory();
    }

    @Override
    public DepartmentDTOControllerFactoryRemote createDepartmentController() throws RemoteException {
        return new DepartmentDTOControllerFactory();
    }

    @Override
    public MessageControllerFactoryRemote createMessageControllerFactory() throws RemoteException {
       return new MessageControllerFactory();
    }
    
}
