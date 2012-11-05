/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.Department;
import Persistence.League;
import Persistence.Rule;
import Persistence.Team;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Johannes
 */
public interface ISport extends Serializable
{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    Department getDepartment();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sport")
    Set<League> getLeagues();

    @Column(name = "name", nullable = false, length = 45)
    String getName();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rule_id", nullable = false)
    Rule getRule();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sport")
    Set<Team> getTeams();

    void setDepartment(Department department);

    void setId(Integer id);

    void setLeagues(Set<League> leagues);

    void setName(String name);

    void setRule(Rule rule);

    void setTeams(Set<Team> teams);
    
}
