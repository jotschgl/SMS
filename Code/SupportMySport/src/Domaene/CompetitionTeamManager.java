package Domaene;

import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.CompetitionTeamId;
import Persistence.Meeting;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.util.LinkedList;
import java.util.List;


public class CompetitionTeamManager {
   
    private PersistenceManager persistenceManager;
    
    public CompetitionTeamManager(){
        persistenceManager = new PersistenceManager();
    }
    
    public void addMemberToCompetition(CompetitionTeamId competitionTeamId,Team team,Competition competition, ClubMember member){
       CompetitionTeam ct = new CompetitionTeam(competitionTeamId, team, competition, member);
       persistenceManager.save(ct);
    }

    public void removeMemberFromCompetition(int memberId, int competitionId, int teamId) {
        String hqlQuerie = "FROM CompetitionTeam WHERE (clubMember_id = "+memberId+" AND competition_id = "+competitionId+" AND team_id = "+teamId+")";
        List<Object> cp =  persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        CompetitionTeam  ct = (CompetitionTeam) cp.get(0); 
        persistenceManager.delete(ct);
    }

    public List<Team> showAllTeamsOfCompetition(int competitionId) {
        Competition comp = (Competition) persistenceManager.getObjectById(Competition.class, competitionId);
        List<Team> allTeams = new LinkedList<Team>();
        for(CompetitionTeam compTeam : comp.getCompetitionTeams()){
            allTeams.add(compTeam.getTeam());
        }
        return allTeams;
    }
    
}
