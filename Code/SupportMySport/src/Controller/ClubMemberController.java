/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public List<ClubMember> getAllClubMembers(){
        return myDomainFacade.getAllClubMembers();       
    }
    
    public List<ClubMember> searchMemberByAttributes(String attributes){
        return myDomainFacade.searchMemberByAttributes(attributes);
    }
}
