/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.Sport;
import Persistence.Team;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Johannes
 */
public interface IDepartment extends Serializable
{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departmentChief_id", nullable = false)
    ClubMember getClubMember();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
    Set<Competition> getCompetitions();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @Column(name = "name", unique = true, nullable = false, length = 45)
    String getName();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
    Set<Sport> getSports();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "department")
    Set<Team> getTeams();

    void setClubMember(ClubMember clubMember);

    void setCompetitions(Set<Competition> competitions);

    void setId(Integer id);

    void setName(String name);

    void setSports(Set<Sport> sports);

    void setTeams(Set<Team> teams);
    
}
