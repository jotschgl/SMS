/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Communication.UseCaseControllerFactory;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johannes
 */
public class Server
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            Registry reg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            System.setProperty("java.rmi.server.codebase", Server.class.getProtectionDomain().getCodeSource().getLocation().toString());
            UseCaseControllerFactory factory = new UseCaseControllerFactory();
            reg.rebind("UseCaseControllerFactory", factory);
            System.out.println("Object bound");
            System.out.println("Waiting for Clients...");
        }
        catch (RemoteException ex)
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
