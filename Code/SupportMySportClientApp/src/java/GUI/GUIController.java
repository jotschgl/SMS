/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Communication.ClubMemberDTO;
import Communication.CompetitionDTO;
import Communication.DepartmentDTO;
import Communication.FunctionRoleDTO;
import Communication.ClubMemberDTOControllerFactoryRemote;
import Communication.CompetitionDTOControllerFactoryRemote;
import Communication.DepartmentDTOControllerFactoryRemote;
import Communication.RoleDTOControllerFactoryRemote;
import Communication.UseCaseControllerFactoryRemote;
import Communication.RoleRightDTO;
import Communication.MessageControllerFactoryRemote;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andreas
 */
public class GUIController {

    private static UseCaseControllerFactoryRemote factory;
    private static CompetitionDTOControllerFactoryRemote competController;
    private static ClubMemberDTOControllerFactoryRemote memberController;
    private static RoleDTOControllerFactoryRemote roleController;
    private static ClubMemberDTO loggedInMember;
    private static DepartmentDTOControllerFactoryRemote departmentController;
    private static MessageControllerFactoryRemote messageController;

    public static void initRMI(String ip) {
//        if (factory == null) {
//            try {
//                Registry reg = LocateRegistry.getRegistry(ip);
//                factory = (UseCaseControllerFactoryRemote) reg.lookup("UseCaseControllerFactory");
//
//                competController = factory.createCompetitionController();
//                memberController = factory.createClubMemberController();
//                roleController = factory.createRoleController();
//                departmentController = factory.createDepartmentController();
//                messageController = factory.createMessageControllerFactory();
//            } catch (NotBoundException ex) {
//                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (AccessException ex) {
//                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (RemoteException ex) {
//                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

    public static ClubMemberDTOControllerFactoryRemote getClubMemberController() {
        return Client.getClubMemberDTOControllerFactory();
    }

    static CompetitionDTOControllerFactoryRemote getCompetitionController() {
        return Client.getCompetitionDTOControllerFactory();
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

    public static RoleDTOControllerFactoryRemote getRoleControllerFactory() {
        // return roleController;
        return Client.getRoleDTOControllerFactory();
    }

    public static ClubMemberDTO getLoggedInMember() {
        return loggedInMember;
    }

    static DepartmentDTO getDepartmentOfLoggedInDepartmentChief() {

        return Client.getCompetitionDTOControllerFactory().getDepartmentOfLoggedInDepartmentChief(loggedInMember);

    }

    public static Collection<CompetitionDTO> getCompetitionsOfDepartmentOfLoggedInDepartmentChief() {
        if (loggedInMember != null) {
            try {
                System.out.println(loggedInMember.getId());
                return Client.getCompetitionDTOControllerFactory().getCompetitionsOfDepartmentOfLoggedInDepartmentChief(getDepartmentOfLoggedInDepartmentChief());

            } catch (Exception ex) {
                Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public static DepartmentDTOControllerFactoryRemote getDepartmentController() {
        //return departmentController;
        return Client.getDepartmentDTOControllerFactory();
    }

    public static MessageControllerFactoryRemote getMessageController() {
        //return messageController;
        return Client.getMessageControllerFactory();
    }
}
