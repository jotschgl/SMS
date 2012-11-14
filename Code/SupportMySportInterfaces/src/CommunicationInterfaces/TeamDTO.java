/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationInterfaces;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Dennis
 */
public class TeamDTO implements Serializable {

    private int id = -1;
    private String teamName;
    private Collection<ClubMemberDTO> allClubMembers;

    public TeamDTO(String name) {
        this.teamName = name;
        allClubMembers = new LinkedList<ClubMemberDTO>();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    

    @Override
    public String toString() {
        return getTeamName();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
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
        final TeamDTO other = (TeamDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     * @return the allClubMembers
     */
    public Collection<ClubMemberDTO> getAllClubMembers() {
        return allClubMembers;
    }
    
    public void addClubMemberToTeam(ClubMemberDTO clubMember){
        allClubMembers.add(clubMember);
    }
}
