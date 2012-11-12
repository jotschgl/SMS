/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Persistence.ClubMember;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
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
         clubMemberController = new ClubMemberController();
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
        try
        {
            System.out.println("* ClubMemberControllerTest: testGetAllClubMembers");
            Collection<ClubMember> result = clubMemberController.getAllClubMembers();
            System.out.println("Anzahl gefundener ClubMembers: " + result.size());
            for(ClubMember cm : result){
                System.out.println(cm.getLastname());
            }
        }
        catch (RemoteException ex)
        {
            Logger.getLogger(ClubMemberControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of searchMemberByAttributes method, of class ClubMemberController.
     */
    @Test
    public void testSearchMemberByAttributes() {
        try
        {
            System.out.println("* ClubMemberControllerTest: testSearchMemberByAttributes");
            String attributes = "a";
            Collection<ClubMember> result = clubMemberController.searchMemberByAttributes(attributes);
            System.out.println("Anzahl gefundener ClubMembers: " + result.size());
            for(ClubMember cm : result){
                System.out.println(cm.getLastname());
            }
        }
        catch (RemoteException ex)
        {
            Logger.getLogger(ClubMemberControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
