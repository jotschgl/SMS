/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Domaene.CompetitionManager;
import Domaene.DepartmentManager;
import Domaene.MemberTeamManager;
import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.Department;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Dennis
 */
public class CompetitionControllerTest {

    private MemberTeamManager memberTeamManager;
    private DepartmentManager departmentManager;
    private CompetitionManager competitionManager;

    public CompetitionControllerTest() {
        memberTeamManager = new MemberTeamManager();
        departmentManager = new DepartmentManager();
        competitionManager = new CompetitionManager();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Ignore
    @Test
    public void testGetCompetitionTeamMembersOfCompetition() {
        Collection<ClubMember> allMember = memberTeamManager.getCompetitionTeamMembersOfCompetition(1);
        System.out.println(allMember.size());
        if (allMember.size() > 0) {
            for (ClubMember cm : allMember) {
                System.out.println(cm.getLastname());
            }
        }
    }
    
    @Ignore
    @Test
    public void testGetAllDepartments(){
        Collection<Department> allDep = departmentManager.getAllDepartments();
        for(Department dep : allDep){
            System.out.println(dep.getName());
            System.out.println(dep.getClubMember().getFirstname());
        }
    }
}
