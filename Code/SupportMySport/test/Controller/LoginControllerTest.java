/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
public class LoginControllerTest {
    
    public LoginControllerTest() {
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
     * Test of auth method, of class LoginController.
     */
    @Test
    public void testAuth() {
        System.out.println("auth");
        String id = "";
        String pw = "";
        LoginController instance = new LoginController();
        boolean expResult = true;
        boolean result = instance.auth(id, pw);
        assertEquals(expResult, result);
    }
}
