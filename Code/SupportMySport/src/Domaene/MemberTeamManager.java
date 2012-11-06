/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.Meeting;
import Persistence.PersistenceManager;
import Persistence.Team;
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

    public List<ClubMember> getCompetitionTeamMembersOfCompetition(List<Team> teams) {
        //Competition comp = (Competition) persistenceManager.getObjectById(Competition.class, competitionId);
        
        //List<ClubMember> members = new LinkedList<ClubMember>();
        //for(CompetitionTeam compTeam : comp.getCompetitionTeams()){
        //    members.addAll(compTeam.getTeam().getClubMembers());
        //}
        return null;
    }
}
