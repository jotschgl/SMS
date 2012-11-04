package Controller;

import Domaene.DomainFacade;
import Persistence.ClubMember;
import java.util.List;

public class ClubMemberController {
    
    private DomainFacade myDomainFacade;
            
    public ClubMemberController(DomainFacade domainFacade){
        myDomainFacade = domainFacade;
    }
    
    public void createOrUpdateClubMember(ClubMember clubMember){
    }
    
    public List<Persistence.ClubMember> getAllClubMembers(){
        return myDomainFacade.getAllClubMembers();       
    }
    
    public List<ClubMember> searchMemberByAttributes(String attributes){
        return myDomainFacade.searchMemberByAttributes(attributes);
    }
}
