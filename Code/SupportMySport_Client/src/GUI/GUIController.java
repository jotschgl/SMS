/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.DepartmentDTO;
import CommunicationInterfaces.FunctionRoleDTO;
import CommunicationInterfaces.IClubMemberDTOControllerFactory;
import CommunicationInterfaces.ICompetitionDTOControllerFactory;
import CommunicationInterfaces.IDepartmentDTOControllerFactory;
import CommunicationInterfaces.IRoleDTOControllerFactory;
import CommunicationInterfaces.IUseCaseControllerFactory;
import CommunicationInterfaces.RoleRightDTO;
import MessageInterfaces.IMessageControllerFactory;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andreas
 */
public class GUIController {

    private static CommunicationInterfaces.IUseCaseControllerFactory factory;
    private static ICompetitionDTOControllerFactory competController;
    private static IClubMemberDTOControllerFactory memberController;
    private static IRoleDTOControllerFactory roleController;
    private static ClubMemberDTO loggedInMember;
    private static IDepartmentDTOControllerFactory departmentController;
    private static IMessageControllerFactory messageController;

    public static void initRMI(String ip) {
        if (factory == null) {
            try {
                Registry reg = LocateRegistry.getRegistry(ip);
                factory = (IUseCaseControllerFactory) reg.lookup("UseCaseControllerFactory");

                competController = factory.createCompetitionController();
                memberController = factory.createClubMemberController();
                roleController = factory.createRoleController();
                departmentController = factory.createDepartmentController();
                messageController = factory.createMessageControllerFactory();
            } catch (NotBoundException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (AccessException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static IClubMemberDTOControllerFactory getClubMemberController() {
        return memberController;
    }

    static ICompetitionDTOControllerFactory getCompetitionController() {
        return competController;
    }

    static void setLoggedInMember(ClubMemberDTO loggedInClubmember) {
        loggedInMember = loggedInClubmember;
    }

    static Collection<RoleRightDTO> getRightsOfLoggedinUser() {
        Collection<FunctionRoleDTO> roles = loggedInMember.getAllFunctionRolesOfClubMember();
        LinkedList<RoleRightDTO> rights = new LinkedList<RoleRightDTO>();
        for (FunctionRoleDTO role : roles) {
            rights.add(role.getRoleRight());

        }
        return rights;
    }

    public static IRoleDTOControllerFactory getRoleControllerFactory() {
        return roleController;
    }

    public static ClubMemberDTO getLoggedInMember() {
        return loggedInMember;
    }

    static DepartmentDTO getDepartmentOfLoggedInDepartmentChief() {
        try {
            return competController.getDepartmentOfLoggedInDepartmentChief(loggedInMember);
        } catch (RemoteException ex) {
            Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Collection<CompetitionDTO> getCompetitionsOfDepartmentOfLoggedInMember() {
        if (loggedInMember != null) {
            try {
                return competController.getCompetitionsOfDepartmentOfLoggedInMember(loggedInMember);
            } catch (RemoteException ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public static IDepartmentDTOControllerFactory getDepartmentController() {
        return departmentController;
    }

    public static IMessageControllerFactory getMessageController() {
        return messageController;
    }
}
