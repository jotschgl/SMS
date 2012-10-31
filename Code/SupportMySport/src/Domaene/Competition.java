package Domaene;
// Generated 28.10.2012 20:58:08 by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Competition generated by hbm2java
 */

public class Competition implements java.io.Serializable {

    private Integer id;
    private Department department;
    private String name;
    private double competitionfee;
    private Date dateOfCompetition;
    private Set<Meeting> meetings = new HashSet<Meeting>(0);
    private Set<CompetitionTeam> competitionTeams = new HashSet<CompetitionTeam>(0);

    public Competition() {
    }

    public Competition(Department department, String name, double competitionfee, Date dateOfCompetition) {
        this.department = department;
        this.name = name;
        this.competitionfee = competitionfee;
        this.dateOfCompetition = dateOfCompetition;
    }

    public Competition(Department department, String name, double competitionfee, Date dateOfCompetition, Set<Meeting> meetings, Set<CompetitionTeam> competitionTeams) {
        this.department = department;
        this.name = name;
        this.competitionfee = competitionfee;
        this.dateOfCompetition = dateOfCompetition;
        this.meetings = meetings;
        this.competitionTeams = competitionTeams;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCompetitionfee() {
        return this.competitionfee;
    }

    public void setCompetitionfee(double competitionfee) {
        this.competitionfee = competitionfee;
    }

    public Date getDateOfCompetition() {
        return this.dateOfCompetition;
    }

    public void setDateOfCompetition(Date dateOfCompetition) {
        this.dateOfCompetition = dateOfCompetition;
    }

    public Set<Meeting> getMeetings() {
        return this.meetings;
    }

    public void setMeetings(Set<Meeting> meetings) {
        this.meetings = meetings;
    }

    public Set<CompetitionTeam> getCompetitionTeams() {
        return this.competitionTeams;
    }

    public void setCompetitionTeams(Set<CompetitionTeam> competitionTeams) {
        this.competitionTeams = competitionTeams;
    }
}