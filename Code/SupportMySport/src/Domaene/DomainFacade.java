/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import java.util.List;

/**
 *
 * @author Dennis
 */
public class DomainFacade {

    private ClubMemberManager clubMemberManager;

    public DomainFacade() {
        clubMemberManager = new ClubMemberManager();
    }
    
    public List<ClubMember> getAllClubMembers(){
        return clubMemberManager.getAllClubMembers();
    }
    
    

}
