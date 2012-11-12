/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author Dennis
 */
public class PersistenceManagerTest {
    
    private PersistenceManager mng;
    
    public PersistenceManagerTest() {
        mng = new PersistenceManager();
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
    public void testSave() {
        Rule rule = new Rule(0, 0, 0, 0);
        mng.save(rule);
    }

    @Ignore
    @Test
    public void testGetTeamMembers(){
        Team team = (Team)mng.getObjectById(Team.class, 1);
        System.out.println(team.getClubMembers().size());
        for(ClubMember cm : team.getClubMembers()){
            System.out.println(cm.getFirstname());
        }      
    }
    
    @Ignore
    @Test
    public void testSaveWithLinkedObjects(){
        System.out.println("* PersistenceManagerTest: testSaveWithLinkedObjects");
        PersistenceManager mng = new PersistenceManager();
        RoleRight right = (RoleRight)mng.getObjectById(RoleRight.class, 3);
        FunctionRole f = new FunctionRole(right, "Admin 2");
        mng.save(f);
    }

    /**
     * Test of delete method, of class PersistenceManager.
     */

    @Ignore
    @Test
    public void testDelete() {
        System.out.println("* PersistenceManagerTest: testDelete");
        Rule rule = (Rule)mng.getObjectById(Rule.class, 9);
        mng.delete(rule);
    }

    /**
     * Test of update method, of class PersistenceManager.
     */
    @Ignore
    @Test
    public void testUpdate() {
        System.out.println("* PersistenceManagerTest: testUpdate");
        List sport = mng.getObjectsByHQLQuery("from Sport where name = 'Seilziehen'");
        Sport sp = (Sport)sport.get(0);
        sp.setName("Tauziehen");
        mng.update(sp);
    }

    /**
     * Test of getObjectById method, of class PersistenceManager.
     */
    @Ignore
    @Test
    public void testGetObjectById() {
        System.out.println("* PersistenceManagerTest: testGetObjectById");
        Federation fed = (Federation)mng.getObjectById(Federation.class, 3);
        System.out.println(fed.getName());
        System.out.println(fed.getWebsite());
    }

    /**
     * Test of getObjectsByHQLQuery method, of class PersistenceManager.
     */
    @Ignore
    @Test
    public void testGetObjectsByHQLQuery() {
        System.out.println("* PersistenceManagerTest: testGetObjectByHQLQuery");
        String hqlQuery = "from ClubMember where firstname = 'Dennis'";
        List result = mng.getObjectsByHQLQuery(hqlQuery);
        ClubMember mem = (ClubMember)result.get(0);
        System.out.println(mem.getLastname());
    }
    @Ignore
    @Test
    public void testShowAllTeamsOfCompetition(){
        System.out.println("* PersistenceManagerTest: testHQLQuerieShowAllTeamsOfCompetition");
        Competition comp = (Competition) mng.getObjectById(Competition.class, 1);
        for(CompetitionTeam t : comp.getCompetitionTeams()){
            System.out.println(t.getTeam().getName());
        }
    }
    
    @Test
    public void testHqlQuerie(){
        System.out.println("* PersistenceManagerTest: testHQLQuerie");
        List result = mng.getObjectsByHQLQuery("From Department");
        System.out.println(result.size());
    }
}
