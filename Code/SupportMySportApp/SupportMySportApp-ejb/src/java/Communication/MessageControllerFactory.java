/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Domaene.DomainFacade;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;
import javax.jms.Message;

/**
 *
 * @author rafa
 */
@Stateful
public class MessageControllerFactory implements MessageControllerFactoryRemote {

    private DomainFacade dm = new DomainFacade();
    private IMessageCollector mc;
    private String subscriberID;

    public MessageControllerFactory() {
    }


    
    @Override
    public void subscribe(int id, IMessageCollector mc) {
        System.out.println("In Subscribe!!!!");
        dm.listenForInvitations("smsFactory", "smsTopic", id + "", mc);
        this.subscriberID = "smsTopic" + id;
        this.mc = mc;
    }

    @Override
    public void sendMessage(Message m) {
        if (m != null && m instanceof Serializable) {
            try {
                mc.gettingInvitationFromMessageListener((Serializable) m);
            } catch (RemoteException ex) {
                Logger.getLogger(MessageControllerFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
