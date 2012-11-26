/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Communication.JMS.InitialSubscritptionManager;
import Communication.JMS.Interfaces.InvitationCallback;
import Communication.JMS.InvitationPublisher;
import Communication.JMS.InvitationUnsubscribeManager;
import Communication.JMS.InvitationsSubscriber;
import CommunicationInterfaces.CompetitionDTO;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author rafa
 */
public class TestJMS {

    /**
     * Test if you can subscribe in a topic
     */
    @Ignore
    public void testInitialSubscription() throws Exception {
        InitialSubscritptionManager initMngr = new InitialSubscritptionManager();
        initMngr.initialSubscription("jms/Topic1", "jms/Weltmeisterschaft", "mustersubscriber");
        //After running this call there must be an subscriber more in the glasfishy
        //Tested method, worked
    }

    @Ignore
    public void testunsubscribeSubscription() throws Exception {
        InvitationUnsubscribeManager unsubMngr = new InvitationUnsubscribeManager();
        unsubMngr.unsubscribeSubscription("jms/Topic1", "jms/Weltmeisterschaft", "44");
        //Tested method and it worked
    }

    //IN THIS METHOD THE CALL TO THE CALLBACKINSTANCE should happen
    @Test
    public void testInitilSub_PublishManager_Subscriber_AndUnsubscribe() {

        CompetitionDTO comDTO = new CompetitionDTO(null, "billiard", 2020202, new Date(), null, Boolean.TRUE);
        IimplementTheCallbackInterface iITCI = new IimplementTheCallbackInterface();

        //Subscriber an subscriber
        InitialSubscritptionManager initMngr = new InitialSubscritptionManager();
        initMngr.initialSubscription("jms/Topic1", "jms/Weltmeisterschaft", "44");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        initMngr.finish();

        InvitationPublisher invPub = new InvitationPublisher();
        invPub.publishMessages("jms/Topic1", "jms/Weltmeisterschaft", comDTO);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        invPub.finish();

        InvitationsSubscriber invSubs = new InvitationsSubscriber();
        invSubs.listenForInvitations("jms/Topic1", "jms/Weltmeisterschaft", "44", iITCI);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        invSubs.finish();

        InvitationUnsubscribeManager unsubMngr = new InvitationUnsubscribeManager();
        unsubMngr.unsubscribeSubscription("jms/Topic1", "jms/Weltmeisterschaft", "44");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestJMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        unsubMngr.finish();

    }

    class IimplementTheCallbackInterface implements InvitationCallback {

        @Override
        public void gettingInvitationFromMessageListener(CompetitionDTO message) {
            System.out.println("Date: " + message.getDateOfCompetition());
            System.out.println("Subject " + message.getSport());
            System.out.println("MessageBody " + message.getLeague());
            System.out.println("CompName " + message.getName());
        }
    }
}
