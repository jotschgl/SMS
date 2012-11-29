/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Communication.JMS.InitialSubscritptionManager;
import Communication.JMS.InvitationPublisher;
import Communication.JMS.InvitationUnsubscribeManager;
import Communication.JMS.InvitationsSubscriber;
import Communication.JMS.NewMemberPublisher;
import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.CompetitionDTO;
import MessageInterfaces.IMessageCollector;
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
    private InitialSubscritptionManager initSubManager;
    private InvitationPublisher invitManager;
    private InvitationsSubscriber invitSubscriber;

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
    
    // <editor-fold defaultstate="collapsed" desc="JMS Specific Calls">
    public void initializeSubscriber(String connectionFactroyName, String topicConnectionName, String subScriberId) {
       new InitialSubscritptionManager().initialSubscription(connectionFactroyName, topicConnectionName, subScriberId);
    }
    public void sendInvitations(String connectionFactroyName, String topicConnectionName, CompetitionDTO compDTO){
       new InvitationPublisher().publishMessages(connectionFactroyName, topicConnectionName, compDTO);
    }
    public void sendNewMemberMessage(String connectionFactroyName, String topicConnectionName, ClubMemberDTO clubMemberDTO){
        new NewMemberPublisher().publishMessages(connectionFactroyName, topicConnectionName, clubMemberDTO);
    }
    public void listenForInvitations(String connectionFactoryName, String topicName, String ClientId, IMessageCollector mc){
        new InvitationsSubscriber().listenForInvitations(connectionFactoryName, topicName, ClientId, mc);
    }
    public void unsubscribeSubscriber(String connectionFactroyName, String topicConnectionName, String subScriberId){
        new InvitationUnsubscribeManager().unsubscribeSubscription(connectionFactroyName, topicConnectionName, subScriberId);
    }
    // </editor-fold>

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

    public Collection<ClubMember> getAllClubMembersOfCompetitionTeam(int teamID, int competitionID) {
        return competitionTeamManager.getAllClubMembersOfCompetitionTeam(teamID, competitionID);
    }

    public ClubMember getClubmemberByUserName(String username) {
        return clubMemberManager.getClubmemberByUserName(username);
    }

    public Department getDepartmentOfLoggedInChief(int id) {
        return departmentManager.getDepartmentOfLoggedInChief(id);
    }

    public Collection<Sport> getSportsOfDepartment(Department d) {
        return sportManager.getSportsOfDepartment(d);
    }

    public void saveOrUpdateCompetitionTeams(Collection<CompetitionTeam> teams) {
        competitionTeamManager.saveOrUpdateCompetitionTeams(teams);
    }

    public void deleteMeeting(Meeting meeting) {
        meetingManager.deleteMeeting(meeting);
    }

    public Collection<ClubMember> getAllTeamMembers(Team team) {
        return clubMemberManager.getAllTeamMembers(team);
    }

    public Collection<Team> getAllTeamsOfSport(int sportID) {
        return sportManager.getAllTeamsOfSport(sportID);
    }
    
    public Collection<Team> getAllTeamsOfDepartment(int departmentID){
        return departmentManager.getAllTeamsOfDepartment(departmentID);
    }

    public void updateTeam(Team teamToUpdate) {
        departmentManager.updateTeam(teamToUpdate);
    }
}
