/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Controller.ClubMemberController;
import Controller.LoginController;
import Persistence.ClubMember;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;

/**
 *
 * @author Dennis
 */
@Stateful
public class ClubMemberDTOControllerFactory implements ClubMemberDTOControllerFactoryRemote {

    private ClubMemberController clubMemberController;
    private DTOAssembler dtoAssembler;
    private LoginController loginController;
    private TestInterface ti;

    public ClubMemberDTOControllerFactory() {
        clubMemberController = new ClubMemberController();
        dtoAssembler = new DTOAssembler();
        loginController = new LoginController();
    }

    @Override
    public void createOrUpdateClubMember(ClubMemberDTO clubMemberDTO) {
        clubMemberController.createOrUpdateClubMember(dtoAssembler.updateClubMemberEntity(clubMemberDTO));
    }

    @Override
    public Collection<ClubMemberDTO> getAllClubMembers() {
        Collection<ClubMemberDTO> allClubMembers = new LinkedList<ClubMemberDTO>();
        for (ClubMember clubMember : clubMemberController.getAllClubMembers()) {
            allClubMembers.add(dtoAssembler.createClubMemberDTO(clubMember));
        }
        return allClubMembers;
    }

    @Override
    public ClubMemberDTO getClubmemberByUserName(String username) {
        return dtoAssembler.createClubMemberDTO(clubMemberController.getClubmemberByUserName(username));
    }

    @Override
    public ClubMemberDTO getLoggedInClubmember() {
        ClubMemberDTO res = dtoAssembler.createClubMemberDTO(loginController.getLoggedinClubmember());
        System.out.println("in getLoggedInClubmember");
        return res;
    }

    @Override
    public boolean login(String username, String password) {
        return loginController.auth(username, password);
    }

    @Override
    public Collection<ClubMemberDTO> getAllTeamMembers(TeamDTO team) {
        Collection<ClubMember> members = clubMemberController.getAllTeamMembers(dtoAssembler.updateTeamEntity(team));
        LinkedList<ClubMemberDTO> membersDTO = new LinkedList<ClubMemberDTO>();
        for (ClubMember clubMember : members) {
            membersDTO.add(dtoAssembler.createClubMemberDTO(clubMember));
        }
        return membersDTO;
    }

    @Override
    public void getHello(TestInterface t) {
        this.ti = t;
    }

    @Override
    public void sayHello() {
        try {
            ti.sayHello("Grüße vom CMDTOCF");
        } catch (RemoteException ex) {
            Logger.getLogger(ClubMemberDTOControllerFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
