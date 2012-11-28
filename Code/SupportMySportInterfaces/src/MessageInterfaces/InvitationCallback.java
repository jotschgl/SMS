package MessageInterfaces;

import CommunicationInterfaces.CompetitionDTO;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
        
public interface InvitationCallback extends Remote{
    
    /**
     *
     * @param message
     */
    public void gettingInvitationFromMessageListener(Serializable message) throws RemoteException;
    
}
