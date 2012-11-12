package Persistence;
// Generated 11.11.2012 20:07:48 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Rule generated by hbm2java
 */
@Entity
@Table(name = "Rule", catalog = "c1teamf")
public class Rule implements java.io.Serializable {

    private Integer id;
    private int nrplayer;
    private int pointswin;
    private int pointsdraw;
    private int pointslose;
    private Set<Sport> sports = new HashSet<Sport>(0);

    public Rule() {
    }

    public Rule(int nrplayer, int pointswin, int pointsdraw, int pointslose) {
        this.nrplayer = nrplayer;
        this.pointswin = pointswin;
        this.pointsdraw = pointsdraw;
        this.pointslose = pointslose;
    }

    public Rule(int nrplayer, int pointswin, int pointsdraw, int pointslose, Set sports) {
        this.nrplayer = nrplayer;
        this.pointswin = pointswin;
        this.pointsdraw = pointsdraw;
        this.pointslose = pointslose;
        this.sports = sports;
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

    @Column(name = "nrplayer", nullable = false)
    public int getNrplayer() {
        return this.nrplayer;
    }

    public void setNrplayer(int nrplayer) {
        this.nrplayer = nrplayer;
    }

    @Column(name = "pointswin", nullable = false)
    public int getPointswin() {
        return this.pointswin;
    }

    public void setPointswin(int pointswin) {
        this.pointswin = pointswin;
    }

    @Column(name = "pointsdraw", nullable = false)
    public int getPointsdraw() {
        return this.pointsdraw;
    }

    public void setPointsdraw(int pointsdraw) {
        this.pointsdraw = pointsdraw;
    }

    @Column(name = "pointslose", nullable = false)
    public int getPointslose() {
        return this.pointslose;
    }

    public void setPointslose(int pointslose) {
        this.pointslose = pointslose;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "rule")
    public Set<Sport> getSports() {
        return this.sports;
    }

    public void setSports(Set<Sport> sports) {
        this.sports = sports;
    }
}
