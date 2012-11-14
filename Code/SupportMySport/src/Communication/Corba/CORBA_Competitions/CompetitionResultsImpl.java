/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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

    DomainFacade _facade;
    
    private ORB orb;
    
    public void setORB(ORB orb_val){
		orb = orb_val;
    }
    
    public void shutdown(){
		orb.shutdown(false);
    }
    
    public void CompetitionResultsImp(DomainFacade facade){
        _facade = facade;
    }
    
    public String getCompetitionResults(String liga, String sport, String datum) {
       
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
        Competition comp = null;
        Collection<Competition> competitions = null;
        
        try {
             date = formatter.parse(datum);
        } catch (ParseException ex) {
            Logger.getLogger(CompetitionResultsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(date != null){
            competitions = _facade.getCompetitionByDate(date);
        }
        
        for(Object obj : competitions){
            if( ((Competition)obj).getSport().getName().equals(sport) && ((Competition)obj).getLeague().getName().equals(liga) && ((Competition)obj).getCompleted() == true  ){
                comp = (Competition) obj;
                break;
            }
        }
        if(comp == null){
            return "No results found for this competition.";
        }
        
        String result = formatCompetitionResults(comp);
        
        return result;
    }

    private String formatCompetitionResults(Competition comp) {
        StringBuffer sb = new StringBuffer();
        Collection<Meeting> meetings = null;
        
        meetings = comp.getMeetings();
        
        for(Object obj : meetings){
            sb.append(((Meeting)obj).getTeamByTeamAId().getName() + ":" + ((Meeting)obj).getPointsA());
            sb.append(((Meeting)obj).getTeamByTeamBId().getName() + ":" + ((Meeting)obj).getPointsB());
            sb.append("\n\n");
        }
        
        return sb.toString();
    }
}
