/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.interfaces;

import Persistence.*;
import Persistence.interfaces.IDepartment;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Johannes
 */
public interface ICompetitionController extends Remote
{
    void addMemberToCompetitionTeam(ClubMember member, Competition competition, Team team, CompetitionTeamId competitionTeamId) throws RemoteException;

    void addResultsToCompetitionMeeting(int TeamAId, int TeamBId, int pointsA, int pointsB, int competitionId) throws RemoteException;

    void createNewCompetition(Department dep, String competitionName, double fee, Date date) throws RemoteException;

    void createNewCompetition(Competition competition) throws RemoteException;

    Collection<Competition> getAllCompetitions() throws RemoteException;

    Collection<Team> getAllTeamsOfCompetition(int competitionId) throws RemoteException;

    Collection<Meeting> getCompetitionMeetings(int competitionId) throws RemoteException;

    Collection<ClubMember> getCompetitionTeamMembersOfCompetition(int competitionId) throws RemoteException;

    void removeMemberFromCompetitionTeam(ClubMember member, Competition competition,Team team) throws RemoteException;

    void removeMemberFromCompetitionTeam(int memberId, int competitionId, int teamId) throws RemoteException;
    
    Collection<IDepartment> getAllDepartments();
}
