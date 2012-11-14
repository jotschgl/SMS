/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.Department;
import Persistence.Sport;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johannes
 */
public class SportManagerTest {
    
    public SportManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllSports method, of class SportManager.
     */
    @Test
    public void testGetAllSports() {
        System.out.println("getAllSports");
        SportManager instance = new SportManager();
        List expResult = null;
        List result = instance.getAllSports();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSportsById method, of class SportManager.
     */
    @Test
    public void testGetSportsById() {
        System.out.println("getSportsById");
        int id = 0;
        SportManager instance = new SportManager();
        Sport expResult = null;
        Sport result = instance.getSportsById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSportById method, of class SportManager.
     */
    @Test
    public void testGetSportById() {
        System.out.println("getSportById");
        Sport sport = null;
        SportManager instance = new SportManager();
        Sport expResult = null;
        Sport result = instance.getSportById(sport);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSportByName method, of class SportManager.
     */
    @Test
    public void testGetSportByName() {
        System.out.println("getSportByName");
        String name = "";
        SportManager instance = new SportManager();
        Sport expResult = null;
        Sport result = instance.getSportByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createOrUpdateSport method, of class SportManager.
     */
    @Test
    public void testCreateOrUpdateSport() {
        System.out.println("createOrUpdateSport");
        Sport sport = null;
        SportManager instance = new SportManager();
        instance.createOrUpdateSport(sport);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSportsOfDepartment method, of class SportManager.
     */
    @Test
    public void testGetSportsOfDepartment() {
        System.out.println("getSportsOfDepartment");
        Department d = null;
        SportManager instance = new SportManager();
        Collection expResult = null;
        Collection result = instance.getSportsOfDepartment(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
