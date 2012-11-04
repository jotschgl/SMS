package Persistence;
// Generated 28.10.2012 20:58:08 by Hibernate Tools 3.2.1.GA

import Persistence.interfaces.IDepartment;
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
import javax.persistence.UniqueConstraint;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name = "Department", catalog = "c1teamf", uniqueConstraints =
@UniqueConstraint(columnNames = "name"))
public class Department implements IDepartment {

    private Integer id;
    private ClubMember departmentChief;
    private String name;
    private Set<Competition> competitions = new HashSet<Competition>(0);
    private Set<Team> teams = new HashSet<Team>(0);
    private Set<Sport> sports = new HashSet<Sport>(0);

    public Department() {
    }

    public Department(ClubMember clubMember, String name) {
        this.departmentChief = clubMember;
        this.name = name;
    }

    public Department(ClubMember clubMember, String name, Set<Competition> competitions, Set<Team> teams, Set<Sport> sports) {
        this.departmentChief = clubMember;
        this.name = name;
        this.competitions = competitions;
        this.teams = teams;
        this.sports = sports;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departmentChief_id", nullable = false)
    @Override
    public ClubMember getClubMember() {
        return this.departmentChief;
    }

    @Override
    public void setClubMember(ClubMember clubMember) {
        this.departmentChief = clubMember;
    }

    @Column(name = "name", unique = true, nullable = false, length = 45)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
    @Override
    public Set<Competition> getCompetitions() {
        return this.competitions;
    }

    @Override
    public void setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
    @Override
    public Set<Team> getTeams() {
        return this.teams;
    }

    @Override
    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
    @Override
    public Set<Sport> getSports() {
        return this.sports;
    }

    @Override
    public void setSports(Set<Sport> sports) {
        this.sports = sports;
    }
}
