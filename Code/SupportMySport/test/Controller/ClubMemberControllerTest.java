/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Domaene.DomainFacade;
import Persistence.ClubMember;
import java.util.List;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Dennis
 */
public class ClubMemberControllerTest {
    
    private ClubMemberController clubMemberController;
    
    public ClubMemberControllerTest() {
        clubMemberController = new ClubMemberController(new DomainFacade());
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createOrUpdateClubMember method, of class ClubMemberController.
     */
    @Ignore
    @Test
    public void testCreateOrUpdateClubMember() {
        System.out.println("* ClubMemberControllerTest: testCreateOrUpdateClubMember");
        //Not yet tested
    }

    /**
     * Test of getAllClubMembers method, of class ClubMemberController.
     */
    @Test
    public void testGetAllClubMembers() {
        System.out.println("* ClubMemberControllerTest: testGetAllClubMembers");
        List<ClubMember> result = clubMemberController.getAllClubMembers();
        System.out.println("Anzahl gefundener ClubMembers: " + result.size());
        for(ClubMember cm : result){
            System.out.println(cm.getLastname());
        }
    }

    /**
     * Test of searchMemberByAttributes method, of class ClubMemberController.
     */
    @Test
    public void testSearchMemberByAttributes() {
        System.out.println("* ClubMemberControllerTest: testSearchMemberByAttributes");
        String attributes = "a";
        List<ClubMember> result = clubMemberController.searchMemberByAttributes(attributes);
        System.out.println("Anzahl gefundener ClubMembers: " + result.size());
        for(ClubMember cm : result){
            System.out.println(cm.getLastname());
        }
    }
}
