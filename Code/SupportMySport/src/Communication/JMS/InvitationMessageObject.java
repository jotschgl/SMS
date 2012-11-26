package Communication.JMS;

import java.io.Serializable;

public class InvitationMessageObject implements Serializable{
        
        String subject;
        String competitionDate;
        String competitionName;
        String messageBody;

        public String getSubject() {
            return subject;
        }

        public String getCompetitionDate() {
            return competitionDate;
        }

        public String getCompetitionName() {
            return competitionName;
        }

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