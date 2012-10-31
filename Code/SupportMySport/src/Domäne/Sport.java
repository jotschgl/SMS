package Domäne;
// Generated 28.10.2012 20:58:08 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

public class Sport implements java.io.Serializable {

    private Integer id;
    private Department department;
    private Rule rule;
    private String name;
    private Set<League> leagues = new HashSet<League>(0);
    private Set<Team> teams = new HashSet<Team>(0);

    public Sport() {
    }

    public Sport(Department department, Rule rule, String name) {
        this.department = department;
        this.rule = rule;
        this.name = name;
    }

    public Sport(Department department, Rule rule, String name, Set<League> leagues, Set<Team> teams) {
        this.department = department;
        this.rule = rule;
        this.name = name;
        this.leagues = leagues;
        this.teams = teams;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Rule getRule() {
        return this.rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<League> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }

    public Set<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
}
