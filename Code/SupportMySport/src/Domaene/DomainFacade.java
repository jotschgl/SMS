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
    private CompetitionTeamManager competitionTeamManager;
    private MeetingManager meetingManager;
    
    public DomainFacade() {
        clubMemberManager = new ClubMemberManager();
        competitionManager = new CompetitionManager();
        competitionTeamManager = new CompetitionTeamManager();
        meetingManager = new MeetingManager();
    }
    
    // <editor-fold defaultstate="collapsed" desc="ClubMember Specific Calls">
    
    public List<Persistence.ClubMember> getAllClubMembers(){
        return clubMemberManager.getAllClubMembers();
    }
    
      public void createOrUpdateClubMember(Persistence.ClubMember clubMember){
        clubMemberManager.createOrUpdateClubMember(clubMember);
    }

    public List<Persistence.ClubMember> searchMemberByAttributes(String attributes) {
        return clubMemberManager.searchMembersByAttributes(attributes);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Competition Specific Calls">
    public Persistence.Competition getCompetitionById(int id){
        return competitionManager.getCompetitinById(id);
    }
       
    public List<Competition> getCompetitionsByName(String name){
        return competitionManager.getCompetitionsByName(name);
    }
    
    public List<Competition> getCompetitionByDepartmentId(int departmentId){
        return competitionManager.getCompetitionByDepartmentId(departmentId);
    }
        
    public List<Competition> getCompetitionByDate(Date startdate){
        return competitionManager.getCompetitionByDate(startdate);
    }
    
    public List<Competition> getAllCompetitionsBetweenPeriod(Date startdate, Date enddate){
        return competitionManager.getAllCompetitionsBetweenPeriod(startdate, enddate);
    }
    
    public List<Competition> getAllCompetitions(){
        return competitionManager.getAllCompetitions();
    }
    
    public void createNewCompetition(Competition competition){
        competitionManager.createNewCompetition(competition);
    }
    
    public void updateExistingCompetition(Competition competition){
        competitionManager.updateExistingCompetition(competition);
    }
    
    public void addMemberToCompetition(ClubMember member, Competition competition, Team team, CompetitionTeamId competitionTeamId) {
        competitionTeamManager.createNewCompetitionTeam(competitionTeamId, team, competition, member);
    }
    public void removeMemberFromCompetition(int memberId,int competitionId) {
        competitionTeamManager.removeMemberFromCompetition(memberId, competitionId);
        
    }
    public void addResultsToCompetitionMeeting(int teamAId, int teamBId, int pointsA, int pointsB, int pointsB0, int competitionId) {
        meetingManager.addResultsToCompetitionMeeting(teamAId, teamBId, pointsA, pointsB, competitionId);
    }
    public List<Meeting> showCompetitionResults(int competitionId) {
        return meetingManager.showCompetitionResults(competitionId);
    }

    public List<Team> showAllTeamsOfCompetition(int competitionId) {
        return competitionTeamManager.showAllTeamsOfCompetition(competitionId);
    }
    // </editor-fold>
}
