package Controller;

import Domaene.CompetitionManager;
import Domaene.DomainFacade;
import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeamId;
import Persistence.Department;
import Persistence.Meeting;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class CompetitionController {

    DomainFacade facade;
    
    public CompetitionController() {
        facade = new DomainFacade();
    }
    
    public void createNewCompetition(Department dep, String competitionName, double fee, Date date){
        facade.createNewCompetition(new Competition(dep,competitionName,fee,date));
    }
    
    public void createNewCompetition(Competition competition){
        facade.createNewCompetition(competition);
    }
    //TODO: write tests for these methods and check if they work properly
    public void addMemberToCompetitionTeam(ClubMember member, Competition competition, Team team, CompetitionTeamId competitionTeamId){
        facade.addMemberToCompetition(member, competition, team, competitionTeamId);
    }
    
    public void removeMemberFromCompetitionTeam(ClubMember member, Competition competition){
        facade.removeMemberFromCompetition(member.getId(), competition.getId());
    }
    
    public void removeMemberFromCompetitionTeam(int memberId, int competitionId){
        facade.removeMemberFromCompetition(memberId, competitionId);
    }
    
    public void addResultsToCompetitionMeeting(int TeamAId, int TeamBId, int pointsA, int pointsB, int competitionId){
        facade.addResultsToCompetitionMeeting(TeamAId, TeamBId, pointsA, pointsB, pointsB, competitionId);
    }
   
    public List<Competition> getAllCompetitions(){
        return facade.getAllCompetitions();
    }
    
    public List<Meeting> getCompetitionMeetings(int competitionId){
        return facade.showCompetitionMeetings(competitionId);
    }
    
    public List<Team> getAllTeamsOfCompetition(int competitionId){
        return facade.showAllTeamsOfCompetition(competitionId);
    }
    
    public List<ClubMember> getCompetitionTeamMembersOfCompetition(int competitionId){
        return facade.getCompetitionTeamMembersOfCompetition(competitionId);
    }
}
