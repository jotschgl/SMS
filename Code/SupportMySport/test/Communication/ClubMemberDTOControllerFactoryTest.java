/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.FunctionRoleDTO;
import CommunicationInterfaces.SportDTO;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Dennis
 */
public class ClubMemberDTOControllerFactoryTest {
    
    private ClubMemberDTOControllerFactory instance;
    private RoleDTOControllerFactory roleInstance;
    private CompetitionDTOControllerFactory compInstance;
    
    public ClubMemberDTOControllerFactoryTest() {
        try {
            instance = new ClubMemberDTOControllerFactory();
            roleInstance = new RoleDTOControllerFactory();
        } catch (RemoteException ex) {
            Logger.getLogger(ClubMemberDTOControllerFactoryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createOrUpdateClubMember method, of class ClubMemberDTOControllerFactory.
     */
    @Ignore
    @Test
    public void testCreateOrUpdateClubMemberWithoutRoleCreateNewMember() throws Exception {
        System.out.println("* ClubMemberDTOControllerFactoryTest: testCreateOrUpdateClubMemberWithoutRoleCreateNewMember");
        ClubMemberDTO clubMemberDTO = new ClubMemberDTO("Hans", "Wurst", "hanwur", "StreetOne", "CityOne", "CountryOne", "6807", "one@one.com", "11111", 'm', new Date());
        instance.createOrUpdateClubMember(clubMemberDTO);
    }

    @Ignore
    @Test
    public void testAddFunctionRoleToClubMember() throws Exception {
        System.out.println("* ClubMemberDTOControllerFactoryTest: testAddFunctionRoleToClubMember");
        LinkedList<ClubMemberDTO> allClubMembers = (LinkedList<ClubMemberDTO>)instance.getAllClubMembers();
        LinkedList<FunctionRoleDTO> allFunctionRoles = (LinkedList<FunctionRoleDTO>)roleInstance.getAllRoles();
        FunctionRoleDTO role = allFunctionRoles.get(3);
        ClubMemberDTO clubMem = allClubMembers.getFirst();
        LinkedList<FunctionRoleDTO> allClubMemberRoles = (LinkedList<FunctionRoleDTO>) clubMem.getAllFunctionRolesOfClubMember();
        allClubMemberRoles.remove();
        allClubMemberRoles.add(role);
        instance.createOrUpdateClubMember(clubMem);
    }
    
    @Ignore
    @Test
    public void testGetAllFunctionRolesOfClubMember() throws Exception{
        System.out.println("* ClubMemberDTOControllerFactoryTest: testGetAllFunctionRolesOfClubMember");
        ClubMemberDTO curClubMember;
        Collection result = instance.getAllClubMembers();
        for(Object obj : result){
            curClubMember = (ClubMemberDTO)obj;
            System.out.println(curClubMember.getLastname());
            for(FunctionRoleDTO frdto : curClubMember.getAllFunctionRolesOfClubMember()){
                System.out.print(frdto.getName());
                System.out.print(": ");
                System.out.println(frdto.getRoleRight().getName());
            }
            System.out.println();
        }
    }
    
    
    @Ignore
    @Test
    public void testCreateOrUpdateClubMemberWithoutRoleUpdateMember() throws Exception{
        System.out.println("* ClubMemberDTOControllerFactoryTest: testCreateOrUpdateClubMemberWithoutRoleUpdateMember");
        ClubMemberDTO curClubMember;
        Collection result = instance.getAllClubMembers();
        StringBuilder builder = new StringBuilder();
        for(Object res : result){
            curClubMember = (ClubMemberDTO)res;
            builder.append(curClubMember.getFirstname());
            builder.append(".");
            builder.append(curClubMember.getLastname());
            builder.append("@fhv.at");
            curClubMember.setMail((builder.toString()));
            instance.createOrUpdateClubMember(curClubMember);
            builder.setLength(0);
        }
        
    }
    
    @Ignore
    @Test
    public void testGetAllClubMembers() throws Exception {
        System.out.println("* ClubMemberDTOControllerFactoryTest: getAllClubMembers");
        ClubMemberDTO curClubMember;
        Collection result = instance.getAllClubMembers();
        for(Object res : result){
            curClubMember = (ClubMemberDTO)res;
            System.out.println(curClubMember.getFirstname());
        }
    }
    
    @Test
    public void testAddSportToClubMember() throws RemoteException{
        System.out.println("* ClubMemberDTOControllerFactoryTest: testAddSportToClubMember");
        Collection<ClubMemberDTO> allClubMems = instance.getAllClubMembers();
        LinkedList<SportDTO> allSports = (LinkedList<SportDTO>) compInstance.getAllSports();
        for(ClubMemberDTO clubMem : allClubMems){
            if(clubMem.getLastname().equals("Bushido")){
                clubMem.setSport(allSports.getFirst());
                instance.createOrUpdateClubMember(clubMem);
            }
        }
    }
}
