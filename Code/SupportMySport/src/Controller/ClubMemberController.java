/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Communication.ClubMemberDTO;
import Domaene.ClubMember;
import Domaene.DomainFacade;
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
    
    public void searchMemberByAttributes(String attributes){
        //TODO: Define method
    }
}
