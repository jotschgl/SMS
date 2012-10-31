package Domaene;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class Meeting implements java.io.Serializable {

    private Integer id;
    private Competition competition;
    private Team teamByTeamAId;
    private Team teamByTeamBId;
    private Integer pointsA;
    private Integer pointsB;

    public Meeting() {
    }

    public Meeting(Competition competition, Team teamByTeamAId, Team teamByTeamBId) {
        this.competition = competition;
        this.teamByTeamAId = teamByTeamAId;
        this.teamByTeamBId = teamByTeamBId;
    }

    public Meeting(Competition competition, Team teamByTeamAId, Team teamByTeamBId, Integer pointsA, Integer pointsB) {
        this.competition = competition;
        this.teamByTeamAId = teamByTeamAId;
        this.teamByTeamBId = teamByTeamBId;
        this.pointsA = pointsA;
        this.pointsB = pointsB;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Competition getCompetition() {
        return this.competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Team getTeamByTeamAId() {
        return this.teamByTeamAId;
    }

    public void setTeamByTeamAId(Team teamByTeamAId) {
        this.teamByTeamAId = teamByTeamAId;
    }

    public Team getTeamByTeamBId() {
        return this.teamByTeamBId;
    }

    public void setTeamByTeamBId(Team teamByTeamBId) {
        this.teamByTeamBId = teamByTeamBId;
    }

    public Integer getPointsA() {
        return this.pointsA;
    }

    public void setPointsA(Integer pointsA) {
        this.pointsA = pointsA;
    }

    public Integer getPointsB() {
        return this.pointsB;
    }

    public void setPointsB(Integer pointsB) {
        this.pointsB = pointsB;
    }
}
