package Controller;

import Domaene.CompetitionManager;
import Domaene.DomainFacade;
import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeamId;
import Persistence.Department;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    public void addMemberToCompetitionTeam(ClubMember member, Competition competition, Team team, CompetitionTeamId competitionTeamId){
        facade.addMemberToCompetition(member, competition, team, competitionTeamId);
    }
    
    public void removeMemberFromCompetitioinTeam(String data){
        //TODO: use case remove Member from competition team
    }
    
    public void addResultsToCompetition(String data){
        //TODO: usecase add Results of a competition
    }
   
    public void showAllCompetitions(){
        //TODO: show all competitions
    }
    
    public void showCompetitionResults(Competition comp){
        //TODO: show competitions results
    }
    
    public void showAllTeamsOfCompetition(Competition comp){
        //TODO: show all teams of Competitions
    }
    
    public void showCompetitionTeamMembersOfCompetition(Competition comp){
        //TODO: show all member of a team participatig at a competition
    }
    
    public void showAllCompetitionMeetings(Competition comp){
        
    }
    
}
