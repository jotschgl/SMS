/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication.JMS;

import java.util.Properties;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author rafa This class should be used when somebody wants to subscribe an
 * subscriber to a topic this class will be used mainly for the usecase when the
 * coach wants to subscribe a team member to a new competition
 */
public class InitialSubscritptionManager {

    private Properties props;
    private InitialContext context;
    private TopicConnectionFactory topicConnectionFactory;
    private TopicConnection connection;
    private TopicSession session;
    private Topic topics;
    private TopicSubscriber topicSubscriber;

    /**
     *
     * @param connectionFactroyName -> This should be an existing factory like
     * jms/WeltmeisterschaftFactory
     * @param topicConnectionName -> This should be an existing topic like
     * jms/WeltmeisterschaftTopic
     * @param subScriberId -> This subscriberID will initialize the subscriber
     * in the topic, so that when a durable publisher posts a message and the
     * subscriber looks up with his ID he will get the saved messages.
     */
    public void initialSubscription(String connectionFactroyName, String topicConnectionName, String subScriberId) {


        //SET THE PROPERTIES FOR JNDI
        //NOT NECESSARYLY FOR RUNNING LOCAL BUT WHEN CALLING AN EXTERNAL JMS
        //THIS SETTINGS SHALL BE SETTED
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
            //GET THE CONTEXT
            //SHOULD ALSO WORK
            context = new InitialContext();
            //context = new InitialContext(props);
            //GET THE FACTORY
            topicConnectionFactory = (TopicConnectionFactory) context.lookup(connectionFactroyName);
            //GET A TOPICCONNECTION
            connection = topicConnectionFactory.createTopicConnection();            
            //START A SESSION
            session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            //CHECK IF THE TOPIC IS THERE
            topics = (Topic) context.lookup(topicConnectionName);
            //WITH THIS METHOD THE INITIAL SUBSCRIPTION IS STARTED, AFTER THIS CALL THERE MUST BE 
            //A NEW SUBSCRIBER IN THE TOPIC
            topicSubscriber  = session.createDurableSubscriber(topics, subScriberId);
            System.out.println("Subscribing user with the ID " + subScriberId);

        } catch (JMSException ex) {
            System.out.println("Exception occured in initialSubscription: " + ex.toString());
        } catch (NamingException ex) {
            System.out.println("Exception occured in initialSubscription: " + ex.toString());
        } finally {
            finish();
        }
    }

    /**
     * Closes the connection.
     */
    public void finish() {
        try {
            
            if(topicSubscriber != null){
                topicSubscriber.close();
            }
            
            if (session != null) {
                session.close();
            }

            if (connection != null) {
                connection.close();
            }

            if (context != null) {
                try {
                    context.close();
                    
                } catch (NamingException ex) {
                    Logger.getLogger(InitialSubscritptionManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (JMSException ex) {
            Logger.getLogger(InitialSubscritptionManager.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
