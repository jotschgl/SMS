/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.*;

/**
 *
 * @author Johannes
 */
public class RMITest {

    public RMITest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Registry reg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

        UseCaseControllerFactory factory = new UseCaseControllerFactory();
        reg.rebind("UseCaseControllerFactory", factory);
        System.out.println("Object bound");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void testRMI() {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost");
            UseCaseControllerFactoryRemote factory = (UseCaseControllerFactoryRemote) reg.lookup("UseCaseControllerFactory");
            ClubMemberDTOControllerFactoryRemote cmc = factory.createClubMemberController();
            System.out.println(cmc.getAllClubMembers().size());
        } catch (NotBoundException ex) {
            Logger.getLogger(RMITest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AccessException ex) {
            Logger.getLogger(RMITest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RMITest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
