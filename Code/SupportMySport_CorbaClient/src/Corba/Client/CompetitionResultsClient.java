
package Corba.Client;

import CORBA_Competitions.CompetitionsResults;
import CORBA_Competitions.CompetitionsResultsHelper;
import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

/**
 *
 * @author Raphaela
 */
public class CompetitionResultsClient {

    public static void main(String[] args) {
        try {
            Properties probs = new Properties();
            probs.put("org.omg.CORBA.ORBInitialHost", "localhost");
            probs.put("org.omg.CORBA.ORBInitialPort", "1050");
            // create and initialize the ORB
            ORB orb = ORB.init(args, probs);
            
            // get the root naming context
            Object objRef = orb.resolve_initial_references("NameService");
            
            // Use NamingContextExt instead of NamingContext. This is part of
            // the Interoperable naming Service
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            
            // resolve the Object Reference in Naming
            CompetitionsResults competitionResultsStub = CompetitionsResultsHelper.narrow(ncRef.resolve_str("CompetitionsResultsObject"));
            
            System.out.println("Obtained a handle on server object: " + competitionResultsStub);
            System.out.println(competitionResultsStub.getCompetitionResults("Liga 1", "Fußball", "2013-12-11"));
            System.out.println(competitionResultsStub.getCompetitionResults("Liga 1", "Fußball", "2013-12-11"));
            System.out.println(competitionResultsStub.getCompetitionResults("Liga 1", "Fußball", "2013-12-11"));
            String a = competitionResultsStub.getCompetitionResults("Liga 2", "Handball", "2013-06-07");
            
            System.out.println(a);
        
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex);
            ex.printStackTrace(System.out);
        }
    }
}
