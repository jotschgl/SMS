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
    private DepartmentDTO department;
    private ClubMemberDTO clubMember;
    private LeagueDTO league;
    private SportDTO sport;
    private Collection<ClubMemberDTO> allClubMembers;

    public TeamDTO(String name){
        this.teamName = name;
        allClubMembers = new LinkedList<ClubMemberDTO>();
    }
    
    public TeamDTO(String name, DepartmentDTO dep, ClubMemberDTO club, LeagueDTO league, SportDTO sport) {
        this.clubMember = club;
        this.department = dep;
        this.league = league;
        this.sport = sport;
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

    /**
     * @return the department
     */
    public DepartmentDTO getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    /**
     * @return the clubMember
     */
    public ClubMemberDTO getClubMember() {
        return clubMember;
    }

    /**
     * @param clubMember the clubMember to set
     */
    public void setClubMember(ClubMemberDTO clubMember) {
        this.clubMember = clubMember;
    }

    /**
     * @return the league
     */
    public LeagueDTO getLeague() {
        return league;
    }

    /**
     * @param league the league to set
     */
    public void setLeague(LeagueDTO league) {
        this.league = league;
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
