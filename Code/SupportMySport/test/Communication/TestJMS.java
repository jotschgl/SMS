/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Communication.JMS.InitialSubscritptionManager;
import Communication.JMS.InvitationPublisher;
import Communication.JMS.InvitationUnsubscribeManager;
import Communication.JMS.InvitationsSubscriber;
import Persistence.Competition;
import Persistence.PersistenceManager;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import org.junit.Ignore;
import org.junit.Test;

public class TestJMS {

    /**
     * Test if you can subscribe in a topic
     */
    @Ignore
    public void testInitialSubscription() throws Exception {
        InitialSubscritptionManager initMngr = new InitialSubscritptionManager();
        initMngr.initialSubscription("smsFactory", "smsTopic", "28");
        //After running this call there must be an subscriber more in the glasfishy
        //Tested method, worked
    }

    @Test
    public void testunsubscribeSubscription() throws Exception {
        InvitationUnsubscribeManager unsubMngr = new InvitationUnsubscribeManager();
        unsubMngr.unsubscribeSubscription("smsFactory", "smsTopic", "28");
        //Tested method and it worked
    }
    
    @Ignore
    public void testPublishing(){
        
        PersistenceManager pm = new PersistenceManager();
        DTOAssembler asm = new DTOAssembler();
        Competition com = (Competition) pm.getObjectById(Competition.class, 3);
        CompetitionDTO comDTO = asm.createCompetitonDTO(com);
        
        InvitationPublisher invPub = new InvitationPublisher();
        invPub.publishMessages("smsFactory", "smsTopic", comDTO, 4711);
    }
    
    @Ignore
    public void testSubscription() throws Exception {
        IimplementTheCallbackInterface iITCI = new IimplementTheCallbackInterface();
        InvitationsSubscriber invSubs = new InvitationsSubscriber();
       // invSubs.listenForInvitations("smsFactory", "smsTopic", "28", iITCI);
        
        Thread.sleep(1000);
        
    }
    

    //IN THIS METHOD THE CALL TO THE CALLBACKINSTANCE should happen
    @Ignore
    public void testInitilSub_PublishManager_Subscriber_AndUnsubscribe() {
        
        IimplementTheCallbackInterface iITCI = new IimplementTheCallbackInterface();

        PersistenceManager pm = new PersistenceManager();
        DTOAssembler asm = new DTOAssembler();
        Competition com = (Competition) pm.getObjectById(Competition.class, 3);
        CompetitionDTO comDTO = asm.createCompetitonDTO(com);
        
        //Subscriber an subscriber
        InitialSubscritptionManager initMngr = new InitialSubscritptionManager();
        initMngr.initialSubscription("smsFactory", "smsTopic", "28");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        initMngr.finish();

        InvitationPublisher invPub = new InvitationPublisher();
        invPub.publishMessages("smsFactory", "smsTopic", comDTO, 4711);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            invPub.finish();
        } catch (NamingException ex) {
            Logger.getLogger(TestJMS.class.getName()).log(Level.SEVERE, null, ex);
        }

        InvitationsSubscriber invSubs = new InvitationsSubscriber();
       // invSubs.listenForInvitations("smsFactory", "smsTopic", "28", iITCI);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        invSubs.finish();

        InvitationUnsubscribeManager unsubMngr = new InvitationUnsubscribeManager();
        unsubMngr.unsubscribeSubscription("smsFactory", "smsTopic", "28");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        unsubMngr.finish();
    }

    class IimplementTheCallbackInterface  {

       
        public void gettingInvitationFromMessageListener(Serializable message) throws RemoteException {
            
            System.out.println("Date: " + ((CompetitionDTO)message).getDateOfCompetition());
            System.out.println("Subject " + ((CompetitionDTO)message).getSport());
            System.out.println("MessageBody " + ((CompetitionDTO)message).getLeague());
            System.out.println("CompName " + ((CompetitionDTO)message).getName());
        }
    }
}
