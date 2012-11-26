/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.CompetitionTeamDTO;
import CommunicationInterfaces.DepartmentDTO;
import CommunicationInterfaces.FederationDTO;
import CommunicationInterfaces.FunctionRoleDTO;
import CommunicationInterfaces.LeagueDTO;
import CommunicationInterfaces.MeetingDTO;
import CommunicationInterfaces.RoleRightDTO;
import CommunicationInterfaces.RuleDTO;
import CommunicationInterfaces.SportDTO;
import CommunicationInterfaces.TeamDTO;
import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.Department;
import Persistence.Federation;
import Persistence.FunctionRole;
import Persistence.League;
import Persistence.Meeting;
import Persistence.PersistenceManager;
import Persistence.RoleRight;
import Persistence.Rule;
import Persistence.Sport;
import Persistence.Team;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Dennis
 */
public class DTOAssemblerTest {
    
    public DTOAssemblerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createDepartmentDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateDepartmentDTO() {
        System.out.println("createDepartmentDTO");
        Department department = null;
        DTOAssembler instance = new DTOAssembler();
        DepartmentDTO expResult = null;
        DepartmentDTO result = instance.createDepartmentDTO(department);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createClubMemberDTO method, of class DTOAssembler.
     */
    @Test
    public void testCreateClubMemberDTO() {
        System.out.println("testCreateClubMemberDTO");
        PersistenceManager perMng = new PersistenceManager();
        ClubMember clubMemberEntity = (ClubMember) perMng.getObjectById(ClubMember.class, 50);
        DTOAssembler instance = new DTOAssembler();
        ClubMemberDTO result = instance.createClubMemberDTO(clubMemberEntity);
        System.out.println(result.getSport().getName());
    }

    /**
     * Test of createCompetitonDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateCompetitonDTO() {
        System.out.println("createCompetitonDTO");
        Competition competition = null;
        DTOAssembler instance = new DTOAssembler();
        CompetitionDTO expResult = null;
        CompetitionDTO result = instance.createCompetitonDTO(competition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTeamDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateTeamDTO() {
        System.out.println("createTeamDTO");
        Team team = null;
        DTOAssembler instance = new DTOAssembler();
        TeamDTO expResult = null;
        TeamDTO result = instance.createTeamDTO(team);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMeetingDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateMeetingDTO() {
        System.out.println("createMeetingDTO");
        Meeting meeting = null;
        CompetitionDTO competition = null;
        DTOAssembler instance = new DTOAssembler();
        MeetingDTO expResult = null;
        MeetingDTO result = instance.createMeetingDTO(meeting, competition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createRuleDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateRuleDTO() {
        System.out.println("createRuleDTO");
        Rule rule = null;
        DTOAssembler instance = new DTOAssembler();
        RuleDTO expResult = null;
        RuleDTO result = instance.createRuleDTO(rule);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSportDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateSportDTO() {
        System.out.println("createSportDTO");
        Sport sport = null;
        DTOAssembler instance = new DTOAssembler();
        SportDTO expResult = null;
        SportDTO result = instance.createSportDTO(sport);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createCompetitionTeamDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateCompetitionTeamDTO() {
        System.out.println("createCompetitionTeamDTO");
        CompetitionTeam compTeam = null;
        CompetitionDTO compDTO = null;
        DTOAssembler instance = new DTOAssembler();
        CompetitionTeamDTO expResult = null;
        CompetitionTeamDTO result = instance.createCompetitionTeamDTO(compTeam, compDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createRoleRightDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateRoleRightDTO() {
        System.out.println("createRoleRightDTO");
        RoleRight roleRight = null;
        DTOAssembler instance = new DTOAssembler();
        RoleRightDTO expResult = null;
        RoleRightDTO result = instance.createRoleRightDTO(roleRight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createFunctionRoleDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateFunctionRoleDTO() {
        System.out.println("createFunctionRoleDTO");
        FunctionRole role = null;
        DTOAssembler instance = new DTOAssembler();
        FunctionRoleDTO expResult = null;
        FunctionRoleDTO result = instance.createFunctionRoleDTO(role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateClubMemberEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateClubMemberEntity() {
        System.out.println("updateClubMemberEntity");
        ClubMemberDTO clubMemberDTO = null;
        DTOAssembler instance = new DTOAssembler();
        ClubMember expResult = null;
        ClubMember result = instance.updateClubMemberEntity(clubMemberDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDepartmentEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateDepartmentEntity() {
        System.out.println("updateDepartmentEntity");
        DepartmentDTO departmentDTO = null;
        DTOAssembler instance = new DTOAssembler();
        Department expResult = null;
        Department result = instance.updateDepartmentEntity(departmentDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCompetitionEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateCompetitionEntity() {
        System.out.println("updateCompetitionEntity");
        CompetitionDTO competitionDTO = null;
        DTOAssembler instance = new DTOAssembler();
        Competition expResult = null;
        Competition result = instance.updateCompetitionEntity(competitionDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTeamEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateTeamEntity() {
        System.out.println("updateTeamEntity");
        TeamDTO teamDTO = null;
        DTOAssembler instance = new DTOAssembler();
        Team expResult = null;
        Team result = instance.updateTeamEntity(teamDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMeetingEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateMeetingEntity() {
        System.out.println("updateMeetingEntity");
        MeetingDTO meetingDTO = null;
        Competition competition = null;
        DTOAssembler instance = new DTOAssembler();
        Meeting expResult = null;
        Meeting result = instance.updateMeetingEntity(meetingDTO, competition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRuleEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateRuleEntity() {
        System.out.println("updateRuleEntity");
        RuleDTO ruleDTO = null;
        DTOAssembler instance = new DTOAssembler();
        Rule expResult = null;
        Rule result = instance.updateRuleEntity(ruleDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFunctionRoleEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateFunctionRoleEntity() {
        System.out.println("updateFunctionRoleEntity");
        FunctionRoleDTO functionRoleDTO = null;
        DTOAssembler instance = new DTOAssembler();
        FunctionRole expResult = null;
        FunctionRole result = instance.updateFunctionRoleEntity(functionRoleDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRoleRightEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateRoleRightEntity() {
        System.out.println("updateRoleRightEntity");
        RoleRightDTO roleDTO = null;
        DTOAssembler instance = new DTOAssembler();
        RoleRight expResult = null;
        RoleRight result = instance.updateRoleRightEntity(roleDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSportEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateSportEntity() {
        System.out.println("updateSportEntity");
        SportDTO sportDTO = null;
        DTOAssembler instance = new DTOAssembler();
        Sport expResult = null;
        Sport result = instance.updateSportEntity(sportDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createLeagueDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateLeagueDTO() {
        System.out.println("createLeagueDTO");
        League league = null;
        SportDTO sportDTO = null;
        DTOAssembler instance = new DTOAssembler();
        LeagueDTO expResult = null;
        LeagueDTO result = instance.createLeagueDTO(league, sportDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createFederationDTO method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testCreateFederationDTO() {
        System.out.println("createFederationDTO");
        Federation federation = null;
        DTOAssembler instance = new DTOAssembler();
        FederationDTO expResult = null;
        FederationDTO result = instance.createFederationDTO(federation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLeagueEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateLeagueEntity() {
        System.out.println("updateLeagueEntity");
        LeagueDTO leagueDTO = null;
        SportDTO sportDTO = null;
        DTOAssembler instance = new DTOAssembler();
        League expResult = null;
        League result = instance.updateLeagueEntity(leagueDTO, sportDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFederationEntity method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testUpdateFederationEntity() {
        System.out.println("updateFederationEntity");
        FederationDTO federationDTO = null;
        DTOAssembler instance = new DTOAssembler();
        Federation expResult = null;
        Federation result = instance.updateFederationEntity(federationDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrUpdateCompetitionTeams method, of class DTOAssembler.
     */
    @Ignore
    @Test
    public void testSaveOrUpdateCompetitionTeams() {
        System.out.println("saveOrUpdateCompetitionTeams");
        Collection<CompetitionTeamDTO> teamsDTO = null;
        DTOAssembler instance = new DTOAssembler();
        Collection expResult = null;
        Collection result = instance.saveOrUpdateCompetitionTeams(teamsDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
