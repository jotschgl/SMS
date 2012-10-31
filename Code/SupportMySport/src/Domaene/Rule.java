package Domaene;

import java.util.HashSet;
import java.util.Set;

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

    public Rule(int nrplayer, int pointswin, int pointsdraw, int pointslose, Set<Sport> sports) {
        this.nrplayer = nrplayer;
        this.pointswin = pointswin;
        this.pointsdraw = pointsdraw;
        this.pointslose = pointslose;
        this.sports = sports;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNrplayer() {
        return this.nrplayer;
    }

    public void setNrplayer(int nrplayer) {
        this.nrplayer = nrplayer;
    }

    public int getPointswin() {
        return this.pointswin;
    }

    public void setPointswin(int pointswin) {
        this.pointswin = pointswin;
    }

    public int getPointsdraw() {
        return this.pointsdraw;
    }

    public void setPointsdraw(int pointsdraw) {
        this.pointsdraw = pointsdraw;
    }

    public int getPointslose() {
        return this.pointslose;
    }

    public void setPointslose(int pointslose) {
        this.pointslose = pointslose;
    }

    public Set<Sport> getSports() {
        return this.sports;
    }

    public void setSports(Set<Sport> sports) {
        this.sports = sports;
    }
}
