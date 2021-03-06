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

    public Department(ClubMember clubMember, String name, Set competitions, Set teams, Set sports) {
        this.clubMember = clubMember;
        this.name = name;
        this.competitions = competitions;
        this.teams = teams;
        this.sports = sports;
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
    @JoinColumn(name = "departmentChief_id", nullable = false)
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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "department")
    public Set<Competition> getCompetitions() {
        return this.competitions;
    }

    public void setCompetitions(Set<Competition> competitions) {
        this.competitions = competitions;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "department")
    public Set<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "department")
    public Set<Sport> getSports() {
        return this.sports;
    }

    public void setSports(Set<Sport> sports) {
        this.sports = sports;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Department other = (Department) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
}
