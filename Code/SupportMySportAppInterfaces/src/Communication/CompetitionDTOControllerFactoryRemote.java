/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Dennis
 */
@Remote
public interface CompetitionDTOControllerFactoryRemote {

    public void createNewCompetition(CompetitionDTO competitionDTO);

    public Collection<DepartmentDTO> getAllDepartments();

    public Collection<CompetitionDTO> getAllCompetitions();

    public Collection<MeetingDTO> getAllMeetingsOfCompetition(CompetitionDTO competition);

    public Collection<SportDTO> getAllSports();

    public Collection<TeamDTO> getAllTeams();

    public DepartmentDTO getDepartmentOfLoggedInDepartmentChief(ClubMemberDTO loggedInMember);

    public Collection<SportDTO> getSportsOfDepartment(DepartmentDTO d);

    public Collection<CompetitionDTO> getCompetitionsOfDepartmentOfLoggedInDepartmentChief(DepartmentDTO department);

    public void updateCompetition(CompetitionDTO competition);

    public void saveOrUpdateCompetitionTeams(Collection<CompetitionTeamDTO> teams);

    public CompetitionDTO getCompetitionByID(int id);

    public Collection<TeamDTO> getAllTeamsOfSport(int sportID);

    List<CompetitionDTO> getCompetitionByDate(Date date);
}
