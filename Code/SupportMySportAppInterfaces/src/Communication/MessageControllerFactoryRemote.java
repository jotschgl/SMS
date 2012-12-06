/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import javax.ejb.Remote;
import javax.jms.Message;

/**
 *
 * @author rafa
 */
@Remote
public interface MessageControllerFactoryRemote {

    public void subscribe(int id, IMessageCollector messageCollector);

    public void sendMessage(Message message);
}
