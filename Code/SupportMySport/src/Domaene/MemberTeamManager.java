/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.PersistenceManager;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rafa
 */
public class MemberTeamManager {
    
    PersistenceManager persistenceManager;
    
    public MemberTeamManager(){
        persistenceManager = new PersistenceManager();
    }

    public List<ClubMember> getCompetitionTeamMembersOfCompetition(int competitionId) {
        String hqlQuerie = "FROM CompetitionTeam";
        List<Object> allCompetitionTeams = persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        List<ClubMember> allClubMembers = new LinkedList<ClubMember>();
        CompetitionTeam compTeam;
        for(Object obj : allCompetitionTeams){
            compTeam = (CompetitionTeam)obj;
            if(compTeam.getCompetition().getId() == competitionId){
                allClubMembers.add(compTeam.getClubMember());
            }
        }
        return allClubMembers;
    }
}
