package Persistence;
// Generated 11.11.2012 20:07:48 by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Meeting generated by hbm2java
 */
@Entity
@Table(name = "Meeting", catalog = "c1teamf")
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

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "competition_id")
    public Competition getCompetition() {
        return this.competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teamA_id", nullable = false)
    public Team getTeamByTeamAId() {
        return this.teamByTeamAId;
    }

    public void setTeamByTeamAId(Team teamByTeamAId) {
        this.teamByTeamAId = teamByTeamAId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teamB_id", nullable = false)
    public Team getTeamByTeamBId() {
        return this.teamByTeamBId;
    }

    public void setTeamByTeamBId(Team teamByTeamBId) {
        this.teamByTeamBId = teamByTeamBId;
    }

    @Column(name = "points_a")
    public Integer getPointsA() {
        return this.pointsA;
    }

    public void setPointsA(Integer pointsA) {
        this.pointsA = pointsA;
    }

    @Column(name = "points_b")
    public Integer getPointsB() {
        return this.pointsB;
    }

    public void setPointsB(Integer pointsB) {
        this.pointsB = pointsB;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Meeting other = (Meeting) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
}
