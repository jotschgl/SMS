/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Dennis
 */
public class DomainFacade {

    private ClubMemberManager clubMemberManager;
    private CompetitionManager competitionManager;
    private CompetitionTeamManager competitionTeamManager;
    private MeetingManager meetingManager;
    private MemberTeamManager memberTeamManager;
    private DepartmentManager departmentManager;
    private SportManager sportManager;
    private TeamManager teamManager;

    public DomainFacade() {
        clubMemberManager = new ClubMemberManager();
        competitionManager = new CompetitionManager();
        competitionTeamManager = new CompetitionTeamManager();
        meetingManager = new MeetingManager();
        memberTeamManager = new MemberTeamManager();
        departmentManager = new DepartmentManager();
        sportManager = new SportManager();
        teamManager = new TeamManager();

    }

    // <editor-fold defaultstate="collapsed" desc="ClubMember Specific Calls">
    public Collection<ClubMember> getAllClubMembers() {
        return clubMemberManager.getAllClubMembers();
    }

    public void createOrUpdateClubMember(ClubMember clubMember) {
        clubMemberManager.createOrUpdateClubMember(clubMember);
    }

    public Collection<Persistence.ClubMember> searchMemberByAttributes(String attributes) {
        return clubMemberManager.searchMembersByAttributes(attributes);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Competition Specific Calls">
    public Competition getCompetitionById(int id) {
        return competitionManager.getCompetitinById(id);
    }

    public Collection<Competition> getCompetitionsByName(String name) {
        return competitionManager.getCompetitionsByName(name);
    }

    public Collection<Competition> getCompetitionByDepartmentId(int departmentId) {
        return competitionManager.getCompetitionByDepartmentId(departmentId);
    }

    public Collection<Competition> getCompetitionByDate(Date startdate) {
        return competitionManager.getCompetitionByDate(startdate);
    }

    public Collection<Competition> getAllCompetitionsBetweenPeriod(Date startdate, Date enddate) {
        return competitionManager.getAllCompetitionsBetweenPeriod(startdate, enddate);
    }

    public Collection<Competition> getAllCompetitions() {
        return competitionManager.getAllCompetitions();
    }

    public void createNewCompetition(Competition competition) {
        competitionManager.createNewCompetition(competition);
    }

    public void updateExistingCompetition(Competition competition) {
        competitionManager.updateExistingCompetition(competition);
    }

    public void addMemberToCompetition(ClubMember member, Competition competition, Team team, CompetitionTeamId competitionTeamId) {
        competitionTeamManager.addMemberToCompetition(competitionTeamId, team, competition, member);
    }

    public void removeMemberFromCompetition(int memberId, int competitionId, int teamId) {
        competitionTeamManager.removeMemberFromCompetition(memberId, competitionId, teamId);

    }

    public void addResultsToCompetitionMeeting(int teamAId, int teamBId, int pointsA, int pointsB, int pointsB0, int competitionId) {
        meetingManager.addResultsToCompetitionMeeting(teamAId, teamBId, pointsA, pointsB, competitionId);
    }

    public Collection<Meeting> showCompetitionMeetings(int competitionId) {
        return meetingManager.showCompetitionMeetings(competitionId);
    }

    public Collection<Team> showAllTeamsOfCompetition(int competitionId) {
        return competitionTeamManager.showAllTeamsOfCompetition(competitionId);
    }
    // </editor-fold>

    public Collection<ClubMember> getCompetitionTeamMembersOfCompetition(int competitionId) {
        return memberTeamManager.getCompetitionTeamMembersOfCompetition(competitionId);
    }

    public Collection<Department> getAllDepartments() {
        return departmentManager.getAllDepartments();
    }

    public void createOrUpdateMeeting(Meeting meeting) {
        meetingManager.createOrUpdateMeeting(meeting);
    }

    public Collection<Sport> getAllSports() {
        return sportManager.getAllSports();
    }

    public Collection<Team> getAllTeams() {
        return teamManager.getAllTeams();
    }

    public Collection<CompetitionTeam> getCompetitionData(int competitionID) {
        return competitionTeamManager.getCompetitionData(competitionID);
    }

    public Collection<FunctionRole> getAllRoles() {
        return clubMemberManager.getAllRoles();
    }
    
    public Collection<ClubMember> getAllClubMembersOfCompetitionTeam(int teamID, int competitionID){
        return competitionTeamManager.getAllClubMembersOfCompetitionTeam(teamID,competitionID);
    }
}
