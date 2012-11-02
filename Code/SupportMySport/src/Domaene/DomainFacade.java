/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

<<<<<<< HEAD
import java.util.Date;
=======
import Persistence.ClubMember;
>>>>>>> 2989ddde2cd15cb983de475dbf69442f633ff1d3
import java.util.List;

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
    
<<<<<<< HEAD
    
    // <editor-fold defaultstate="collapsed" desc="Competition Specific Calls">
    
    public Competition getCompetitionById(int id){
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
=======
    public void createOrUpdateClubMember(ClubMember clubMember){
        clubMemberManager.createOrUpdateClubMember(clubMember);
    }

    public List<ClubMember> searchMemberByAttributes(String attributes) {
        return clubMemberManager.searchMembersByAttributes(attributes);
    }
>>>>>>> 2989ddde2cd15cb983de475dbf69442f633ff1d3
}
