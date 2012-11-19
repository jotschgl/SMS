package Communication.Corba.Server;

import CORBA_Competitions.CompetitionsResults;
import CORBA_Competitions.CompetitionsResultsHelper;
import Communication.Corba.CORBA_Competitions.CompetitionResultsImpl;
import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class CompetitionResultsCorbaServer implements Runnable{

    
    public void initServer(String[] args) {
        try {
            
            Properties probs = new Properties();
            probs.put("org.omg.CORBA.ORBInitialHost", "localhost");
            probs.put("org.omg.CORBA.ORBInitialPort", "1050");
            // create and initialize the ORB
            ORB orb = ORB.init(args, probs);

            // get reference to rootpoa & activate the POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // create servant and register it with the ORB
            CompetitionResultsImpl compResultsImpl = new CompetitionResultsImpl();
            compResultsImpl.setORB(orb);

            // get object reference from the servant
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(compResultsImpl);
            CompetitionsResults href = CompetitionsResultsHelper.narrow(ref);

            // get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            
            // Use NamingContextExt which is part of the Interoperable
            // Naming Service (INS) specification.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // bind the Object Reference in Naming
            String name = "CompetitionsResultsObject";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, href);

            System.out.println("CompetitionResultsServer ready and waiting ...");
            orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
        System.out.println("HelloServer Exiting ...");
    }

    @Override
    public void run() {
       initServer(null);
    }
}
