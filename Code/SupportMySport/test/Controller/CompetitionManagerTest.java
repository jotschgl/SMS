/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Domaene.CompetitionManager;
import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.PersistenceManager;
import Persistence.Rule;
import Persistence.Team;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

public class CompetitionManagerTest {
    
   
    
    public CompetitionManagerTest () {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class PersistenceManager.
     */

    @Ignore
    @Test
    public void testGetCompetitinById(){
        //Team team = (Team)mng.getObjectById(Team.class, 1);
        //System.out.println(team.getClubMembers().size());
        //for(ClubMember cm : team.getClubMembers()){
       //     System.out.println(cm.getFirstname());
        //}
         CompetitionManager mng = new CompetitionManager();
         Competition testComp = mng.getCompetitinById(1);
    }
}
