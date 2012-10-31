package Domäne;

import java.util.HashSet;
import java.util.Set;

public class Department implements java.io.Serializable {

    private Integer id;
    private ClubMember clubMember;
    private String name;
    private Set<Competition> competitions = new HashSet<Competition>(0);
    private Set<Team> teams = new HashSet<Team>(0);
    private Set<Sport> sports = new HashSet<Sport>(0);

    public Department() {
    }

    public Department(ClubMember clubMember, String name) {
        this.clubMember = clubMember;
        this.name = name;
    }

    public Department(ClubMember clubMember, String name, Set<Competition> competitions, Set<Team> teams, Set<Sport> sports) {
        this.clubMember = clubMember;
        this.name = name;
        this.competitions = competitions;
        this.teams = teams;
        this.sports = sports;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Set<Competition> getCompetitions() {
        return this.competitions;
    }

    public void setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }

    public Set<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public Set<Sport> getSports() {
        return this.sports;
    }

    public void setSports(Set<Sport> sports) {
        this.sports = sports;
    }
}
