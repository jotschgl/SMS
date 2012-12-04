package Persistence;
// Generated 11.11.2012 20:07:48 by Hibernate Tools 3.2.1.GA

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Competition generated by hbm2java
 */
@Entity
@Table(name = "Competition", catalog = "c1teamf")
public class Competition implements java.io.Serializable {

    private Integer id;
    private Department department;
    private League league;
    private Sport sport;
    private String name;
    private double competitionfee;
    private Date dateOfCompetition;
    private Boolean completed;
    private Set<Meeting> meetings = new HashSet<Meeting>(0);
    private Set<CompetitionTeam> competitionTeams = new HashSet(0);

    public Competition() {
    }

    public Competition(Department department, String name, double competitionfee, Date dateOfCompetition, Sport sport, Boolean completed) {
        this.department = department;
        this.name = name;
        this.competitionfee = competitionfee;
        this.dateOfCompetition = dateOfCompetition;
        this.sport = sport;
        this.completed = completed;
    }

    public Competition(Department department, String name, double competitionfee, Date dateOfCompetition, Sport sport, Boolean completed, Set meetings, Set competitionTeams) {
        this.department = department;
        this.name = name;
        this.competitionfee = competitionfee;
        this.dateOfCompetition = dateOfCompetition;
        this.sport = sport;
        this.completed = completed;
        this.meetings = meetings;
        this.competitionTeams = competitionTeams;
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
    @JoinColumn(name = "department_id", nullable = false)
    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "competitionfee", nullable = false, precision = 22, scale = 0)
    public double getCompetitionfee() {
        return this.competitionfee;
    }

    public void setCompetitionfee(double competitionfee) {
        this.competitionfee = competitionfee;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dateOfCompetition", nullable = false, length = 10)
    public Date getDateOfCompetition() {
        return this.dateOfCompetition;
    }

    public void setDateOfCompetition(Date dateOfCompetition) {
        this.dateOfCompetition = dateOfCompetition;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "competition")
    public Set<Meeting> getMeetings() {
        return this.meetings;
    }

    public void setMeetings(Set<Meeting> meetings) {
        this.meetings = meetings;
    }

    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "competition")
    public Set<CompetitionTeam> getCompetitionTeams() {
        return this.competitionTeams;
    }

    public void setCompetitionTeams(Set<CompetitionTeam> competitionTeams) {
        this.competitionTeams = competitionTeams;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "league_id", nullable = true)
    public League getLeague() {
        return league;
    }

    /**
     * @param league the league to set
     */
    public void setLeague(League league) {
        this.league = league;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sport_id", nullable = false)
    public Sport getSport() {
        return sport;
    }

    /**
     * @param sport the sport to set
     */
    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Column(name = "completed")
    public Boolean getCompleted() {
        return completed;
    }

    /**
     * @param completed the completed to set
     */
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Competition other = (Competition) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}