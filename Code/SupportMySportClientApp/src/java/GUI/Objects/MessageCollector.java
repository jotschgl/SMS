/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Objects;

import Communication.IMessageCollector;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.rmi.PortableRemoteObject;

/**
 *
 * @author Johannes
 */
public class MessageCollector extends PortableRemoteObject implements IMessageCollector {

    private LinkedList<Serializable> messages = new LinkedList<Serializable>();
    private Object o;
    private Method invokeMethod;

    public LinkedList<Serializable> getMessages() {
        return messages;
    }

    public MessageCollector() throws RemoteException {
    }

    public MessageCollector(Method invokeMethod, Object o) throws RemoteException {
        this.invokeMethod = invokeMethod;
        this.o = o;
    }

    @Override
    public void gettingInvitationFromMessageListener(Serializable message) throws RemoteException {
        System.out.println("GETTING MESSAGE CALLBACK FROM SERVER, IN MESSAGECOLLECTOR.");
        messages.add(message);
        try {
            invokeMethod.invoke(this.o, new Object());
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MessageCollector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(MessageCollector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(MessageCollector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
}
