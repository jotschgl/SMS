/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Communication.ClubMemberDTO;
import Communication.interfaces.IUseCaseControllerFactory;
import Controller.interfaces.IClubMemberController;
import Controller.interfaces.ICompetitionController;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andreas
 */
public class GUIController {

    private static IUseCaseControllerFactory factory;
    private static ICompetitionController competController;
    private static IClubMemberController memberController;

    public static void initRMI(String ip) {
        if (factory == null) {
            try {
                Registry reg = LocateRegistry.getRegistry(ip);
                factory = (IUseCaseControllerFactory) reg.lookup("UseCaseControllerFactory");
                
                competController = factory.createCompetitionController();
                memberController = factory.createClubMemberController();

            } catch (NotBoundException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (AccessException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static IClubMemberController getClubMemberController() {
        return memberController;
    }

    static ICompetitionController getCompetitionController() {
        return competController;
    }
}
