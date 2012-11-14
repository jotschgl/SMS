/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Domaene.CompetitionTeamManager;
import Persistence.CompetitionTeam;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.util.Collection;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author rafa
 */
public class CompetitionTeamManagerTest {

    private CompetitionTeamManager compTeamManager;

    public CompetitionTeamManagerTest() {
        compTeamManager = new CompetitionTeamManager();
    }

    @Ignore
    @Test
    public void removeMemberFromCompetitionTest() {
        CompetitionTeamManager cpt = new CompetitionTeamManager();
        PersistenceManager pm = new PersistenceManager();
        int member = 30;
        int compId = 2;
        int teamId = 4;

        System.out.println("In removeMemberFromCompetitionTest");
        System.out.println("Removing member: " + member);
        System.out.println("Removing from competition: " + compId);
        System.out.println("In test removeMemberFromCompetitionTest");

        cpt.removeMemberFromCompetition(member, compId, teamId);

    }

    @Ignore
    @Test
    public void showAllTeamsOfCompetitionTest() {
        List<Team> list = compTeamManager.showAllTeamsOfCompetition(1);
        for (Team t : list) {
            System.out.println(t.getName());
        }
    }

    @Test
    public void testGetCompetitionData() {
        Collection<CompetitionTeam> result = compTeamManager.getCompetitionData(1);
        for (CompetitionTeam t : result) {
            System.out.println(t.getCompetition().getName());
            System.out.println(t.getTeam().getName());
            System.out.println(t.getClubMember().getLastname());
            System.out.println();
        }
    }
}
