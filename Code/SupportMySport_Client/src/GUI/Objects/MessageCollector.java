/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Objects;

import CommunicationInterfaces.CompetitionDTO;
import MessageInterfaces.IMessageCollector;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johannes
 */
public class MessageCollector extends UnicastRemoteObject implements IMessageCollector {

    private LinkedList<Serializable> messages = new LinkedList<Serializable>();
    private Object o;
    
    private Method invokeMethod;
    public LinkedList<Serializable> getMessages() {
        return messages;
    }

    public MessageCollector(Method invokeMethod,Object o) throws RemoteException {
        this.invokeMethod = invokeMethod;
        this.o = o;
    }

    public void gettingInvitationFromMessageListener(Serializable message) throws RemoteException {
        System.out.println("GETTING MESSAGE CALLBACK FROM SERVER, IN MESSAGECOLLECTOR.");
        messages.add(message);
        try {
            invokeMethod.invoke(this.o);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MessageCollector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(MessageCollector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(MessageCollector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
