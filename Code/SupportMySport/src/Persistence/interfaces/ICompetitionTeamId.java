/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import java.io.Serializable;
import javax.persistence.Column;

/**
 *
 * @author Johannes
 */
public interface ICompetitionTeamId extends Serializable
{

    boolean equals(Object other);

    @Column(name = "competition_id", nullable = false)
    int getCompetitionId();

    @Column(name = "team_id", nullable = false)
    int getTeamId();

    int hashCode();

    void setCompetitionId(int competitionId);

    void setTeamId(int teamId);
    
}
