/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.FunctionRoleDTO;
import CommunicationInterfaces.IRoleDTOControllerFactory;
import Controller.ClubMemberController;
import Persistence.FunctionRole;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Dennis
 */
public class RoleDTOControllerFactory extends UnicastRemoteObject implements IRoleDTOControllerFactory {

    private DTOAssembler dtoAssembler;
    private ClubMemberController clubMemberController;
    
    public RoleDTOControllerFactory() throws RemoteException{
        dtoAssembler = new DTOAssembler();
        clubMemberController = new ClubMemberController();
    }
    
    @Override
    public Collection<FunctionRoleDTO> getAllRoles() throws RemoteException {
        Collection<FunctionRoleDTO> allRoles = new LinkedList<FunctionRoleDTO>();
        for(FunctionRole role : clubMemberController.getAllRoles()){
            allRoles.add(dtoAssembler.createFunctionRoleDTO(role));
        }
        return allRoles;
    } 
}
