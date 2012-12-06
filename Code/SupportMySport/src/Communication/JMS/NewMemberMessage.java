/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication.JMS;

import Communication.ClubMemberDTO;
import MessageInterfaces.INewMemberMessage;
import java.io.Serializable;

/**
 *
 * @author rafa
 */
public class NewMemberMessage implements INewMemberMessage, Serializable{

    int deptHeadId;
    ClubMemberDTO clubMemberDTO;
    
    public NewMemberMessage(int id, ClubMemberDTO clubmemberdto){
        deptHeadId = id;
        clubMemberDTO = clubmemberdto;
    }
    
    public int getDeptHeadId() {
       return deptHeadId;
    }

    @Override
    public ClubMemberDTO getClubMemberDTO() {
       return clubMemberDTO;
    }
    
}
