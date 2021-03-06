/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Controller.CompetitionController;
import Persistence.Competition;
import Persistence.Department;
import Persistence.Meeting;
import Persistence.Sport;
import Persistence.Team;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.LinkedList;
import javax.annotation.ManagedBean;
import javax.ejb.Stateful;

/**
 *
 * @author Dennis
 */
@Stateful
public class CompetitionDTOControllerFactory  implements CompetitionDTOControllerFactoryRemote {

    private CompetitionController competitionController;
    private DTOAssembler dtoAssembler;

    public CompetitionDTOControllerFactory()  {
        dtoAssembler = new DTOAssembler();
        competitionController = new CompetitionController();
    }

    @Override
    public void createNewCompetition(CompetitionDTO competitionDTO)  {
        competitionController.createNewCompetition(dtoAssembler.updateCompetitionEntity(competitionDTO));
    }

    @Override
    public Collection<DepartmentDTO> getAllDepartments()  {
        Collection<DepartmentDTO> allDepartments = new LinkedList<DepartmentDTO>();
        for (Department dep : competitionController.getAllDepartments()) {
            allDepartments.add(dtoAssembler.createDepartmentDTO(dep));
        }
        return allDepartments;
    }

    @Override
    public Collection<CompetitionDTO> getAllCompetitions()  {
        Collection<CompetitionDTO> allCompetitions = new LinkedList<CompetitionDTO>();
        for (Competition comp : competitionController.getAllCompetitions()) {
            allCompetitions.add(dtoAssembler.createCompetitonDTO(comp));
        }
        return allCompetitions;
    }

    @Override
    public Collection<MeetingDTO> getAllMeetingsOfCompetition(CompetitionDTO competition)  {
        Collection<MeetingDTO> allMeetings = new LinkedList<MeetingDTO>();
        for (Meeting meeting : competitionController.getCompetitionMeetings(competition.getId())) {
            allMeetings.add(dtoAssembler.createMeetingDTO(meeting, competition));
        }
        return allMeetings;
    }

    @Override
    public Collection<SportDTO> getAllSports()  {
        Collection<SportDTO> allSports = new LinkedList<SportDTO>();
        for (Sport sport : competitionController.getAllSports()) {
            allSports.add(dtoAssembler.createSportDTO(sport));
        }
        return allSports;
    }

    @Override
    public Collection<TeamDTO> getAllTeams()  {
        Collection<TeamDTO> allTeams = new LinkedList<TeamDTO>();
        for (Team team : competitionController.getAllTeams()) {
            allTeams.add(dtoAssembler.createTeamDTO(team));
        }
        return allTeams;
    }

    @Override
    public DepartmentDTO getDepartmentOfLoggedInDepartmentChief(ClubMemberDTO loggedInMember)  {
        Department d = competitionController.getDepartmentOfLoggedInChief(loggedInMember.getId());
        DepartmentDTO retVal = dtoAssembler.createDepartmentDTO(d);
        return retVal;
    }

    @Override
    public Collection<SportDTO> getSportsOfDepartment(DepartmentDTO dto)  {
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
    public void updateCompetition(CompetitionDTO competition)  {
        competitionController.updateCompetition(dtoAssembler.updateCompetitionEntity(competition));
    }

    @Override
    public void saveOrUpdateCompetitionTeams(Collection<CompetitionTeamDTO> teams)  {
        competitionController.saveOrUpdateCompetitionTeams(dtoAssembler.saveOrUpdateCompetitionTeams(teams));
    }

    @Override
    public CompetitionDTO getCompetitionByID(int id)  {
        return dtoAssembler.createCompetitonDTO(competitionController.getCompetitionByID(id));
    }

    @Override
    public Collection<TeamDTO> getAllTeamsOfSport(int sportID)  {
        Collection<TeamDTO> allTeamDTOsOfSport = new LinkedList<TeamDTO>();
        for (Team team : competitionController.getAllTeamsOfSport(sportID)) {
            allTeamDTOsOfSport.add(dtoAssembler.createTeamDTO(team));
        }
        return allTeamDTOsOfSport;
    }

    @Override
    public Collection<CompetitionDTO> getCompetitionsOfDepartmentOfLoggedInDepartmentChief(DepartmentDTO department)  {
        Department retVal = dtoAssembler.updateDepartmentEntity(department);

        Collection<Competition> comps = competitionController.getCompetitionsOfDepartment(retVal);
        LinkedList<CompetitionDTO> compsDTO = new LinkedList<CompetitionDTO>();
        for (Competition competition : comps) {
            compsDTO.add(dtoAssembler.createCompetitonDTO(competition));
        }
        return compsDTO;
    }
}
