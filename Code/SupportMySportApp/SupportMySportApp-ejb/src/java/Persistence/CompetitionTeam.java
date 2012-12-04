package Persistence;
// Generated 11.11.2012 20:07:48 by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.Cascade;

/**
 * CompetitionTeam generated by hbm2java
 */
@Entity
@Table(name = "CompetitionTeam", catalog = "c1teamf")
public class CompetitionTeam implements java.io.Serializable {

    private int id;
    private Team team;
    private Competition competition;
    private ClubMember clubMember;
    private Boolean shouldBeDeleted;

    public CompetitionTeam() {
    }

    public CompetitionTeam(Team team, Competition competition, ClubMember clubMember) {
        this.team = team;
        this.competition = competition;
        this.clubMember = clubMember;
        this.shouldBeDeleted = false;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "competition_id", nullable = false)
    public Competition getCompetition() {
        return this.competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clubMember_id", nullable = false)
    public ClubMember getClubMember() {
        return this.clubMember;
    }

    public void setClubMember(ClubMember clubMember) {
        this.clubMember = clubMember;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + (this.team != null ? this.team.hashCode() : 0);
        hash = 67 * hash + (this.competition != null ? this.competition.hashCode() : 0);
        hash = 67 * hash + (this.clubMember != null ? this.clubMember.hashCode() : 0);
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
        final CompetitionTeam other = (CompetitionTeam) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }    

    /**
     * @return the delete
     */
    @Transient
    public Boolean getShouldBeDeleted() {
        return shouldBeDeleted;
    }

    /**
     * @param delete the delete to set
     */
    public void setDelete(Boolean delete) {
        this.shouldBeDeleted = delete;
    }
}
