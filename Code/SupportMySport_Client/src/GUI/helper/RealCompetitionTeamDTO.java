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

    private HashSet<CompetitionTeamDTO> mainlist = new HashSet<CompetitionTeamDTO>();
    private Collection<ClubMemberDTO> members;
    private TeamDTO team;

    public Collection<ClubMemberDTO> getMembers() {
        System.out.println(members.size());
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

    public void addCompetitionTeamDTO(CompetitionTeamDTO ctd) {
        mainlist.add(ctd);
    }

    public void addAllCompetitionTeamDTO(Collection<CompetitionTeamDTO> ctds) {
        mainlist.addAll(ctds);
    }

    public RealCompetitionTeamDTO getRealCompTeamTDO(TeamDTO team, CompetitionDTO comp) {
        RealCompetitionTeamDTO rctd = new RealCompetitionTeamDTO();
        LinkedList<ClubMemberDTO> member = new LinkedList<ClubMemberDTO>();
        for (CompetitionTeamDTO ctd : mainlist) {
            if (team.equals(ctd.getTeam()) && comp.equals(ctd.getCompetition())) {
                if (ctd.getClubMember() != null) {
                    member.add(ctd.getClubMember());
                }
            }
        }
        rctd.setCompetition(comp);
        rctd.setMembers(member);
        rctd.setTeam(team);
        return rctd;
    }

    public Collection<TeamDTO> getAllTeamsOfCompetition(CompetitionDTO comp) {
        HashSet<TeamDTO> teamset = new HashSet<TeamDTO>();
        for (CompetitionTeamDTO competitionTeamDTO : mainlist) {
            if (competitionTeamDTO.getCompetition().equals(comp)) {
                teamset.add(competitionTeamDTO.getTeam());
            }
        }
        return teamset;
    }

    public Collection<CompetitionTeamDTO> getAllCompetitionTeamDTOsWithTeam(TeamDTO team) {
        LinkedList<CompetitionTeamDTO> list = new LinkedList<CompetitionTeamDTO>();
        for (CompetitionTeamDTO competitionTeamDTO : mainlist) {
            if (competitionTeamDTO.getTeam().equals(team)) {
                list.add(competitionTeamDTO);
            }
        }
        return list;
    }
}
