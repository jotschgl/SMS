package Controller;

import Domaene.DomainFacade;
import Persistence.*;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;

public class CompetitionController {

    DomainFacade domainFacade;

    public CompetitionController() {
        domainFacade = new DomainFacade();
    }

    public void createNewCompetition(Competition competition) {
        domainFacade.createNewCompetition(competition);
    }

    public void removeMemberFromCompetitionTeam(ClubMember member, Competition competition, Team team) {
        domainFacade.removeMemberFromCompetition(member.getId(), competition.getId(), team.getId());
    }

    public void removeMemberFromCompetitionTeam(int memberId, int competitionId, int teamId) {
        domainFacade.removeMemberFromCompetition(memberId, competitionId, teamId);
    }

    public Collection<Competition> getAllCompetitions() {
        return domainFacade.getAllCompetitions();
    }

    public void addResultsToCompetitionMeeting(int TeamAId, int TeamBId, int pointsA, int pointsB, int competitionId) {
        domainFacade.addResultsToCompetitionMeeting(TeamAId, TeamBId, pointsA, pointsB, pointsB, competitionId);
    }

    public Collection<Meeting> getCompetitionMeetings(int competitionId) {
        return domainFacade.showCompetitionMeetings(competitionId);
    }

    public Collection<Team> getAllTeamsOfCompetition(int competitionId) {
        return domainFacade.showAllTeamsOfCompetition(competitionId);
    }

    public Collection<ClubMember> getCompetitionTeamMembersOfCompetition(int competitionId) {
        //TODO: this method
        return domainFacade.getCompetitionTeamMembersOfCompetition(competitionId);
    }

    public Collection<Department> getAllDepartments() {
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

    public Department getDepartmentOfLoggedInChief(int id) {
        return domainFacade.getDepartmentOfLoggedInChief(id);
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

    public Collection<Team> getAllTeamsOfSport(int sportID) {
        return domainFacade.getAllTeamsOfSport(sportID);
    }
    
    public Collection<Competition> getCompetitionByDate(Date date){   
        return domainFacade.getCompetitionByDate(date);
    }
}
