/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Domaene.DepartmentManager;
import Persistence.ClubMember;
import Persistence.Department;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.util.Collection;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author rafa
 */
public class DepartmentManagerTest {

    @Ignore
    @Test
    public void getAllDepartmentsTest() {

        DepartmentManager dm = new DepartmentManager();
        List<Department> dep = dm.getAllDepartments();
        System.out.println("");
        System.out.println("In get all departments test.");
        System.out.println("Listlenght " + dep.size());
        System.out.println("");
    }

    @Ignore
    @Test
    public void getDepartmentByIdTest() {
        DepartmentManager dm = new DepartmentManager();
        Department dep = dm.getDepartmentById(1);
        System.out.println("");
        System.out.println("In get department by id test.");
        System.out.println("Departmentname " + dep.getName());
        System.out.println("");
    }

    @Ignore
    @Test
    public void getDepartmentByNameTest() {
        String name = "Sonstige";
        DepartmentManager dm = new DepartmentManager();
        Department dep = dm.getDepartmentByName(name);
        System.out.println("");
        System.out.println("In get department by name: " + name);
        System.out.println("Departmentname: " + dep.getName());
        System.out.println("");
    }

    @Ignore
    @Test
    public void createOrUpdateDepartmentTest() {
        PersistenceManager mng = new PersistenceManager();
        Department dep = new Department((ClubMember) mng.getObjectById(ClubMember.class, 30), "Murmeln");
        DepartmentManager dm = new DepartmentManager();
        dm.createOrUpdateDepartment(dep);
    }

    @Test
    public void addClubMemberToTeamTest() {
        PersistenceManager mng = new PersistenceManager();
        Department dep = (Department) mng.getObjectById(Department.class, 3);
        Collection<Team> allTeamOfDaparment = dep.getTeams();
        ClubMember clubMem = (ClubMember) mng.getObjectById(ClubMember.class, 43);
        for (Team t : allTeamOfDaparment) {
            if (t.getId() == 2) {
                t.getClubMembers().add(clubMem);
                mng.update(t);
            }
        }
    }
}
