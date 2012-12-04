/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Domaene.DomainFacade;
import MessageInterfaces.IMessageCollector;
import javax.ejb.Stateful;

/**
 *
 * @author rafa
 */
@Stateful
public class MessageControllerFactory implements MessageControllerFactoryRemote {

    DomainFacade dm = new DomainFacade();

    public MessageControllerFactory() {
    }

    @Override
    public void subscribe(int id, IMessageCollector mc) {
        dm.listenForInvitations("smsFactory", "smsTopic", id + "", mc);
    }

}
