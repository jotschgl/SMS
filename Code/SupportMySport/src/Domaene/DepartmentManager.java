/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.Department;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DepartmentManager {

    private PersistenceManager persistenceManager;

    public DepartmentManager() {
        persistenceManager = new PersistenceManager();
    }

    public List<Department> getAllDepartments() {
        List<Department> departments = new LinkedList<Department>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Department");
        for (Object obj : result) {
            departments.add((Department) obj);
        }
        return departments;
    }

    public Department getDepartmentById(int id) {
        return (Department) persistenceManager.getObjectById(Department.class, id);
    }

    public Department getDepartmentById(Department department) {
        return (Department) persistenceManager.getObjectById(Department.class, department.getId());
    }

    public Department getDepartmentByName(String name) {
        Department dep = null;
        List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Department d WHERE d.name LIKE '" + name + "')");
        if (result.size() == 1) {
            dep = (Department) result.get(0);
        }
        return dep;
    }

    public void createOrUpdateDepartment(Department department) {
        persistenceManager.update(department);
    }

    Department getDepartmentOfLoggedInMember(int id) {
        Department dep = null;
        try {
            List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Department d WHERE d.clubMember = '" + id + "'");
            if (result.size() == 1) {
                dep = (Department) result.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dep;
    }
    
    public Collection<Team> getAllTeamsOfDepartment(int departmentID){
        Department dep = (Department) persistenceManager.getObjectById(Department.class, departmentID);
        return dep.getTeams();
    }

    public void updateTeam(Team teamToUpdate) {
        persistenceManager.merge(teamToUpdate);
    }
}
