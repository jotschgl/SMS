/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.CompetitionTeamDTO;
import CommunicationInterfaces.DepartmentDTO;
import CommunicationInterfaces.MeetingDTO;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Dennis
 */
public class CompetitionDTOControllerFactoryTest {

    private CompetitionDTOControllerFactory instance;

    public CompetitionDTOControllerFactoryTest() {
        try {
            instance = new CompetitionDTOControllerFactory();
        } catch (RemoteException ex) {
            Logger.getLogger(CompetitionDTOControllerFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createNewCompetition method, of class
     * CompetitionDTOControllerFactory.
     */
    @Ignore
    @Test
    public void testCreateNewCompetition() throws Exception {
        System.out.println("* CompetitionDTOControllerFactoryTest: testCreateNewCompetition");
        LinkedList<DepartmentDTO> result = (LinkedList<DepartmentDTO>) instance.getAllDepartments();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        Date date = dateFormat.parse("12.12.2012");
        CompetitionDTO comp = new CompetitionDTO(result.getFirst(), "WM 2014", 1234, date);
        instance.createNewCompetition(comp);
    }

    /**
     * Test of getAllDepartments method, of class
     * CompetitionDTOControllerFactory.
     */
    @Ignore
    @Test
    public void testGetAllDepartments() throws Exception {
        System.out.println("* CompetitionDTOControllerFactoryTest: testGetAllDepartments");
        LinkedList<DepartmentDTO> result = (LinkedList<DepartmentDTO>) instance.getAllDepartments();
        for (DepartmentDTO dep : result) {
            System.out.println(dep.getDepartmentName());
            System.out.println(dep.getDepartmentChief().getFirstname());
        }
    }

    /**
     * Test of getAllCompetitions method, of class
     * CompetitionDTOControllerFactory.
     */
    @Test
    public void testGetAllCompetitions() throws Exception {
        System.out.println("* CompetitionDTOControllerFactoryTest: testGetAllCompetitions");
        LinkedList<CompetitionDTO> result = (LinkedList<CompetitionDTO>) instance.getAllCompetitions();
        for (CompetitionDTO comp : result) {
            System.out.print("Competition name: ");
            System.out.println(comp.getName());
            for(CompetitionTeamDTO compTeamDTO : comp.getAllTeamsOfCompetition()){
                System.out.print("Competition team: ");
                System.out.println(compTeamDTO.getTeam().getTeamName());
                System.out.print("Club Members of Competition Team: ");
                for(ClubMemberDTO clubMemberDTO : compTeamDTO.getAllClubMembersOfCompetitionTeam()){
                    System.out.print(clubMemberDTO.getLastname());
                    System.out.print(" , ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    /**
     * Test of getAllMeetingsOfCompetition method, of class
     * CompetitionDTOControllerFactory.
     */
    @Ignore
    @Test
    public void testGetAllMeetingsOfCompetition() throws Exception {
        System.out.println("getAllMeetingsOfCompetition");
        CompetitionDTO competition = null;
        CompetitionDTOControllerFactory instance = new CompetitionDTOControllerFactory();
        Collection expResult = null;
        Collection result = instance.getAllMeetingsOfCompetition(competition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createOrUpdateMeeting method, of class
     * CompetitionDTOControllerFactory.
     */
    @Ignore
    @Test
    public void testCreateOrUpdateMeeting() throws Exception {
        System.out.println("createOrUpdateMeeting");
        MeetingDTO meeting = null;
        CompetitionDTOControllerFactory instance = new CompetitionDTOControllerFactory();
        instance.createOrUpdateMeeting(meeting);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSports method, of class CompetitionDTOControllerFactory.
     */
    @Ignore
    @Test
    public void testGetAllSports() throws Exception {
        System.out.println("getAllSports");
        CompetitionDTOControllerFactory instance = new CompetitionDTOControllerFactory();
        Collection expResult = null;
        Collection result = instance.getAllSports();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTeams method, of class CompetitionDTOControllerFactory.
     */
    @Ignore
    @Test
    public void testGetAllTeams() throws Exception {
        System.out.println("getAllTeams");
        CompetitionDTOControllerFactory instance = new CompetitionDTOControllerFactory();
        Collection expResult = null;
        Collection result = instance.getAllTeams();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamsAndClubMembersOfCompetition method, of class
     * CompetitionDTOControllerFactory.
     */
    @Ignore
    @Test
    public void testGetTeamsAndClubMembersOfCompetition() throws Exception {
        System.out.println("getTeamsAndClubMembersOfCompetition");
        int competitionID = 0;
        CompetitionDTOControllerFactory instance = new CompetitionDTOControllerFactory();
        Collection expResult = null;
        Collection result = instance.getTeamsAndClubMembersOfCompetition(competitionID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
