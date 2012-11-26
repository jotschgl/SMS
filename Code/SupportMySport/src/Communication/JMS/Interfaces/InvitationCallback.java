package Communication.JMS.Interfaces;

import Communication.JMS.InvitationMessageObject;
        
public interface InvitationCallback {
    
    /**
     *
     * @param message
     */
    public void gettingInvitationFromMessageListener(InvitationMessageObject message);
    
}
