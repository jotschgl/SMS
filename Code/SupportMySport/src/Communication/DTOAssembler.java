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
import Controller.CompetitionController;
import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.Department;
import Persistence.Federation;
import Persistence.FunctionRole;
import Persistence.League;
import Persistence.Meeting;
import Persistence.RoleRight;
import Persistence.Rule;
import Persistence.Sport;
import Persistence.Team;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import sun.security.jgss.spi.MechanismFactory;

/**
 *
 * @author Dennis
 */
public class DTOAssembler {

    private CompetitionController competitionController = new CompetitionController();

    public DepartmentDTO createDepartmentDTO(Department department) {
        DepartmentDTO departmentDTO = new DepartmentDTO(createClubMemberDTO(department.getClubMember()), department.getName());
        departmentDTO.setId(department.getId());
        return departmentDTO;
    }

    public ClubMemberDTO createClubMemberDTO(ClubMember clubMemberEntity) {
        Collection<FunctionRoleDTO> allRoles = new LinkedList<FunctionRoleDTO>();
        for (FunctionRole role : clubMemberEntity.getFunctionRoles()) {
            allRoles.add(createFunctionRoleDTO(role));
        }
        ClubMemberDTO clubMemberDTO = new ClubMemberDTO(clubMemberEntity.getFirstname(), clubMemberEntity.getLastname(), clubMemberEntity.getUsername(), clubMemberEntity.getStreet(), clubMemberEntity.getCity(), clubMemberEntity.getCountry(), clubMemberEntity.getZip(), clubMemberEntity.getEmail(), clubMemberEntity.getPhone(), clubMemberEntity.getGender(), clubMemberEntity.getBirthday(), allRoles);
        clubMemberDTO.setId(clubMemberEntity.getId());
        return clubMemberDTO;
    }

    public CompetitionDTO createCompetitonDTO(Competition competition) {
        CompetitionDTO competitionDTO = new CompetitionDTO(createDepartmentDTO(competition.getDepartment()), competition.getName(), competition.getCompetitionfee(), competition.getDateOfCompetition());
        competitionDTO.setId(competition.getId());
        for (Meeting meet : competition.getMeetings()) {
            competitionDTO.addMeetingToCompetition(createMeetingDTO(meet, competitionDTO));
        }
        for(CompetitionTeam compTeam : competition.getCompetitionTeams()){
            competitionDTO.addTeamToCompetition(createCompetitionTeamDTO(compTeam,competitionDTO));
        }
        return competitionDTO; 
//        HashMap<Team, LinkedList<ClubMember>> competitionTeamClubMember = new HashMap<Team, LinkedList<ClubMember>>();
//        for (CompetitionTeam compTeam : competition.getCompetitionTeams()) {
//            if (!competitionTeamClubMember.containsKey(compTeam.getTeam())) {
//                competitionTeamClubMember.put(compTeam.getTeam(), new LinkedList<ClubMember>());
//                for (ClubMember clubMember : competitionController.getAllClubMembersOfCompetitionTeam(compTeam.getTeam().getId(), compTeam.getCompetition().getId())) {
//                    competitionTeamClubMember.get(compTeam.getTeam()).add(clubMember);
//                }
//            }
//        }
//        for (Team t : competitionTeamClubMember.keySet()) {
//            competitionDTO.addTeamToCompetition(createCompetitionTeamDTO(t, competitionTeamClubMember.get(t)));
//        }
    }

    public TeamDTO createTeamDTO(Team team) {
        TeamDTO teamDTO = new TeamDTO(team.getName());
        teamDTO.setId(team.getId());
        return teamDTO;
    }

    public MeetingDTO createMeetingDTO(Meeting meeting, CompetitionDTO competition) {
        MeetingDTO meetingDTO = new MeetingDTO(competition, createTeamDTO(meeting.getTeamByTeamAId()), createTeamDTO(meeting.getTeamByTeamBId()));
        meetingDTO.setPointsA(meeting.getPointsA());
        meetingDTO.setPointsB(meeting.getPointsB());
        meetingDTO.setId(meeting.getId());
        return meetingDTO;
    }

    public RuleDTO createRuleDTO(Rule rule) {
        RuleDTO ruleDTO = new RuleDTO(rule.getNrplayer(), rule.getPointswin(), rule.getPointsdraw(), rule.getPointswin());
        ruleDTO.setId(rule.getId());
        return ruleDTO;
    }

    public SportDTO createSportDTO(Sport sport) {
        SportDTO sportDTO = new SportDTO(sport.getName(), createDepartmentDTO(sport.getDepartment()), createRuleDTO(sport.getRule()));
        sportDTO.setId(sport.getId());
        Collection<League> leagues = sport.getLeagues();
        LinkedList<LeagueDTO> dtos = new LinkedList<LeagueDTO>();
        for (League league : leagues) {
            dtos.add(createLeagueDTO(league));
        }
        sportDTO.setLeagues(dtos);
        return sportDTO;
    }

    public CompetitionTeamDTO createCompetitionTeamDTO(CompetitionTeam compTeam, CompetitionDTO compDTO) {
        CompetitionTeamDTO compTeamDTO = new CompetitionTeamDTO(createTeamDTO(compTeam.getTeam()), compDTO);
        if(compTeam.getClubMember() != null){
            compTeamDTO.setClubMember(createClubMemberDTO(compTeam.getClubMember()));
        }
        compTeamDTO.setId(compTeam.getId());
        return compTeamDTO;
    }

    public RoleRightDTO createRoleRightDTO(RoleRight roleRight) {
        RoleRightDTO roleRightDTO = new RoleRightDTO(roleRight.getName());
        roleRightDTO.setId(roleRight.getId());
        return roleRightDTO;
    }

    public FunctionRoleDTO createFunctionRoleDTO(FunctionRole role) {
        FunctionRoleDTO funcDTO = new FunctionRoleDTO(createRoleRightDTO(role.getRoleRight()), role.getName());
        funcDTO.setId(role.getId());
        return funcDTO;
    }

    public ClubMember updateClubMemberEntity(ClubMemberDTO clubMemberDTO) {

        Set<FunctionRole> allRoles = new HashSet<FunctionRole>();
        for (FunctionRoleDTO funcDTO : clubMemberDTO.getAllFunctionRolesOfClubMember()) {
            allRoles.add(updateFunctionRoleEntity(funcDTO));
        }
        ClubMember clubMember = new ClubMember(clubMemberDTO.getFirstname(), clubMemberDTO.getLastname(), clubMemberDTO.getUsername(), clubMemberDTO.getStreet(), clubMemberDTO.getCity(), clubMemberDTO.getCountry(), clubMemberDTO.getZip(), clubMemberDTO.getMail(), clubMemberDTO.getPhone(), clubMemberDTO.getGender(), clubMemberDTO.getBirthday());
        clubMember.setFunctionRoles(allRoles);
        //Check if client created a completely new ClubMemberDTO
        if (clubMemberDTO.getId() != -1) {
            clubMember.setId(clubMemberDTO.getId());
        }
        return clubMember;
    }

    public Department updateDepartmentEntity(DepartmentDTO departmentDTO) {
        Department dep = new Department(updateClubMemberEntity(departmentDTO.getDepartmentChief()), departmentDTO.getDepartmentName());
        if (departmentDTO.getId() != -1) {
            dep.setId(departmentDTO.getId());
        }
        return dep;
    }

    public Competition updateCompetitionEntity(CompetitionDTO competitionDTO) {
        Competition comp = new Competition(updateDepartmentEntity(competitionDTO.getDepartment()), competitionDTO.getName(), competitionDTO.getCompetitionfee(), competitionDTO.getDateOfCompetition());
        if (competitionDTO.getId() != -1) {
            comp.setId(competitionDTO.getId());
        }
        Set allMeetings = new HashSet();
        for(MeetingDTO meeting : competitionDTO.getAllCompetitionMeetings()){
            allMeetings.add(updateMeetingEntity(meeting));
        }
        comp.setMeetings(allMeetings);
        Set allCompetitionTeams = new HashSet();
        for(CompetitionTeamDTO compTeamDTO : competitionDTO.getAllTeamsOfCompetition()){
            CompetitionTeam team = new CompetitionTeam(updateTeamEntity(compTeamDTO.getTeam()), comp, null);
            if(compTeamDTO.getClubMember() != null){
                team.setClubMember(updateClubMemberEntity(compTeamDTO.getClubMember()));
            }
            if(compTeamDTO.getId() != -1){
                team.setId(compTeamDTO.getId());
            }
            allCompetitionTeams.add(team);
        }
        comp.setCompetitionTeams(allCompetitionTeams);
        return comp;
    }
    
    public Team updateTeamEntity(TeamDTO teamDTO) {
        Team team = new Team(teamDTO.getTeamName());
        if (teamDTO.getId() != -1) {
            team.setId(teamDTO.getId());
        }
        return team;
    }

    public Meeting updateMeetingEntity(MeetingDTO meetingDTO) {
        Meeting meeting = new Meeting(updateCompetitionEntity(meetingDTO.getCompetition()), updateTeamEntity(meetingDTO.getTeamByTeamAId()), updateTeamEntity(meetingDTO.getTeamByTeamBId()));
        meeting.setPointsA(meetingDTO.getPointsA());
        meeting.setPointsB(meetingDTO.getPointsB());
        if (meetingDTO.getId() != -1) {
            meeting.setId(meetingDTO.getId());
        }
        return meeting;
    }

    public Rule updateRuleEntity(RuleDTO ruleDTO) {
        Rule rule = new Rule(ruleDTO.getNumberOfPlayers(), ruleDTO.getPointswin(), ruleDTO.getPointsdraw(), ruleDTO.getPointslose());
        if (ruleDTO.getId() != -1) {
            rule.setId(ruleDTO.getId());
        }
        return rule;
    }

    public FunctionRole updateFunctionRoleEntity(FunctionRoleDTO functionRoleDTO) {
        FunctionRole functionRole = new FunctionRole(updateRoleRightEntity(functionRoleDTO.getRoleRight()), functionRoleDTO.getName());
        if (functionRoleDTO.getId() != -1) {
            functionRole.setId(functionRoleDTO.getId());
        }
        return functionRole;
    }

    public RoleRight updateRoleRightEntity(RoleRightDTO roleDTO) {
        RoleRight roleRight = new RoleRight(roleDTO.getName());
        if (roleDTO.getId() != -1) {
            roleRight.setId(roleDTO.getId());
        }
        return roleRight;
    }

    public Sport updateSportEntity(SportDTO sportDTO) {
        Sport sport = new Sport(updateDepartmentEntity(sportDTO.getDepartment()), updateRuleEntity(sportDTO.getRule()), sportDTO.getName());
        if (sportDTO.getId() != -1) {
            sport.setId(sportDTO.getId());
        }
        return sport;
    }

    public LeagueDTO createLeagueDTO(League l) {
        LeagueDTO dto = new LeagueDTO();
        dto.setFederation(this.createFederationDTO(l.getFederation()));
        dto.setId(l.getId());
        dto.setName(l.getName());
        return dto;
    }

    public FederationDTO createFederationDTO(Federation federation) {
        FederationDTO dto = new FederationDTO();
        dto.setId(federation.getId());
        dto.setName(federation.getName());
        dto.setWebsite(federation.getWebsite());
        return dto;
    }

    Collection<CompetitionTeam> saveOrUpdateCompetitionTeams(Collection<CompetitionTeamDTO> teamsDTO) {
        Collection<CompetitionTeam> teams = new LinkedList<CompetitionTeam>();
        for (CompetitionTeamDTO team : teamsDTO) {
            CompetitionTeam newTeam = new CompetitionTeam();
            newTeam.setCompetition(updateCompetitionEntity(team.getCompetition()));
            newTeam.setTeam(updateTeamEntity(team.getTeam()));
            teams.add(newTeam);
            //TODO ID
        }
        return teams;
    }
}