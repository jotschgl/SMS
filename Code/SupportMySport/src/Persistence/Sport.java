package Persistence;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Sport generated by hbm2java
 */
@Entity
@Table(name = "Sport", catalog = "c1teamf")
public class Sport implements java.io.Serializable {

    private Integer id;
    private Department department;
    private Rule rule;
    private String name;
    private Set<League> leagues = new HashSet<>(0);
    private Set<Team> teams = new HashSet<>(0);

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

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rule_id", nullable = false)
    public Rule getRule() {
        return this.rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sport")
    public Set<League> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sport")
    public Set<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
}
