package Communication.JMS;

import MessageInterfaces.IInvitationMessage;
import java.io.Serializable;

public class InvitationMessageObject implements Serializable, IInvitationMessage{
        
        String subject;
        String competitionDate;
        String competitionName;
        String messageBody;

    @Override
        public String getSubject() {
            return subject;
        }

    @Override
        public String getCompetitionDate() {
            return competitionDate;
        }

    @Override
        public String getCompetitionName() {
            return competitionName;
        }

    @Override
        public String getMessageBody() {
            return messageBody;
        }
        
        public InvitationMessageObject (String subject, String competitionDate, String competitionName, String messageBody){
            this.subject            = subject;
            this.competitionDate    = competitionDate;
            this.competitionName    = competitionName;
            this.messageBody        = messageBody;
        }
    }