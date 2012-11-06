package Controller;

import Controller.interfaces.ICompetitionController;
import Domaene.DomainFacade;
import Persistence.*;
import Persistence.interfaces.IDepartment;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class CompetitionController extends UnicastRemoteObject implements ICompetitionController {

    DomainFacade facade;

    public CompetitionController() throws RemoteException {
        super();
        facade = new DomainFacade();
    }

    @Override
    public void createNewCompetition(IDepartment dep, String competitionName, double fee, Date date) throws RemoteException {
        facade.createNewCompetition(new Competition((Department) dep, competitionName, fee, date));
    }

    @Override
    public void createNewCompetition(Competition competition) throws RemoteException {
        facade.createNewCompetition(competition);
    }

    @Override
    public void addMemberToCompetitionTeam(ClubMember member, Competition competition, Team team, CompetitionTeamId competitionTeamId) throws RemoteException {
        facade.addMemberToCompetition(member, competition, team, competitionTeamId);
    }

    @Override
    public void removeMemberFromCompetitionTeam(ClubMember member, Competition competition, Team team) throws RemoteException {
        facade.removeMemberFromCompetition(member.getId(), competition.getId(), team.getId());
    }

    @Override
    public void removeMemberFromCompetitionTeam(int memberId, int competitionId, int teamId) throws RemoteException {
        facade.removeMemberFromCompetition(memberId, competitionId, teamId);
    }

    @Override
    public Collection<Competition> getAllCompetitions() throws RemoteException {
        return facade.getAllCompetitions();
    }

    @Override
    public void addResultsToCompetitionMeeting(int TeamAId, int TeamBId, int pointsA, int pointsB, int competitionId) throws RemoteException {
        facade.addResultsToCompetitionMeeting(TeamAId, TeamBId, pointsA, pointsB, pointsB, competitionId);
    }

    @Override
    public Collection<Meeting> getCompetitionMeetings(int competitionId) throws RemoteException {
        return facade.showCompetitionMeetings(competitionId);
    }

    @Override
    public Collection<Team> getAllTeamsOfCompetition(int competitionId) throws RemoteException {
        return facade.showAllTeamsOfCompetition(competitionId);
    }

    @Override
    public Collection<ClubMember> getCompetitionTeamMembersOfCompetition(int competitionId) throws RemoteException {
        //TODO: this method
        return facade.getCompetitionTeamMembersOfCompetition(competitionId);
    }

    @Override
    public Collection<IDepartment> getAllDepartments() throws RemoteException {
        return facade.getAllDepartments();
    }
}
