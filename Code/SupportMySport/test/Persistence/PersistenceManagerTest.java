/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        Object object = null;
        PersistenceManager instance = new PersistenceManager();
        instance.save(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PersistenceManager.
     */
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
