/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageInterfaces;

import Communication.CompetitionDTO;

/**
 *
 * @author rafa
 */
public interface ICompInvitationMessage {
    
    CompetitionDTO getCompetitionDTO();
    
    int getClientId();
    
    String getTopicName();
    
}
