/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.ClubMember;
import Persistence.CompetitionTeam;
import Persistence.Department;
import Persistence.League;
import Persistence.Meeting;
import Persistence.Sport;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Johannes
 */
public interface ITeam extends Serializable
{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainer_id")
    ClubMember getClubMember();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "MemberTeam", catalog = "c1teamf", joinColumns =
    {
        @JoinColumn(name = "team_id", nullable = false, updatable = false)
    }, inverseJoinColumns =
    {
        @JoinColumn(name = "clubMember_id", nullable = false, updatable = false)
    })
    Set<ClubMember> getClubMembers();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "team")
    Set<CompetitionTeam> getCompetitionTeams();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    Department getDepartment();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "league_id")
    League getLeague();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "TeamLeague", catalog = "c1teamf", joinColumns =
    {
        @JoinColumn(name = "team_id", nullable = false, updatable = false)
    }, inverseJoinColumns =
    {
        @JoinColumn(name = "league_id", nullable = false, updatable = false)
    })
    Set<League> getLeagues();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "teamByTeamAId")
    Set<Meeting> getMeetingsForTeamAId();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "teamByTeamBId")
    Set<Meeting> getMeetingsForTeamBId();

    @Column(name = "name", unique = true, nullable = false, length = 45)
    String getName();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_id")
    Sport getSport();

    void setClubMember(ClubMember clubMember);

    void setClubMembers(Set<ClubMember> clubMembers);

    void setCompetitionTeams(Set<CompetitionTeam> competitionTeams);

    void setDepartment(Department department);

    void setId(Integer id);

    void setLeague(League league);

    void setLeagues(Set<League> leagues);

    void setMeetingsForTeamAId(Set<Meeting> meetingsForTeamAId);

    void setMeetingsForTeamBId(Set<Meeting> meetingsForTeamBId);

    void setName(String name);

    void setSport(Sport sport);
    
}
