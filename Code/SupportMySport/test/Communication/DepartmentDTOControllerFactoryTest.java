/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.TeamDTO;
import java.rmi.RemoteException;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Dennis
 */
public class DepartmentDTOControllerFactoryTest {

    public DepartmentDTOControllerFactoryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAllTeamsOfDepartment method, of class
     * DepartmentDTOControllerFactory.
     */
    @Ignore
    @Test
    public void testGetAllTeamsOfDepartment() throws Exception {
        System.out.println("testGetAllTeamsOfDepartment");
        int departmentID = 6;
        DepartmentDTOControllerFactory instance = new DepartmentDTOControllerFactory();
        Collection<TeamDTO> result = instance.getAllTeamsOfDepartment(departmentID);
        System.out.println(result.size());
        for (TeamDTO team : result) {
            System.out.println(team.getTeamName());
        }
    }

    @Test
    public void addMemberToTeam() throws RemoteException {
        System.out.println("testAddMemberToTeam");
        int departmentID = 3;
        DepartmentDTOControllerFactory instance = new DepartmentDTOControllerFactory();
        ClubMemberDTOControllerFactory clubInstance = new ClubMemberDTOControllerFactory();
        Collection<TeamDTO> result = instance.getAllTeamsOfDepartment(departmentID);
        ClubMemberDTO clubMemberDTO = clubInstance.getClubmemberByUserName("petlus");
        if (clubMemberDTO != null) {
            System.out.println("ClubMember found");
            System.out.println(clubMemberDTO.getLastname());
        }
        System.out.println(result.size());
        for (TeamDTO team : result) {
            if (team.getId() == 1) {
                System.out.println("Team found");
                team.getAllClubMembers().add(clubMemberDTO);
                System.out.println("Update Team");
                instance.updateTeam(team);
            }
        }
    }
}
