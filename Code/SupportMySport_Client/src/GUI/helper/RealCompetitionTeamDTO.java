/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.helper;

import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.CompetitionDTO;
import CommunicationInterfaces.CompetitionTeamDTO;
import CommunicationInterfaces.TeamDTO;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Johannes
 */
public class RealCompetitionTeamDTO {

    private static LinkedList<CompetitionTeamDTO> mainlist = new LinkedList<CompetitionTeamDTO>();
    private Collection<ClubMemberDTO> members;
    private TeamDTO team;

    public Collection<ClubMemberDTO> getMembers() {
        return members;
    }

    public void setMembers(Collection<ClubMemberDTO> members) {
        this.members = members;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public CompetitionDTO getCompetition() {
        return competition;
    }

    public void setCompetition(CompetitionDTO competition) {
        this.competition = competition;
    }
    private CompetitionDTO competition;

    public static void addCompetitionTeamDTO(CompetitionTeamDTO ctd) {
        mainlist.add(ctd);
    }

    public static void addAllCompetitionTeamDTO(Collection<CompetitionTeamDTO> ctds) {
        mainlist.addAll(ctds);
    }

    public static RealCompetitionTeamDTO getRealCompTeamTDO(TeamDTO team, CompetitionDTO comp) {
        RealCompetitionTeamDTO rctd = new RealCompetitionTeamDTO();
        LinkedList<ClubMemberDTO> member = new LinkedList<ClubMemberDTO>();
        for (CompetitionTeamDTO ctd : mainlist) {
            if (team.equals(ctd.getTeam()) && comp.equals(ctd.getCompetition())) {
                member.add(ctd.getClubMember());
            }
        }
        rctd.setCompetition(comp);
        rctd.setMembers(member);
        rctd.setTeam(team);
        return rctd;
    }

    public static Collection<TeamDTO> getAllTeamsOfCompetition(CompetitionDTO comp) {
        HashSet<TeamDTO> teamset = new HashSet<TeamDTO>();
        for (CompetitionTeamDTO competitionTeamDTO : mainlist) {
            if (competitionTeamDTO.getCompetition().equals(comp)) {
                teamset.add(competitionTeamDTO.getTeam());
            }
        }
        return teamset;
    }
}
