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
   
    public void addMemberToCompetition(CompetitionTeamId competitionTeamId,Team team,Competition competition, ClubMember member){
       CompetitionTeam ct = new CompetitionTeam(competitionTeamId, team, competition, member);
       PersistenceManager persitenceManager = new PersistenceManager();
       persitenceManager.save(ct);
    }

    public void removeMemberFromCompetition(int memberId, int competitionId, int teamId) {
        String hqlQuerie = "FROM CompetitionTeam WHERE (clubMember_id = "+memberId+" AND competition_id = "+competitionId+" AND team_id = "+teamId+")";
        PersistenceManager persistenceManager = new PersistenceManager();
        List<Object> cp =  persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        CompetitionTeam  ct = (CompetitionTeam) cp.get(0); 
        persistenceManager.delete(ct);
    }

    public List<Team> showAllTeamsOfCompetition(int competitionId) {
        //TODO: Correct this method
        List<Team> teamList = new LinkedList<Team>();
        //"from Cat as cat left join cat.mate.kittens as kittens"
        //"FROM    user_activity AS ua  JOIN    session AS s ON ua.session_id = s.session_id" 
        String hqlQuerie = "FROM CompetitionTeam ct ,Team t WHERE ct.team_id = t.id";
        PersistenceManager persistenceManger = new PersistenceManager();
        List<Object> results = persistenceManger.getObjectsByHQLQuery(hqlQuerie);
        //for(Object obj : results){
        //   int teamId = ((Meeting)obj).getId();
        //    Team team = (Team) persistenceManger.getObjectById(Team.class, teamId);
        //    if(team != null){
        //        teamList.add(team);
        //    }
        //}
        return teamList;
    }
    
}
