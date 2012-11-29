/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author rafa
 */
public interface IMessageControllerFactory extends Remote {
    public void subscribe(int id, IMessageCollector messageCollector) throws RemoteException;

}
