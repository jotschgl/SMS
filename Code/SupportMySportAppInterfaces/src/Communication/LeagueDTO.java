/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.io.Serializable;

/**
 *
 * @author Johannes
 */
public class LeagueDTO implements Serializable {

    private Integer id;
    private FederationDTO federation;
    private SportDTO sport;
    private String name;

    public LeagueDTO(String name, SportDTO sport, FederationDTO federation){
        this.federation = federation;
        this.name = name;
        this.sport = sport;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FederationDTO getFederation() {
        return federation;
    }

    public void setFederation(FederationDTO federation) {
        this.federation = federation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LeagueDTO other = (LeagueDTO) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getName();
    }

    /**
     * @return the sport
     */
    public SportDTO getSport() {
        return sport;
    }

    /**
     * @param sport the sport to set
     */
    public void setSport(SportDTO sport) {
        this.sport = sport;
    }
}
