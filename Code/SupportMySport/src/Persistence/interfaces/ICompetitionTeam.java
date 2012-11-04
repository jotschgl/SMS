/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeamId;
import Persistence.Team;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Johannes
 */
public interface ICompetitionTeam extends Serializable
{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clubMember_id", nullable = false)
    ClubMember getClubMember();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "competition_id", nullable = false, insertable = false, updatable = false)
    Competition getCompetition();

    @EmbeddedId
    @AttributeOverrides(value =
    {
        @AttributeOverride(name = "competitionId", column =
        @Column(name = "competition_id", nullable = false)),
        @AttributeOverride(name = "teamId", column =
        @Column(name = "team_id", nullable = false))
    })
    CompetitionTeamId getId();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false, insertable = false, updatable = false)
    Team getTeam();

    void setClubMember(ClubMember clubMember);

    void setCompetition(Competition competition);

    void setId(CompetitionTeamId id);

    void setTeam(Team team);
    
}
