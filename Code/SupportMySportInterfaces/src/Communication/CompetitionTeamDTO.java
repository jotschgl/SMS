/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.io.Serializable;

/**
 *
 * @author Dennis
 */
public class CompetitionTeamDTO implements Serializable {

    private int id = -1;
    private TeamDTO team;
    private ClubMemberDTO clubMember;
    private CompetitionDTO competition;
    private Boolean delete;

    public CompetitionTeamDTO(TeamDTO team, ClubMemberDTO clubMember, CompetitionDTO competition) {
        this.team = team;
        this.clubMember = clubMember;
        this.competition = competition;
        this.delete = false;
    }

    public CompetitionTeamDTO(TeamDTO team, CompetitionDTO comp) {
        this.team = team;
        this.competition = comp;
        this.delete = false;
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
     * @return the team
     */
    public TeamDTO getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(TeamDTO team) {
        this.team = team;
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
     * @return the competition
     */
    public CompetitionDTO getCompetition() {
        return competition;
    }

    /**
     * @param competition the competition to set
     */
    public void setCompetition(CompetitionDTO competition) {
        this.competition = competition;
    }

    /**
     * @return the delete
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * @param delete the delete to set
     */
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
    
    
}
