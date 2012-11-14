/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 *
 * @author Dennis
 */
public interface ICompetitionDTOControllerFactory extends Remote {

    public void createNewCompetition(CompetitionDTO competitionDTO) throws RemoteException;

    public Collection<DepartmentDTO> getAllDepartments() throws RemoteException;

    public Collection<CompetitionDTO> getAllCompetitions() throws RemoteException;

    public Collection<MeetingDTO> getAllMeetingsOfCompetition(CompetitionDTO competition) throws RemoteException;

    public void createOrUpdateMeeting(MeetingDTO meeting) throws RemoteException;

    public Collection<SportDTO> getAllSports() throws RemoteException;

    public Collection<TeamDTO> getAllTeams() throws RemoteException;

    public DepartmentDTO getDepartmentOfLoggedInDepartmentChief(ClubMemberDTO loggedInMember) throws RemoteException;

    public Collection<SportDTO> getSportsOfDepartment(DepartmentDTO d) throws RemoteException;

    public Collection<CompetitionDTO> getCompetitionsOfDepartmentOfLoggedInMember(ClubMemberDTO member) throws RemoteException;

    public void updateCompetition(CompetitionDTO competition) throws RemoteException;

    public void saveOrUpdateCompetitionTeams(Collection<CompetitionTeamDTO> teams) throws RemoteException;

    public CompetitionDTO getCompetitionByID(int id) throws RemoteException;

    public void deleteMeeting(MeetingDTO meeting) throws RemoteException;
}
