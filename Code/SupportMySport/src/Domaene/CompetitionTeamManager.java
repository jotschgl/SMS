/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.CompetitionTeamId;
import Persistence.PersistenceManager;
import Persistence.Team;


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
    
}
