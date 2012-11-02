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
    
    public List<ClubMember> getAllClubMembers(){
        return clubMemberManager.getAllClubMembers();
    }
    
      public void createOrUpdateClubMember(ClubMember clubMember){
        clubMemberManager.createOrUpdateClubMember(clubMember);
    }

    public List<ClubMember> searchMemberByAttributes(String attributes) {
        return clubMemberManager.searchMembersByAttributes(attributes);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Competition Specific Calls">
    
    public Persistence.Competition getCompetitionById(int id){
        //TODO: get all Competitions from the database
        return competitionManager.getCompetitinById(id);
    }
    
    public Competition getCompetitionByName(String name){
        //TODO: get Competitions from the database with a specific name
        return null;
    }
    
    public List<Competition> getCompetitionsByName(String name){
        //TODO: get Competitions from the database with a specific name
        return null;
    }
    
    public Competition getCompetitionByDepartment(int departmentId){
        //TODO: get the Competition connected with an department
        return null;
    }
    
    public Competition getCompetitionByDate(Date date){
        //TODO: get a Competition at a specific date
        return null;
    }
    
    public List<Competition> getAllCompetitionsByDate(Date startdate){
        //TODO: get all competitions from startdate
        return null;
    }
    
    public List<Competition> getAllCompetitionsBetweenPeriod(Date startdate, Date endDate){
         //TODO: get all Competitions between two Dates
        return null;
    }
    
    public List<Competition> getAllCompetitions(){
        //TODO: get all Competitions from the database
        return null;
    }
    // </editor-fold>
}
