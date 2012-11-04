/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.Federation;
import Persistence.Sport;
import Persistence.Team;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Johannes
 */
public interface ILeague extends Serializable
{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "federation_id", nullable = false)
    Federation getFederation();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @Column(name = "name", unique = true, nullable = false, length = 45)
    String getName();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_id", nullable = false)
    Sport getSport();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "TeamLeague", catalog = "c1teamf", joinColumns =
    {
        @JoinColumn(name = "league_id", nullable = false, updatable = false)
    }, inverseJoinColumns =
    {
        @JoinColumn(name = "team_id", nullable = false, updatable = false)
    })
    Set<Team> getTeams();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "league")
    Set<Team> getTeams_1();

    void setFederation(Federation federation);

    void setId(Integer id);

    void setName(String name);

    void setSport(Sport sport);

    void setTeams(Set<Team> teams);

    void setTeams_1(Set<Team> teams_1);
    
}
