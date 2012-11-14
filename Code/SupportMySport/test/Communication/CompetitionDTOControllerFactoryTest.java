/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.CompetitionDTO;
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
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

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
}
