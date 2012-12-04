/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.IDepartmentDTOControllerFactory;
import CommunicationInterfaces.TeamDTO;
import Controller.DepartmentController;
import Persistence.Team;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Dennis
 */
public class DepartmentDTOControllerFactory extends UnicastRemoteObject implements IDepartmentDTOControllerFactory {

    private DepartmentController departmentController;
    private DTOAssembler dtoAssembler;

    public DepartmentDTOControllerFactory() throws RemoteException {
        departmentController = new DepartmentController();
        dtoAssembler = new DTOAssembler();
    }

    @Override
    public Collection<TeamDTO> getAllTeamsOfDepartment(int departmentID) throws RemoteException {
        Collection<TeamDTO> foundTeams = new LinkedList<TeamDTO>();
        for (Team team : departmentController.getAllTeamsOfDepartment(departmentID)) {
            foundTeams.add(dtoAssembler.createTeamDTO(team));
        }
        return foundTeams;
    }

    @Override
    public void updateTeam(TeamDTO teamDTO) throws RemoteException {
        Team teamToUpdate = dtoAssembler.updateTeamEntity(teamDTO);
        departmentController.updateTeam(teamToUpdate);
    }
}
