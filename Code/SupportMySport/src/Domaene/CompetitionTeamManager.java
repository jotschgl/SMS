/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
   
    public void createNewCompetitionTeam(CompetitionTeamId competitionTeamId,Team team,Competition competition, ClubMember member){
       CompetitionTeam ct = new CompetitionTeam(competitionTeamId, team, competition, member); 
       PersistenceManager persitenceManager = new PersistenceManager();
       persitenceManager.save(ct);
    }

    public void removeMemberFromCompetition(int memberId, int competitionId) {
        String hqlQuerie = "FROM CompetitionTeam ct WHERE (ct.clubMember_id = '"+memberId+"' AND ct.competition_id = '"+competitionId+"')";
        PersistenceManager persistenceManager = new PersistenceManager();
        CompetitionTeam cp = (CompetitionTeam) persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        persistenceManager.delete(cp);
    }

    List<Team> showAllTeamsOfCompetition(int competitionId) {
        List<Team> teamList = new LinkedList<Team>();
        String hqlQuerie = "FROM CompetitionTeam ct WHERE(ct.competition_id = '"+competitionId+"')";
        PersistenceManager persistenceManger = new PersistenceManager();
        List<Object> results = persistenceManger.getObjectsByHQLQuery(hqlQuerie);
        for(Object obj : results){
            int teamId = ((Meeting)obj).getId();
            Team team = (Team) persistenceManger.getObjectById(Team.class, teamId);
            if(team != null){
                teamList.add(team);
            }
        }
        return teamList;
    }
    
}
