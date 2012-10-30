/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Dennis
 */
public class PersistenceManagerTest {
    
    public PersistenceManagerTest() {
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
     * Test of save method, of class PersistenceManager.
     */
    @Test
    public void testSave() {
        System.out.println("* PersistenceManagerTest: testSave");
        PersistenceManager manager = new PersistenceManager();
        System.out.println("* PersistenceManagerTest: testSave --> save a ClubMember");
        ClubMember member = new ClubMember("Dagobert", "Duck", "dagduc", "StreetOne", "CityOne", "CountryOne", "111", "one@fhv.at", "11111", 'm', new Date());
        manager.save(member);
        System.out.println("* PersistenceManagerTest: testSave --> save a Competition");
        Competition competition = new Competition(null, "CompetitionOne", 100, new Date());
        fail("Expected failure!");
        System.out.println("* PersistenceManagerTest: testSave --> save a Department");
        System.out.println("* PersistenceManagerTest: testSave --> save a Federation");
        System.out.println("* PersistenceManagerTest: testSave --> save a FunctionRole");
        System.out.println("* PersistenceManagerTest: testSave --> save a League");
        System.out.println("* PersistenceManagerTest: testSave --> save a Meeting");
        System.out.println("* PersistenceManagerTest: testSave --> save a RoleRight");
        System.out.println("* PersistenceManagerTest: testSave --> save a Rule");
        System.out.println("* PersistenceManagerTest: testSave --> save a Sport");
        System.out.println("* PersistenceManagerTest: testSave --> save a Team");
        
    }
    
    @Ignore
    @Test
    public void testSaveWithLinkedObjects(){
        System.out.println("* PersistenceManagerTest: testSaveWithLinkedObjects");
    }

    /**
     * Test of delete method, of class PersistenceManager.
     */
    @Ignore
    @Test
    public void testDelete() {
        System.out.println("* PersistenceManagerTest: testDelete");
        Object object = null;
        PersistenceManager instance = new PersistenceManager();
        instance.delete(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PersistenceManager.
     */
    @Ignore
    @Test
    public void testUpdate() {
        System.out.println("* PersistenceManagerTest: testUpdate");
        Object object = null;
        PersistenceManager instance = new PersistenceManager();
        instance.update(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectById method, of class PersistenceManager.
     */
    @Ignore
    @Test
    public void testGetObjectById() {
        System.out.println("* PersistenceManagerTest: testGetObjectById");
        Class type = null;
        int id = 0;
        PersistenceManager instance = new PersistenceManager();
        Object expResult = null;
        Object result = instance.getObjectById(type, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectsByHQLQuery method, of class PersistenceManager.
     */
    @Ignore
    @Test
    public void testGetObjectsByHQLQuery() {
        System.out.println("* PersistenceManagerTest: testGetObjectByHQLQuery");
        String hqlQuery = "";
        PersistenceManager instance = new PersistenceManager();
        List expResult = null;
        List result = instance.getObjectsByHQLQuery(hqlQuery);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
