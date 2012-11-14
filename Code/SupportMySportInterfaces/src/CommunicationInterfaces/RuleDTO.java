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
public class RuleDTO implements Serializable {

    private Integer id = -1;
    private Integer numberOfPlayers;
    private Integer pointswin;
    private Integer pointsdraw;
    private Integer pointslose;

    public RuleDTO(Integer numberOfPlayers, Integer pointswin, Integer pointsdraw, Integer pointslose) {

        this.numberOfPlayers = numberOfPlayers;
        this.pointswin = pointswin;
        this.pointsdraw = pointsdraw;
        this.pointslose = pointslose;
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
     * @return the numberOfPlayers
     */
    public Integer getNumberOfPlayers() {
        return numberOfPlayers;
    }

    /**
     * @param numberOfPlayers the numberOfPlayers to set
     */
    public void setNumberOfPlayers(Integer numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    /**
     * @return the pointswin
     */
    public Integer getPointswin() {
        return pointswin;
    }

    /**
     * @param pointswin the pointswin to set
     */
    public void setPointswin(Integer pointswin) {
        this.pointswin = pointswin;
    }

    /**
     * @return the pointsdraw
     */
    public Integer getPointsdraw() {
        return pointsdraw;
    }

    /**
     * @param pointsdraw the pointsdraw to set
     */
    public void setPointsdraw(Integer pointsdraw) {
        this.pointsdraw = pointsdraw;
    }

    /**
     * @return the pointslose
     */
    public Integer getPointslose() {
        return pointslose;
    }

    /**
     * @param pointslose the pointslose to set
     */
    public void setPointslose(Integer pointslose) {
        this.pointslose = pointslose;
    }
}
