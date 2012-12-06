/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Johannes
 */
public interface IMessageCollector extends Remote{

    public void gettingInvitationFromMessageListener(Serializable message) throws RemoteException;

}
