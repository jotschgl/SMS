package Domäne;

import java.util.HashSet;
import java.util.Set;

public class Team implements java.io.Serializable {

    private Integer id;
    private Sport sport;
    private League league;
    private Department department;
    private ClubMember clubMember;
    private String name;
    private Set<ClubMember> clubMembers = new HashSet<ClubMember>(0);
    private Set<Meeting> meetingsForTeamAId = new HashSet<Meeting>(0);
    private Set<CompetitionTeam> competitionTeams = new HashSet<CompetitionTeam>(0);
    private Set<Meeting> meetingsForTeamBId = new HashSet<Meeting>(0);
    private Set<League> leagues = new HashSet<League>(0);

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public Team(Sport sport, League league, Department department, ClubMember clubMember, String name, Set<ClubMember> clubMembers, Set<Meeting> meetingsForTeamAId, Set<CompetitionTeam> competitionTeams, Set<Meeting> meetingsForTeamBId, Set<League> leagues) {
        this.sport = sport;
        this.league = league;
        this.department = department;
        this.clubMember = clubMember;
        this.name = name;
        this.clubMembers = clubMembers;
        this.meetingsForTeamAId = meetingsForTeamAId;
        this.competitionTeams = competitionTeams;
        this.meetingsForTeamBId = meetingsForTeamBId;
        this.leagues = leagues;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Sport getSport() {
        return this.sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public League getLeague() {
        return this.league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ClubMember getClubMember() {
        return this.clubMember;
    }

    public void setClubMember(ClubMember clubMember) {
        this.clubMember = clubMember;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ClubMember> getClubMembers() {
        return this.clubMembers;
    }

    public void setClubMembers(Set<ClubMember> clubMembers) {
        this.clubMembers = clubMembers;
    }

    public Set<Meeting> getMeetingsForTeamAId() {
        return this.meetingsForTeamAId;
    }

    public void setMeetingsForTeamAId(Set<Meeting> meetingsForTeamAId) {
        this.meetingsForTeamAId = meetingsForTeamAId;
    }

    public Set<CompetitionTeam> getCompetitionTeams() {
        return this.competitionTeams;
    }

    public void setCompetitionTeams(Set<CompetitionTeam> competitionTeams) {
        this.competitionTeams = competitionTeams;
    }

    public Set<Meeting> getMeetingsForTeamBId() {
        return this.meetingsForTeamBId;
    }

    public void setMeetingsForTeamBId(Set<Meeting> meetingsForTeamBId) {
        this.meetingsForTeamBId = meetingsForTeamBId;
    }

    public Set<League> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }
}
