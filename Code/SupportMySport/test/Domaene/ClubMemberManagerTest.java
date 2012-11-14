/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.ClubMember;
import Persistence.Department;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johannes
 */
public class ClubMemberManagerTest {

    public ClubMemberManagerTest() {
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

    @Test
    public void testGetAllTeamMembers() {
        try {
            System.out.println("getAllTeamMembers");
            PersistenceManager pm = new PersistenceManager();
            Team team = (Team) pm.getObjectById(Team.class, 2);
            ClubMemberManager cmm = new ClubMemberManager();
            Collection<ClubMember> members = cmm.getAllTeamMembers(team);
            for (ClubMember clubMember : members) {
                System.out.println(clubMember.getFirstname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
