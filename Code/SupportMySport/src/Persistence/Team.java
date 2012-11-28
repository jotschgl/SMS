package Persistence;
// Generated 11.11.2012 20:07:48 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Team generated by hbm2java
 */
@Entity
@Table(name = "Team", catalog = "c1teamf", uniqueConstraints =
@UniqueConstraint(columnNames = "name"))
public class Team implements java.io.Serializable {

    private Integer id;
    private Sport sport;
    private League league;
    private Department department;
    private ClubMember clubMember;
    private String name;
    private Set<ClubMember> clubMembers = new HashSet<ClubMember>(0);
//    private Set<Meeting> meetingsForTeamAId = new HashSet<Meeting>(0);
    private Set<CompetitionTeam> competitionTeams = new HashSet<CompetitionTeam>(0);
//    private Set<Meeting> meetingsForTeamBId = new HashSet<Meeting>(0);
    private Set<League> leagues = new HashSet<League>(0);

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public Team(Sport sport, League league, Department department, ClubMember clubMember, String name, Set clubMembers, Set meetingsForTeamAId, Set competitionTeams, Set meetingsForTeamBId, Set leagues) {
        this.sport = sport;
        this.league = league;
        this.department = department;
        this.clubMember = clubMember;
        this.name = name;
        this.clubMembers = clubMembers;
//        this.meetingsForTeamAId = meetingsForTeamAId;
        this.competitionTeams = competitionTeams;
//        this.meetingsForTeamBId = meetingsForTeamBId;
        this.leagues = leagues;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sport_id")
    public Sport getSport() {
        return this.sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "league_id")
    public League getLeague() {
        return this.league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "trainer_id")
    public ClubMember getClubMember() {
        return this.clubMember;
    }

    public void setClubMember(ClubMember clubMember) {
        this.clubMember = clubMember;
    }

    @Column(name = "name", unique = true, nullable = false, length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "MemberTeam", catalog = "c1teamf", joinColumns = {
        @JoinColumn(name = "team_id")}, inverseJoinColumns = {
        @JoinColumn(name = "clubMember_id")})
    public Set<ClubMember> getClubMembers() {
        return this.clubMembers;
    }

    public void setClubMembers(Set<ClubMember> clubMembers) {
        this.clubMembers = clubMembers;
    }

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "teamByTeamAId")
//    public Set<Meeting> getMeetingsForTeamAId() {
//        return this.meetingsForTeamAId;
//    }
//
//    public void setMeetingsForTeamAId(Set<Meeting> meetingsForTeamAId) {
//        this.meetingsForTeamAId = meetingsForTeamAId;
//    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "team")
    public Set<CompetitionTeam> getCompetitionTeams() {
        return this.competitionTeams;
    }

    public void setCompetitionTeams(Set<CompetitionTeam> competitionTeams) {
        this.competitionTeams = competitionTeams;
    }

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "teamByTeamBId")
//    public Set<Meeting> getMeetingsForTeamBId() {
//        return this.meetingsForTeamBId;
//    }
//
//    public void setMeetingsForTeamBId(Set<Meeting> meetingsForTeamBId) {
//        this.meetingsForTeamBId = meetingsForTeamBId;
//    }
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "TeamLeague", catalog = "c1teamf", joinColumns = {
        @JoinColumn(name = "team_id", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "league_id", nullable = false, updatable = false)})
    public Set<League> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
