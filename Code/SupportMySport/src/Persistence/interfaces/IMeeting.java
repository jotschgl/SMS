/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.Competition;
import Persistence.Team;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Johannes
 */
public interface IMeeting extends Serializable
{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "competition_id", nullable = false)
    Competition getCompetition();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @Column(name = "points_a")
    Integer getPointsA();

    @Column(name = "points_b")
    Integer getPointsB();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teamA_id", nullable = false)
    Team getTeamByTeamAId();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teamB_id", nullable = false)
    Team getTeamByTeamBId();

    void setCompetition(Competition competition);

    void setId(Integer id);

    void setPointsA(Integer pointsA);

    void setPointsB(Integer pointsB);

    void setTeamByTeamAId(Team teamByTeamAId);

    void setTeamByTeamBId(Team teamByTeamBId);
    
}
