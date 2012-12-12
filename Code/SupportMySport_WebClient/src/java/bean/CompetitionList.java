/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import Communication.CompetitionDTO;
import Communication.CompetitionDTOControllerFactoryRemote;
import Communication.CompetitionTeamDTO;
import Communication.MeetingDTO;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Andreas
 */
@ManagedBean(name = "compList")
@RequestScoped
public class CompetitionList {

    @EJB
    private CompetitionDTOControllerFactoryRemote competitionDTOControllerFactory;
    private ArrayList<CompetitionDTO> _competitions = new ArrayList<CompetitionDTO>();
    ; 
   private CompetitionDTO selectedDTO;
    private CompetitionTeamDTO selectedComTeamDTO;
    private MeetingDTO selectedMeetingDTO;

    @PostConstruct
    public void create() {
        System.out.println("in create competitionLIST");
        Collection<CompetitionDTO> com = competitionDTOControllerFactory.getAllCompetitions();
        if (com != null) {
            for (CompetitionDTO compDTO : com) {
                System.out.println(compDTO.getName());
                _competitions.add(compDTO);
            }
        } else {
            System.out.println("com = null");
        }
    }

    public String show() {
        return "detail";
    }

    public void save(){
        System.out.println("svae all meetings");
        
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
    }

    public MeetingDTO getSelectedMeetingDTO() {
        return selectedMeetingDTO;
    }

    public void setSelectedMeetingDTO(MeetingDTO selectedMeetingDTO) {
        this.selectedMeetingDTO = selectedMeetingDTO;
    }
}