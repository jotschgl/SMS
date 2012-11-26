/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.IClubMemberDTOControllerFactory;
import CommunicationInterfaces.ICompetitionDTOControllerFactory;
import CommunicationInterfaces.IDepartmentDTOControllerFactory;
import CommunicationInterfaces.IRoleDTOControllerFactory;
import CommunicationInterfaces.IUseCaseControllerFactory;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Dennis
 */
public class UseCaseControllerFactory extends UnicastRemoteObject implements  IUseCaseControllerFactory{

    public UseCaseControllerFactory() throws RemoteException{
        super();
    }
    
    @Override
    public IClubMemberDTOControllerFactory createClubMemberController() throws RemoteException {
        return new ClubMemberDTOControllerFactory();
    }
    
    @Override
    public ICompetitionDTOControllerFactory createCompetitionController() throws RemoteException {
        return new CompetitionDTOControllerFactory();
    }

    @Override
    public IRoleDTOControllerFactory createRoleController() throws RemoteException {
        return new RoleDTOControllerFactory();
    }

    @Override
    public IDepartmentDTOControllerFactory createDepartmentController() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
