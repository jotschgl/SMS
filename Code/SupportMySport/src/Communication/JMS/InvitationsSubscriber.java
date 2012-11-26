/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication.JMS;

import Communication.JMS.Interfaces.InvitationCallback;
import CommunicationInterfaces.CompetitionDTO;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author rafa
 */
public class InvitationsSubscriber {

    private TopicSubscriber sub = null;
    private InitialContext context = null;
    private TopicConnectionFactory topicConnectionFactory = null;
    private TopicConnection connection = null;
    private String clientID = null;
    private TopicSession session = null;
    private Topic topics = null;
    InvitationListener invListener = null;
    Properties props = null;

    public void listenForInvitations(String connectionFactoryName, String topicName, String ClientId, InvitationCallback invCallback) {

        props = new Properties();

        props.setProperty("java.naming.factory.initial",
                "com.sun.enterprise.naming.SerialInitContextFactory");

        props.setProperty("java.naming.factory.url.pkgs",
                "com.sun.enterprise.naming");

        props.setProperty("java.naming.factory.state",
                "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");


        // optional.  Defaults to localhost.  Only needed if web server is running 
        // on a different host than the appserver    
        props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");

        // optional.  Defaults to 3700.  Only needed if target orb port is not 3700.
        props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

        try {
            context = new InitialContext(props);
            topicConnectionFactory = (TopicConnectionFactory) context.lookup(connectionFactoryName);
            connection = topicConnectionFactory.createTopicConnection();
            session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            topics = (Topic) context.lookup(topicName);
            sub = session.createDurableSubscriber(topics, ClientId);
            invListener = new InvitationListener(invCallback);
            sub.setMessageListener(invListener);
            connection.start();

        } catch (JMSException ex) {
            System.err.println("Exception in listenToMessages(): " + ex.toString());
        } catch (NamingException ex) {
            System.err.println("Exception in listenToMessages(): " + ex.toString());
        }
    }

    /**
     * Closes the connection.
     */
    public void finish() {
        if (connection != null) {
            try {
                connection.close();
                session.close();
                sub.close();
            } catch (JMSException ex) {
                Logger.getLogger(InvitationsSubscriber.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * The TextListener class implements the MessageListener interface by
     * defining an onMessage method for the DurableSubscriber class.
     */
    private class InvitationListener implements MessageListener {

        InvitationCallback invCallback;

        public InvitationListener(InvitationCallback invCallback) {
            this.invCallback = invCallback;
        }

        /**
         * When a message is incoming it will call the callbackInstance the
         * callbackInstance is responsible for what happens when the message is
         * incoming
         *
         * @param message the incoming message
         */
        public void onMessage(Message message) {            
            if(message instanceof ObjectMessage){
                
                ObjectMessage m = (ObjectMessage) message;        
                try {
                    CompetitionDTO invMsgObj = (CompetitionDTO) m.getObject();
                    invCallback.gettingInvitationFromMessageListener(invMsgObj);
                } catch (JMSException ex) {
                    Logger.getLogger(InvitationsSubscriber.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
