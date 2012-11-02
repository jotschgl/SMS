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
         int id = 1;
         CompetitionManager mng = new CompetitionManager();
         Competition testComp = mng.getCompetitinById(id);
         System.out.println();
         System.out.println("Running test on getCompetition by ID");
         System.out.println("Getting Competition with id: " + id);
         System.out.println("Competition with id: " + testComp.getId());
         System.out.println();
        
    }
}
