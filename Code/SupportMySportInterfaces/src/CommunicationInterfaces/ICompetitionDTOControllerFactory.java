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
public interface ICompetitionDTOControllerFactory extends Remote{
    
    public void createNewCompetition(CompetitionDTO competitionDTO) throws RemoteException;
    
    public Collection<DepartmentDTO> getAllDepartments() throws RemoteException;
    
    public Collection<CompetitionDTO> getAllCompetitions() throws RemoteException;
    
    public Collection<MeetingDTO> getAllMeetingsOfCompetition(CompetitionDTO competition) throws RemoteException;
    
    public void createOrUpdateMeeting(MeetingDTO meeting) throws RemoteException;
    
    public Collection<SportDTO> getAllSports() throws RemoteException;
    
    public Collection<TeamDTO> getAllTeams() throws RemoteException;
    
     public Collection<CompetitionTeamDTO> getTeamsAndClubMembersOfCompetition(int competitionID) throws RemoteException;
    
}
