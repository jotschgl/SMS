package Controller;

import Domaene.DomainFacade;
import Persistence.ClubMember;
import Persistence.FunctionRole;
import Persistence.Team;
import java.rmi.RemoteException;
import java.util.Collection;

public class ClubMemberController {

    private DomainFacade myDomainFacade;

    public ClubMemberController() {
        myDomainFacade = new DomainFacade();
    }

    public void createOrUpdateClubMember(ClubMember clubMember) {
        myDomainFacade.createOrUpdateClubMember(clubMember);
    }

    public Collection<ClubMember> getAllClubMembers() {
        return myDomainFacade.getAllClubMembers();
    }

    public Collection<ClubMember> searchMemberByAttributes(String attributes) {
        return myDomainFacade.searchMemberByAttributes(attributes);
    }

    public Collection<FunctionRole> getAllRoles() {
        return myDomainFacade.getAllRoles();
    }

    public ClubMember getClubmemberByUserName(String username) {
        return myDomainFacade.getClubmemberByUserName(username);
    }

    public Collection<ClubMember> getAllTeamMembers(Team team) {
        return myDomainFacade.getAllTeamMembers(team);
    }
}
