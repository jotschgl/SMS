/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Objects;

import Communication.TestInterface;
import java.rmi.RemoteException;
import javax.rmi.PortableRemoteObject;

/**
 *
 * @author Johannes
 */
public class TestIImp extends PortableRemoteObject  implements TestInterface {

    public TestIImp() throws RemoteException {
    }

    @Override
    public void sayHello(String m) throws RemoteException {
        System.out.println("Ausgabe: " + m);
    }
}
