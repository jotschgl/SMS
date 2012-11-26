package Communication.JMS.Interfaces;

import CommunicationInterfaces.CompetitionDTO;
        
public interface InvitationCallback {
    
    /**
     *
     * @param message
     */
    public void gettingInvitationFromMessageListener(CompetitionDTO message);
    
}
