/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Controller.ClubMemberController;
import Persistence.FunctionRole;
import java.util.Collection;
import java.util.LinkedList;
import javax.ejb.Stateful;

/**
 *
 * @author Dennis
 */
@Stateful
public class RoleDTOControllerFactory implements RoleDTOControllerFactoryRemote {

    private DTOAssembler dtoAssembler;
    private ClubMemberController clubMemberController;

    public RoleDTOControllerFactory() {
        dtoAssembler = new DTOAssembler();
        clubMemberController = new ClubMemberController();
    }

    @Override
    public Collection<FunctionRoleDTO> getAllRoles() {
        Collection<FunctionRoleDTO> allRoles = new LinkedList<FunctionRoleDTO>();
        for (FunctionRole role : clubMemberController.getAllRoles()) {
            allRoles.add(dtoAssembler.createFunctionRoleDTO(role));
        }
        return allRoles;
    }
}
