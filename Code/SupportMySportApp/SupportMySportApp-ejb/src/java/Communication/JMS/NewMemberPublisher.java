/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication.JMS;

import Communication.ClubMemberDTO;
import Communication.CompetitionDTO;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author rafa
 */
public class NewMemberPublisher {

    Properties props;
    Context context;
    TopicConnectionFactory topicConnectionFactory = null;
    TopicConnection topicConnection = null;
    TopicSession topicSession = null;
    Topic topic = null;
    String topicName = null;
    String factoryName = null;
    TopicPublisher topicPublisher = null;

    public void publishMessages(String connectionFactroyName, String topicConnectionName, ClubMemberDTO clubMemberDTO) {
        try {
            this.factoryName = connectionFactroyName;
            this.topicName = topicConnectionName;
            //GET THE CONTEXT
            //SHOULD ALSO WORK
            context = new InitialContext();
            //context = new InitialContext(props);
            //GET THE FACTORY
            topicConnectionFactory = (TopicConnectionFactory) context.lookup(connectionFactroyName);
            //GET A TOPICCONNECTION
            topicConnection = topicConnectionFactory.createTopicConnection();
            //START A SESSION
            topicSession = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            //CHECK IF THE TOPIC IS THERE
            topic = (Topic) context.lookup(topicConnectionName);
            //GET A PUBLISHER and set the mode of the delivery to persistent to keep the date in the topic
            topicPublisher = topicSession.createPublisher(topic);
            topicPublisher.setDeliveryMode(DeliveryMode.PERSISTENT);
            /**
             * initialization related things finished now start with the message
             * related things
             *
             */
            ObjectMessage message = topicSession.createObjectMessage(clubMemberDTO);
            System.out.println("PUBLISHER: Publishing message of NewMember");
            topicPublisher.publish(message);
        } catch (JMSException ex) {
            Logger.getLogger(InvitationPublisher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(InvitationPublisher.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                finish();
            } catch (NamingException ex) {
                Logger.getLogger(InvitationPublisher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Closes the connection.
     */
    public void finish() throws NamingException {
        try {
            if (topicPublisher != null) {
                topicPublisher.close();
            }
            if (topicSession != null) {
                topicSession.close();
            }
            if (topicConnection != null) {
                topicConnection.close();
            }
            if (context != null) {
                context.close();
            }
        } catch (JMSException ex) {
            Logger.getLogger(InvitationPublisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
