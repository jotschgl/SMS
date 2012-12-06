/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication.JMS;

import Communication.CompetitionDTO;
import MessageInterfaces.ICompInvitationMessage;
import java.io.Serializable;

/**
 *
 * @author rafa
 */
public class CompetitionInvitationMessage implements ICompInvitationMessage, Serializable{

   
    CompetitionDTO compDTO;
    int clientId;
    String topicName;
    
    public CompetitionInvitationMessage(CompetitionDTO compdto, int clientid, String topicname){
        compDTO = compdto;
        clientId = clientid;
        topicName = topicname;
    }
    
    @Override
    public CompetitionDTO getCompetitionDTO() {
        return compDTO;
    }

    @Override
    public int getClientId() {
        return clientId;
    }

    @Override
    public String getTopicName() {
        return topicName;
    }
    
}
