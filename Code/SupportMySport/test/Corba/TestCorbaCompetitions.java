/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Corba;

import Communication.Corba.CORBA_Competitions.CompetitionResultsImpl;
import Domaene.CompetitionManager;
import Persistence.Competition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author rafa
 */
public class TestCorbaCompetitions {
   
    @Test
    public void testgetCompetitionsBySportLigaAndDate() throws ParseException{            
 
        CompetitionResultsImpl compResults = new CompetitionResultsImpl();
        
        //"Liga 2", "Handball", "2013-06-07"
        
         String date = "2013-12-11";
         String liga = "Liga 1";
         String sport = "Fußball";
         
         //date = "2013-06-07";
         //liga = "Liga 2";
         //sport = "Handball";
                 
         String s = compResults.getCompetitionResults(liga, sport, date);
         System.out.println();
         System.out.println("Running test on testgetCompetitionsBySportLigaAndDate");
         System.out.println(s);
         System.out.println();
        
    }
}
