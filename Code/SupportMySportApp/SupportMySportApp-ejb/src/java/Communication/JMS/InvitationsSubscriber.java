/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication.JMS;

import Communication.CompetitionDTO;
import Communication.IMessageCollector;
import java.rmi.RemoteException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Session;
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
    private TopicSession session = null;
    private Topic topics = null;
    InvitationListener invListener = null;
    Properties props = null;

    public void listenForInvitations(String connectionFactoryName, String topicName, String clientId, IMessageCollector invCallback) {
        try {
            context = new InitialContext();
            topicConnectionFactory = (TopicConnectionFactory) context.lookup(connectionFactoryName);
            connection = topicConnectionFactory.createTopicConnection();
            connection.setClientID(clientId);
            session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            topics = (Topic) context.lookup(topicName);
            sub = session.createDurableSubscriber(topics, topicName+clientId);
            invListener = new InvitationListener(invCallback);
            sub.setMessageListener(invListener);
            connection.start();
            System.out.println("Connection with topic started at InvitationSubscriber");
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
        try {
            if (sub != null) {
                sub.close();
            }
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
            if (context != null) {
                context.close();
            }
        } catch (NamingException ex) {
            Logger.getLogger(InvitationsSubscriber.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JMSException ex) {
            Logger.getLogger(InvitationsSubscriber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * The TextListener class implements the MessageListener interface by
     * defining an onMessage method for the DurableSubscriber class.
     */
    private class InvitationListener implements MessageListener {

        IMessageCollector messageCollector;

        public InvitationListener(IMessageCollector messageCollector) {
            this.messageCollector = messageCollector;
        }

        /**
         * When a message is incoming it will call the callbackInstance the
         * callbackInstance is responsible for what happens when the message is
         * incoming
         *
         * @param message the incoming message
         */
        public void onMessage(Message message) {
            if (message instanceof ObjectMessage) {

                ObjectMessage m = (ObjectMessage) message;
                try {
                    CompetitionInvitationMessage invMsgObj = (CompetitionInvitationMessage) m.getObject();
                    messageCollector.gettingInvitationFromMessageListener(invMsgObj);
                    System.out.println("In onMessage of InvitationSubsciber and sending Message to the remote IMessageCollector.");
                }catch (JMSException ex) {
                    Logger.getLogger(InvitationsSubscriber.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
