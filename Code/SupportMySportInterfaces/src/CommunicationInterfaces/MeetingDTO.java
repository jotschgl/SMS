/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationInterfaces;

import java.io.Serializable;

/**
 *
 * @author Dennis
 */
public class MeetingDTO implements Serializable{
    
    private Integer id = -1;
    private CompetitionDTO competition;
    private TeamDTO teamByTeamAId;
    private TeamDTO teamByTeamBId;
    private Integer pointsA;
    private Integer pointsB;
    
    public MeetingDTO(CompetitionDTO competition, TeamDTO teamByTeamAId, TeamDTO teamByTeamBId) {
        this.competition = competition;
        this.teamByTeamAId = teamByTeamAId;
        this.teamByTeamBId = teamByTeamBId;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the competition
     */
    public CompetitionDTO getCompetition() {
        return competition;
    }

    /**
     * @param competition the competition to set
     */
    public void setCompetition(CompetitionDTO competition) {
        this.competition = competition;
    }

    /**
     * @return the teamByTeamAId
     */
    public TeamDTO getTeamByTeamAId() {
        return teamByTeamAId;
    }

    /**
     * @param teamByTeamAId the teamByTeamAId to set
     */
    public void setTeamByTeamAId(TeamDTO teamByTeamAId) {
        this.teamByTeamAId = teamByTeamAId;
    }

    /**
     * @return the teamByTeamBId
     */
    public TeamDTO getTeamByTeamBId() {
        return teamByTeamBId;
    }

    /**
     * @param teamByTeamBId the teamByTeamBId to set
     */
    public void setTeamByTeamBId(TeamDTO teamByTeamBId) {
        this.teamByTeamBId = teamByTeamBId;
    }

    /**
     * @return the pointsA
     */
    public Integer getPointsA() {
        return pointsA;
    }

    /**
     * @param pointsA the pointsA to set
     */
    public void setPointsA(Integer pointsA) {
        this.pointsA = pointsA;
    }

    /**
     * @return the pointsB
     */
    public Integer getPointsB() {
        return pointsB;
    }

    /**
     * @param pointsB the pointsB to set
     */
    public void setPointsB(Integer pointsB) {
        this.pointsB = pointsB;
    }
    
}
