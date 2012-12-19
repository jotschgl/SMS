/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import Communication.ClubMemberDTO;
import Communication.CompetitionDTO;
import Communication.CompetitionDTOControllerFactoryRemote;
import Communication.CompetitionTeamDTO;
import Communication.MeetingDTO;
import Communication.TeamDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Andreas
 */
@ManagedBean(name = "compList")
@SessionScoped
public class CompetitionList implements Serializable {
    @EJB
    private CompetitionDTOControllerFactoryRemote competitionDTOControllerFactory;
    private ArrayList<CompetitionDTO> _competitions = new ArrayList<CompetitionDTO>();
    private ArrayList<TeamDTO> allTeamsOfSelectedCompetition = new ArrayList<TeamDTO>();
    private ArrayList<ClubMemberDTO> allClubMembersOfSelectedCompetition = new ArrayList<ClubMemberDTO>();
    private CompetitionDTO selectedDTO;

    private void getCompetitionList() {
        System.out.println("in constructor");
        if (competitionDTOControllerFactory != null) {
            System.out.println("in create() and competitionDTOControllerFactory not null");
            Collection<CompetitionDTO> com = competitionDTOControllerFactory.getAllCompetitions();
            if (com != null) {
                for (CompetitionDTO compDTO : com) {
                    _competitions.add(compDTO);
                }
            } else {
                System.out.println("com = null");
            }
        } else {
            System.out.println("norpe");
        }
    }

    public String show() {
        getCompetitionList();
        return "competitions";
    }

    public String edit() {
        return "detail";
    }

    public String showCompetitions() {
        return "competitions";
    }

    public void doTheSave() {
        System.out.println("In doTheSave!");
        for (MeetingDTO m : selectedDTO.getAllCompetitionMeetings()) {
            System.out.println("Meeting ID: " + m.getId());
            System.out.println("Point Team A: " + m.getPointsA());
            System.out.println("Point Team A: " + m.getPointsB());
        }
        competitionDTOControllerFactory.updateCompetition(selectedDTO);
    }

    public ArrayList<CompetitionDTO> getComp() {
        return _competitions;
    }

    public void setComp(ArrayList<CompetitionDTO> comp) {
        this._competitions = comp;
    }

    public CompetitionDTO getSelectedDTO() {
        return selectedDTO;
    }

    public void setSelectedDTO(CompetitionDTO selectedDTO) {
        this.selectedDTO = selectedDTO;
        System.out.println(selectedDTO.getName());
        getCompetitionTeamDTO();
        getClubMembersOfCompetition();
    }

    public ArrayList<TeamDTO> getAllTeamsOfSelectedCompetition() {
        return allTeamsOfSelectedCompetition;
    }

    public void setAllTeamsOfSelectedCompetition(ArrayList<TeamDTO> allTeamsOfSelectedCompetition) {
        this.allTeamsOfSelectedCompetition = allTeamsOfSelectedCompetition;
    }

    public ArrayList<ClubMemberDTO> getAllClubMembersOfSelectedCompetition() {
        return allClubMembersOfSelectedCompetition;
    }

    public void setAllClubMembersOfSelectedCompetition(ArrayList<ClubMemberDTO> allClubMembersOfSelectedCompetition) {
        this.allClubMembersOfSelectedCompetition = allClubMembersOfSelectedCompetition;
    }

    public void getCompetitionTeamDTO() {
        System.out.println(selectedDTO.getAllTeamsOfCompetition().size());
        for (CompetitionTeamDTO team : selectedDTO.getAllTeamsOfCompetition()) {
            if (!allTeamsOfSelectedCompetition.contains(team.getTeam())) {
                allTeamsOfSelectedCompetition.add(team.getTeam());
                System.out.println("Team added: " + team.getTeam().getTeamName());
            }
        }
    }

    public void getClubMembersOfCompetition() {
        for (CompetitionTeamDTO team : selectedDTO.getAllTeamsOfCompetition()) {
            if (!allClubMembersOfSelectedCompetition.contains(team.getClubMember())) {
                allClubMembersOfSelectedCompetition.add(team.getClubMember());
            }
        }
    }
}