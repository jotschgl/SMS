/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Domaene.MemberTeamManager;
import Persistence.ClubMember;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Dennis
 */
public class CompetitionControllerTest {

    private MemberTeamManager memberTeamManager;

    public CompetitionControllerTest() {
        memberTeamManager = new MemberTeamManager();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testGetCompetitionTeamMembersOfCompetition() {
        Collection<ClubMember> allMember = memberTeamManager.getCompetitionTeamMembersOfCompetition(1);
        System.out.println(allMember.size());
        if (allMember.size() > 0) {
            for (ClubMember cm : allMember) {
                System.out.println(cm.getLastname());
            }
        }
    }
    
    
}
