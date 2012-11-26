/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageInterfaces;

/**
 *
 * @author Johannes
 */
public interface IInvitationMessage extends IMessageObject{

    public String getCompetitionDate();

    public String getCompetitionName();

    public String getMessageBody();

    public String getSubject();
    
    public int getCompetitionID();
    
    @Override
    public String toString();
}
