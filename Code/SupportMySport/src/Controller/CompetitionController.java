package Controller;

import Domaene.DomainFacade;
import Persistence.*;
import java.rmi.RemoteException;
import java.util.Collection;

public class CompetitionController {

    DomainFacade domainFacade;

    public CompetitionController() {
        domainFacade = new DomainFacade();
    }

    public void createNewCompetition(Competition competition) throws RemoteException {
        domainFacade.createNewCompetition(competition);
    }

    public void removeMemberFromCompetitionTeam(ClubMember member, Competition competition, Team team) throws RemoteException {
        domainFacade.removeMemberFromCompetition(member.getId(), competition.getId(), team.getId());
    }

    public void removeMemberFromCompetitionTeam(int memberId, int competitionId, int teamId) throws RemoteException {
        domainFacade.removeMemberFromCompetition(memberId, competitionId, teamId);
    }

    public Collection<Competition> getAllCompetitions() throws RemoteException {
        return domainFacade.getAllCompetitions();
    }

    public void addResultsToCompetitionMeeting(int TeamAId, int TeamBId, int pointsA, int pointsB, int competitionId) throws RemoteException {
        domainFacade.addResultsToCompetitionMeeting(TeamAId, TeamBId, pointsA, pointsB, pointsB, competitionId);
    }

    public Collection<Meeting> getCompetitionMeetings(int competitionId) throws RemoteException {
        return domainFacade.showCompetitionMeetings(competitionId);
    }

    public Collection<Team> getAllTeamsOfCompetition(int competitionId) throws RemoteException {
        return domainFacade.showAllTeamsOfCompetition(competitionId);
    }

    public Collection<ClubMember> getCompetitionTeamMembersOfCompetition(int competitionId) throws RemoteException {
        //TODO: this method
        return domainFacade.getCompetitionTeamMembersOfCompetition(competitionId);
    }

    public Collection<Department> getAllDepartments() throws RemoteException {
        return domainFacade.getAllDepartments();
    }

    public void createOrUpdateMeeting(Meeting meeting) {
        domainFacade.createOrUpdateMeeting(meeting);
    }

    public Collection<Sport> getAllSports() {
        return domainFacade.getAllSports();
    }

    public Collection<Team> getAllTeams() {
        return domainFacade.getAllTeams();
    }

    public Collection<CompetitionTeam> getCompetitionData(int competitionID) {
        return domainFacade.getCompetitionData(competitionID);
    }

    public Collection<ClubMember> getAllClubMembersOfCompetitionTeam(int teamID, int competitionID) {
        return domainFacade.getAllClubMembersOfCompetitionTeam(teamID, competitionID);
    }

    public Department getDepartmentOfLoggedInMember(int id) {
        return domainFacade.getDepartmentOfLoggedInMember(id);
    }

    public Collection<Sport> getSportsOfDepartment(Department d) {
        return domainFacade.getSportsOfDepartment(d);
    }

    public Collection<Competition> getCompetitionsOfDepartment(Department department) {
        return domainFacade.getCompetitionByDepartmentId(department.getId());
    }

    public void updateCompetition(Competition competition) {
        domainFacade.updateExistingCompetition(competition);
    }

    public void saveOrUpdateCompetitionTeams(Collection<CompetitionTeam> teams) {
        domainFacade.saveOrUpdateCompetitionTeams(teams);
    }

    public Competition getCompetitionByID(int id) {
        return domainFacade.getCompetitionById(id);
    }

    public void deleteMeeting(Meeting meeting) {
        domainFacade.deleteMeeting(meeting);
    }
}
