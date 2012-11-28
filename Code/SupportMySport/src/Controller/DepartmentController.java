/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Domaene.DomainFacade;
import Persistence.Department;
import Persistence.Team;
import java.util.Collection;

/**
 *
 * @author Dennis
 */
public class DepartmentController {

    private DomainFacade facade;

    public DepartmentController() {
        facade = new DomainFacade();
    }

    public Collection<Team> getAllTeamsOfDepartment(int departmentID) {
        return facade.getAllTeamsOfDepartment(departmentID);
    }

    public void updateTeam(Team teamToUpdate) {
        try {
            facade.updateTeam(teamToUpdate);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
