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
import org.junit.Ignore;

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

    @Ignore
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

    @Ignore
    @Test
    public void testGetAllClubMembers() {
        System.out.println("testGetAllClubMembers");
        ClubMemberManager mng = new ClubMemberManager();
        for (ClubMember mem : mng.getAllClubMembers()) {
            System.out.println(mem.getLastname());
            if (mem.getSport() != null) {
                System.out.println(mem.getSport().getName());
            }
        }
    }
}
