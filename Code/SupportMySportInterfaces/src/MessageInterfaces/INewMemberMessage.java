/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageInterfaces;

import Communication.ClubMemberDTO;
import Communication.DepartmentDTO;

/**
 *
 * @author rafa
 */
public interface INewMemberMessage {
    
    int getDeptHeadId();
    
    ClubMemberDTO getClubMemberDTO();
    
    DepartmentDTO getDepartmentDTO();
    
}
