/* This class implements the POA object
 * the getCompetitionResults method will return 
 * a formated string. This string consists of
 * the competition results that are associated with
 * the sport, date and league
 */
package Communication.Corba.CORBA_Competitions;

import CORBA_Competitions.*;
import Domaene.DomainFacade;
import Persistence.Competition;
import Persistence.Meeting;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.CORBA.ORB;

public class CompetitionResultsImpl extends CompetitionsResultsPOA {

    DomainFacade _facade = new DomainFacade();
    private ORB orb;

    public void setORB(ORB orb_val) {
        orb = orb_val;
    }

    public void shutdown() {
        orb.shutdown(false);
    }

    public String getCompetitionResults(String liga, String sport, String datum) {

        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
        Competition comp = null;
        Collection<Competition> competitions = null;

        try {
            
            date = formatter.parse(datum);

            if (date != null) {
                //GET ALL THE COMPETITIONS THE ARE ON THIS DATE
                competitions = _facade.getCompetitionByDate(date);
            }
            //PRECHECK IF THERE ARE ANY COMPETITIONS
            if (competitions.size() > 0) {

                //RUN THROUGH THE COMPETITIONS AND GET THE RIGHT ONE
                for (Object obj : competitions) {
                    //THE SEARCHED COMPETITION MUST EQUALS WITH THE SPORT, THE LEAGUE AND THE GET COMPLETED FLAG MUST BE SET TRUE
                    if (((Competition) obj).getSport().getName().equals(sport) && ((Competition) obj).getLeague().getName().equals(liga) && ((Competition) obj).getCompleted() == true) {
                        comp = (Competition) obj;
                        break;
                    }
                }
                if (comp == null) {
                    return null;
                }
                String result = formatCompetitionResults(comp);
                return result;
            }
        }catch (ParseException ex) {
            Logger.getLogger(CompetitionResultsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException ex){
             Logger.getLogger(CompetitionResultsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private String formatCompetitionResults(Competition comp) {
        StringBuffer sb = new StringBuffer();
        Collection<Meeting> meetings = null;

        meetings = comp.getMeetings();

        for (Object obj : meetings) {
            sb.append(((Meeting) obj).getTeamByTeamAId().getName() + ":" + ((Meeting) obj).getPointsA());
            sb.append(((Meeting) obj).getTeamByTeamBId().getName() + ":" + ((Meeting) obj).getPointsB());
            sb.append("\n\n");
        }
        return sb.toString();
    }
}
