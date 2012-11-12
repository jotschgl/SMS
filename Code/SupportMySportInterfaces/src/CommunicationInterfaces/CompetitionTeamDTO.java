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
public class CompetitionTeamDTO implements Serializable {
    
    private TeamDTO team;
    private Collection<ClubMemberDTO> allCompetitionTeamMembers;
    
    public CompetitionTeamDTO(TeamDTO team){
       this.team = team;
       allCompetitionTeamMembers = new LinkedList<ClubMemberDTO>();
    } 
    
    public CompetitionTeamDTO(TeamDTO team, Collection<ClubMemberDTO> allClubMembers){
        this.team = team;
        this.allCompetitionTeamMembers = allClubMembers;
    }
    
    public TeamDTO getTeam(){
        return team;
    }
    
    public void setTeam(TeamDTO team){
        this.team = team;
    }
    
    public Collection<ClubMemberDTO> getAllClubMembersOfCompetitionTeam(){
        return allCompetitionTeamMembers;
    }
    
    public void addClubMemmberToCompetitionTeam(ClubMemberDTO clubMemberDTO){
        allCompetitionTeamMembers.add(clubMemberDTO);
    }
}
