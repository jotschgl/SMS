/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationInterfaces;

import java.io.Serializable;

/**
 *
 * @author Dennis
 */
public class DepartmentDTO implements Serializable {
    
    private int id = -1;
    private ClubMemberDTO departmentChief;
    private String departmentName;
    
    public DepartmentDTO(ClubMemberDTO departmentChief,String departmentName){
        this.departmentName = departmentName;
        this.departmentChief = departmentChief;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return the departmentChief
     */
    public ClubMemberDTO getDepartmentChief() {
        return departmentChief;
    }

    /**
     * @param departmentChief the departmentChief to set
     */
    public void setDepartmentChief(ClubMemberDTO departmentChief) {
        this.departmentChief = departmentChief;
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
}
