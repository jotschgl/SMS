/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Domaene.CompetitionManager;
import Domaene.CompetitionTeamManager;
import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeamId;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author rafa
 */
public class CompetitionTeamManagerTest {
    
    
    
    @Test
    public void addMemberToCompetitionTest(){
        //test passed
        //CompetitionTeamManager cpt = new CompetitionTeamManager();
        //PersistenceManager pm = new PersistenceManager();
        
        //CompetitionTeamId compTeamId = new CompetitionTeamId(2, 4);
        //Team team = (Team)pm.getObjectById(Team.class, 4);
        ///Competition comp = (Competition)pm.getObjectById(Competition.class, 4);
        //lubMember member = (ClubMember)pm.getObjectById(ClubMember.class, 30);
        
        //System.out.println("In test addMemberToCompetitionTest");
        //System.out.println("Adding member: " + member.getId());
        //System.out.println("Adding to competition: " + comp.getName());
        //System.out.println("Widh the id: " + comp.getId());
        
        //cpt.addMemberToCompetition(compTeamId, team, comp, member);
        
    }
    
    @Test
    public void removeMemberFromCompetitionTest(){
        //test passed
        //CompetitionTeamManager cpt = new CompetitionTeamManager();
        //PersistenceManager pm = new PersistenceManager();
        //int member = 30;
        //int compId = 2;
        //int teamId = 4;
        
        //System.out.println("In removeMemberFromCompetitionTest");
        //System.out.println("Removing member: " + member);
        //System.out.println("Removing from competition: " + compId);
        //System.out.println("In test removeMemberFromCompetitionTest");
        
        //cpt.removeMemberFromCompetition(member, compId, teamId);
        
    }
    
    @Test
    public void showAllTeamsOfCompetitionTest(){
        //TODO: test this method when the showAllTeamsOfCompetition works correct
       CompetitionTeamManager cpt = new CompetitionTeamManager();
       List<Team> list = cpt.showAllTeamsOfCompetition(3);
    }
}
