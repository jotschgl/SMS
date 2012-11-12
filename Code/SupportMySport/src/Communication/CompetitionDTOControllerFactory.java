/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.CompetitionTeamDTO;
import CommunicationInterfaces.DepartmentDTO;
import CommunicationInterfaces.ICompetitionDTOControllerFactory;
import CommunicationInterfaces.MeetingDTO;
import CommunicationInterfaces.SportDTO;
import CommunicationInterfaces.TeamDTO;
import Controller.CompetitionController;
import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.Department;
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
            allMeetings.add(dtoAssembler.createMeetingDTO(meeting,competition));
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
    public Collection<CompetitionTeamDTO> getTeamsAndClubMembersOfCompetition(int competitionID) throws RemoteException {
        Collection<CompetitionTeamDTO> allCompetitionTeams = new LinkedList<CompetitionTeamDTO>();
        Collection<CompetitionTeam> allCompetitionTeamsOfCompetition = competitionController.getCompetitionData(competitionID);
        HashMap<Team, LinkedList<ClubMember>> map = new HashMap<Team, LinkedList<ClubMember>>();
        for (CompetitionTeam compTeam : allCompetitionTeamsOfCompetition) {
            if (map.containsKey(compTeam.getTeam())) {
                map.get(compTeam.getTeam()).add(compTeam.getClubMember());
            } else {
                map.put(compTeam.getTeam(), new LinkedList<ClubMember>());
                map.get(compTeam.getTeam()).add(compTeam.getClubMember());
            }
        }
        for (Team team : map.keySet()) {
            allCompetitionTeams.add(dtoAssembler.createCompetitionTeamDTO(team, map.get(team)));
        }
        return allCompetitionTeams;
    }
}
