/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Controller.DepartmentController;
import Persistence.Team;
import java.util.Collection;
import java.util.LinkedList;
import javax.annotation.ManagedBean;
import javax.ejb.Stateful;

/**
 *
 * @author Dennis
 */
@Stateful
public class DepartmentDTOControllerFactory  implements DepartmentDTOControllerFactoryRemote {

    private DepartmentController departmentController;
    private DTOAssembler dtoAssembler;

    public DepartmentDTOControllerFactory()  {
        departmentController = new DepartmentController();
        dtoAssembler = new DTOAssembler();
    }

    @Override
    public Collection<TeamDTO> getAllTeamsOfDepartment(int departmentID)  {
        Collection<TeamDTO> foundTeams = new LinkedList<TeamDTO>();
        for (Team team : departmentController.getAllTeamsOfDepartment(departmentID)) {
            foundTeams.add(dtoAssembler.createTeamDTO(team));
        }
        return foundTeams;
    }

    @Override
    public void updateTeam(TeamDTO teamDTO)  {
        Team teamToUpdate = dtoAssembler.updateTeamEntity(teamDTO);
        departmentController.updateTeam(teamToUpdate);
    }
}
