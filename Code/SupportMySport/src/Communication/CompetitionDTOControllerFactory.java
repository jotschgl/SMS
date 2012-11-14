/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.CompetitionTeamDTO;
import CommunicationInterfaces.DepartmentDTO;
import CommunicationInterfaces.ICompetitionDTOControllerFactory;
import CommunicationInterfaces.LeagueDTO;
import CommunicationInterfaces.MeetingDTO;
import CommunicationInterfaces.SportDTO;
import CommunicationInterfaces.TeamDTO;
import Controller.CompetitionController;
import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.Department;
import Persistence.League;
import Persistence.Meeting;
import Persistence.Sport;
import Persistence.Team;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dennis
 */
public class CompetitionDTOControllerFactory extends UnicastRemoteObject implements ICompetitionDTOControllerFactory {

    private CompetitionController competitionController;
    private DTOAssembler dtoAssembler;

    public CompetitionDTOControllerFactory() throws RemoteException {
        dtoAssembler = new DTOAssembler();
        competitionController = new CompetitionController();
    }

    @Override
    public void createNewCompetition(CompetitionDTO competitionDTO) throws RemoteException {
        competitionController.createNewCompetition(dtoAssembler.updateCompetitionEntity(competitionDTO));
    }

    @Override
    public Collection<DepartmentDTO> getAllDepartments() throws RemoteException {
        Collection<DepartmentDTO> allDepartments = new LinkedList<DepartmentDTO>();
        for (Department dep : competitionController.getAllDepartments()) {
            allDepartments.add(dtoAssembler.createDepartmentDTO(dep));
        }
        return allDepartments;
    }

    @Override
    public Collection<CompetitionDTO> getAllCompetitions() throws RemoteException {
        Collection<CompetitionDTO> allCompetitions = new LinkedList<CompetitionDTO>();
        for (Competition comp : competitionController.getAllCompetitions()) {
            allCompetitions.add(dtoAssembler.createCompetitonDTO(comp));
        }
        return allCompetitions;
    }

    @Override
    public Collection<MeetingDTO> getAllMeetingsOfCompetition(CompetitionDTO competition) throws RemoteException {
        Collection<MeetingDTO> allMeetings = new LinkedList<MeetingDTO>();
        for (Meeting meeting : competitionController.getCompetitionMeetings(competition.getId())) {
            allMeetings.add(dtoAssembler.createMeetingDTO(meeting, competition));
        }
        return allMeetings;
    }

    @Override
    public void createOrUpdateMeeting(MeetingDTO meeting) throws RemoteException {
        competitionController.createOrUpdateMeeting(dtoAssembler.updateMeetingEntity(meeting));
    }

    @Override
    public Collection<SportDTO> getAllSports() throws RemoteException {
        Collection<SportDTO> allSports = new LinkedList<SportDTO>();
        for (Sport sport : competitionController.getAllSports()) {
            allSports.add(dtoAssembler.createSportDTO(sport));
        }
        return allSports;
    }

    @Override
    public Collection<TeamDTO> getAllTeams() throws RemoteException {
        Collection<TeamDTO> allTeams = new LinkedList<TeamDTO>();
        for (Team team : competitionController.getAllTeams()) {
            allTeams.add(dtoAssembler.createTeamDTO(team));
        }
        return allTeams;
    }

    @Override
    public DepartmentDTO getDepartmentOfLoggedInDepartmentChief(ClubMemberDTO loggedInMember) throws RemoteException {
        Department d = competitionController.getDepartmentOfLoggedInMember(loggedInMember.getId());
        return dtoAssembler.createDepartmentDTO(d);
    }

    @Override
    public Collection<SportDTO> getSportsOfDepartment(DepartmentDTO dto) throws RemoteException {
        Department d = new Department();
        d.setId(dto.getId());
        Collection<Sport> c = competitionController.getSportsOfDepartment(d);
        LinkedList<SportDTO> c2 = new LinkedList<SportDTO>();
        for (Sport s : c) {
            c2.add(dtoAssembler.createSportDTO(s));
        }
        return c2;
    }

    @Override
    public Collection<CompetitionDTO> getCompetitionsOfDepartmentOfLoggedInMember(ClubMemberDTO member) throws RemoteException {
        Collection<Competition> comps = competitionController.getCompetitionsOfDepartment(competitionController.getDepartmentOfLoggedInMember(member.getId()));
        LinkedList<CompetitionDTO> compsDTO = new LinkedList<CompetitionDTO>();
        for (Competition competition : comps) {
            compsDTO.add(dtoAssembler.createCompetitonDTO(competition));
        }
        return compsDTO;
    }

    @Override
    public void updateCompetition(CompetitionDTO competition) throws RemoteException {
        competitionController.updateCompetition(dtoAssembler.updateCompetitionEntity(competition));
    }

    @Override
    public void saveOrUpdateCompetitionTeams(Collection<CompetitionTeamDTO> teams) throws RemoteException {
        competitionController.saveOrUpdateCompetitionTeams(dtoAssembler.saveOrUpdateCompetitionTeams(teams));
    }

    @Override
    public CompetitionDTO getCompetitionByID(int id) throws RemoteException {
        return dtoAssembler.createCompetitonDTO(competitionController.getCompetitionByID(id));
    }

    @Override
    public void deleteMeeting(MeetingDTO meeting) throws RemoteException {
        competitionController.deleteMeeting(dtoAssembler.updateMeetingEntity(meeting));
    }
}
