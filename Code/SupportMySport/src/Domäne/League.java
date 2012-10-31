package Domäne;
// Generated 28.10.2012 20:58:08 by Hibernate Tools 3.2.1.GA

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

public class League implements java.io.Serializable {

    private Integer id;
    private Sport sport;
    private Federation federation;
    private String name;
    private Set<Team> teams = new HashSet<Team>(0);
    private Set<Team> teams_1 = new HashSet<Team>(0);

    public League() {
    }

    public League(Sport sport, Federation federation, String name) {
        this.sport = sport;
        this.federation = federation;
        this.name = name;
    }

    public League(Sport sport, Federation federation, String name, Set<Team> teams, Set<Team> teams_1) {
        this.sport = sport;
        this.federation = federation;
        this.name = name;
        this.teams = teams;
        this.teams_1 = teams_1;
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

    public Federation getFederation() {
        return this.federation;
    }

    public void setFederation(Federation federation) {
        this.federation = federation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public Set<Team> getTeams_1() {
        return this.teams_1;
    }

    public void setTeams_1(Set<Team> teams_1) {
        this.teams_1 = teams_1;
    }
}
