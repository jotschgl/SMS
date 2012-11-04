/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.CompetitionTeam;
import Persistence.Department;
import Persistence.Meeting;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Johannes
 */
public interface ICompetition extends Serializable
{

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "competition")
    Set<CompetitionTeam> getCompetitionTeams();

    @Column(name = "competitionfee", nullable = false, precision = 22, scale = 0)
    double getCompetitionfee();

    @Temporal(value = TemporalType.DATE)
    @Column(name = "dateOfCompetition", nullable = false, length = 10)
    Date getDateOfCompetition();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    Department getDepartment();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "competition")
    Set<Meeting> getMeetings();

    @Column(name = "name", nullable = false, length = 45)
    String getName();

    void setCompetitionTeams(Set<CompetitionTeam> competitionTeams);

    void setCompetitionfee(double competitionfee);

    void setDateOfCompetition(Date dateOfCompetition);

    void setDepartment(Department department);

    void setId(Integer id);

    void setMeetings(Set<Meeting> meetings);

    void setName(String name);
    
}
