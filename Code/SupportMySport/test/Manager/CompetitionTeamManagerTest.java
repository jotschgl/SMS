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
import org.junit.Test;

/**
 *
 * @author rafa
 */
public class CompetitionTeamManagerTest {
    
    @Test
    public void testGetCompetitinById(){
         //int id = 1;
         //CompetitionManager mng = new CompetitionManager();
         //Competition testComp = mng.getCompetitinById(id);
         //System.out.println();
         //System.out.println("Running test on getCompetition by ID");
         //System.out.println("Getting Competition with id: " + id);
         //System.out.println("Returne Competition with id: " + testComp.getId());
         //System.out.println();
        
         System.out.println();
         CompetitionTeamManager ctMngr = new CompetitionTeamManager();
         PersistenceManager pm = new PersistenceManager();
         ClubMember clubmember = (ClubMember) pm.getObjectById(ClubMember.class, 30);
         CompetitionTeamId competitionTeamId = (CompetitionTeamId) pm.getObjectById(CompetitionTeamId.class, 1);
         Team team = (Team) pm.getObjectById(Team.class, 1);
         Competition competition = (Competition) pm.getObjectById(Competition.class, 3);
         ctMngr.createNewCompetitionTeam(competitionTeamId, team, competition, clubmember);
    }
}
