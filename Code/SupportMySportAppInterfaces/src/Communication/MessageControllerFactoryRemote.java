/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import MessageInterfaces.IMessageCollector;
import javax.ejb.Remote;


/**
 *
 * @author rafa
 */
@Remote
public interface MessageControllerFactoryRemote  {
    public void subscribe(int id, IMessageCollector messageCollector);


}
