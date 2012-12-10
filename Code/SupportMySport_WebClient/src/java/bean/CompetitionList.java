/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import Communication.CompetitionDTO;
import Communication.CompetitionDTOControllerFactoryRemote;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Andreas
 */
@ManagedBean(name="compList")
@ViewScoped
public class CompetitionList {
    @EJB
    private CompetitionDTOControllerFactoryRemote competitionDTOControllerFactory;

   
   private ArrayList<CompetitionDTO> comp; 
   private CompetitionDTO selectedDTO;
 
   @PostConstruct
   public void create (){
        
        comp = new ArrayList<CompetitionDTO>();
        for(CompetitionDTO c : competitionDTOControllerFactory.getAllCompetitions()){
            comp.add(c);
        }
   }
   public void show (){
	
   }

    public ArrayList<CompetitionDTO> getComp() {
        return comp;
    }

    public void setComp(ArrayList<CompetitionDTO> comp) {
        this.comp = comp;
    }

    public CompetitionDTO getSelectedDTO() {
        return selectedDTO;
    }

    public void setSelectedDTO(CompetitionDTO selectedDTO) {
        this.selectedDTO = selectedDTO;
    }
   
}