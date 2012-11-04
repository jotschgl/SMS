package Controller;

import Controller.interfaces.ICompetitionController;
import Domaene.DomainFacade;
import Persistence.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.Date;

public class CompetitionController extends UnicastRemoteObject implements ICompetitionController
{
    DomainFacade facade;

    public CompetitionController() throws RemoteException
    {
        super();
        facade = new DomainFacade();
    }

    @Override
    public void createNewCompetition(Department dep, String competitionName, double fee, Date date) throws RemoteException
    {
        facade.createNewCompetition(new Competition(dep, competitionName, fee, date));
    }

    @Override
    public void createNewCompetition(Competition competition) throws RemoteException
    {
        facade.createNewCompetition(competition);
    }
    //TODO: write tests for these methods and check if they work properly

    @Override
    public void addMemberToCompetitionTeam(ClubMember member, Competition competition, Team team, CompetitionTeamId competitionTeamId) throws RemoteException
    {
        facade.addMemberToCompetition(member, competition, team, competitionTeamId);
    }

    @Override
    public void removeMemberFromCompetitionTeam(ClubMember member, Competition competition) throws RemoteException
    {
        facade.removeMemberFromCompetition(member.getId(), competition.getId());
    }

    @Override
    public void removeMemberFromCompetitionTeam(int memberId, int competitionId) throws RemoteException
    {
        facade.removeMemberFromCompetition(memberId, competitionId);
    }

    @Override
    public void addResultsToCompetitionMeeting(int TeamAId, int TeamBId, int pointsA, int pointsB, int competitionId) throws RemoteException
    {
        facade.addResultsToCompetitionMeeting(TeamAId, TeamBId, pointsA, pointsB, pointsB, competitionId);
    }

    @Override
    public Collection<Competition> getAllCompetitions() throws RemoteException
    {
        return facade.getAllCompetitions();
    }

    @Override
    public Collection<Meeting> getCompetitionMeetings(int competitionId) throws RemoteException
    {
        return facade.showCompetitionMeetings(competitionId);
    }

    @Override
    public Collection<Team> getAllTeamsOfCompetition(int competitionId) throws RemoteException
    {
        return facade.showAllTeamsOfCompetition(competitionId);
    }

    @Override
    public Collection<ClubMember> getCompetitionTeamMembersOfCompetition(int competitionId) throws RemoteException
    {
        return facade.getCompetitionTeamMembersOfCompetition(competitionId);
    }
}
