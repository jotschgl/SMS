/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import java.util.Date;
import java.util.List;
import Persistence.*;

/**
 *
 * @author Dennis
 */
public class DomainFacade { 

    private ClubMemberManager clubMemberManager;
    private CompetitionManager competitionManager;

    public DomainFacade() {
        clubMemberManager = new ClubMemberManager();
    }
    
    public List<Persistence.ClubMember> getAllClubMembers(){
        return clubMemberManager.getAllClubMembers();
    }
    
      public void createOrUpdateClubMember(Persistence.ClubMember clubMember){
        clubMemberManager.createOrUpdateClubMember(clubMember);
    }

    public List<Persistence.ClubMember> searchMemberByAttributes(String attributes) {
        return clubMemberManager.searchMembersByAttributes(attributes);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Competition Specific Calls">
    
    public Persistence.Competition getCompetitionById(int id){
        return competitionManager.getCompetitinById(id);
    }
       
    public List<Object> getCompetitionsByName(String name){
        return competitionManager.getCompetitionsByName(name);
    }
    
    public List<Object> getCompetitionByDepartmentId(int departmentId){
        return competitionManager.getCompetitionByDepartmentId(departmentId);
    }
        
    public List<Object> getCompetitionByDate(Date startdate){
        return competitionManager.getCompetitionByDate(startdate);
    }
    
    public List<Object> getAllCompetitionsBetweenPeriod(Date startdate, Date enddate){
        return competitionManager.getAllCompetitionsBetweenPeriod(startdate, enddate);
    }
    
    public List<Object> getAllCompetitions(){
        
        return competitionManager.getAllCompetitions();
    }
    // </editor-fold>
}
