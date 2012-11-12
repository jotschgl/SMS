/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.IClubMemberDTOControllerFactory;
import Controller.ClubMemberController;
import Controller.LoginController;
import Persistence.ClubMember;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Dennis
 */
public class ClubMemberDTOControllerFactory extends UnicastRemoteObject implements IClubMemberDTOControllerFactory {

    private ClubMemberController clubMemberController;
    private DTOAssembler dtoAssembler;
    private LoginController loginController;

    public ClubMemberDTOControllerFactory() throws RemoteException {
        clubMemberController = new ClubMemberController();
        dtoAssembler = new DTOAssembler();
        loginController = new LoginController();
    }

    @Override
    public void createOrUpdateClubMember(ClubMemberDTO clubMemberDTO) throws RemoteException {
        clubMemberController.createOrUpdateClubMember(dtoAssembler.updateClubMemberEntity(clubMemberDTO));
    }

    @Override
    public Collection<ClubMemberDTO> getAllClubMembers() throws RemoteException {
        Collection<ClubMemberDTO> allClubMembers = new LinkedList<ClubMemberDTO>();
        for (ClubMember clubMember : clubMemberController.getAllClubMembers()) {
            allClubMembers.add(dtoAssembler.createClubMemberDTO(clubMember));
        }
        return allClubMembers;
    }

    @Override
    public ClubMemberDTO getClubmemberByUserName(String username) throws RemoteException {
        return dtoAssembler.createClubMemberDTO(clubMemberController.getClubmemberByUserName(username));
    }

    @Override
    public ClubMemberDTO getLoggedInClubmember() throws RemoteException {
        return dtoAssembler.createClubMemberDTO(loginController.getLoggedinClubmember());
    }

    @Override
    public boolean login(String username, String password)throws RemoteException  {
        return loginController.auth(username, password);
    }
}
