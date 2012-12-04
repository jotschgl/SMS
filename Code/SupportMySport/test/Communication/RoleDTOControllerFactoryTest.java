/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dennis
 */
public class RoleDTOControllerFactoryTest {
    
    private RoleDTOControllerFactory instance;
    
    public RoleDTOControllerFactoryTest() {
        try {
            instance = new RoleDTOControllerFactory();
        } catch (RemoteException ex) {
            Logger.getLogger(RoleDTOControllerFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAllRoles method, of class RoleDTOControllerFactory.
     */
    @Test
    public void testGetAllRoles() throws Exception {
        System.out.println("* RoleDTOControllerFactoryTest: testGetAllRoles");
        RoleDTOControllerFactory instance = new RoleDTOControllerFactory();
        FunctionRoleDTO curRole;
        Collection result = instance.getAllRoles();
        for(Object obj : result){
            curRole = (FunctionRoleDTO)obj;
            System.out.print(curRole.getName());
            System.out.print(": ");
            System.out.println(curRole.getRoleRight().getName());
        }
    }
}
