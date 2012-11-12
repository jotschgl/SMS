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
public class FunctionRoleDTO implements Serializable {
    
    private int id = -1;
    private RoleRightDTO roleRight;
    private String name;  
            
    public FunctionRoleDTO(RoleRightDTO roleRight, String name){
        this.name = name;
        this.roleRight = roleRight;
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
     * @return the roleRight
     */
    public RoleRightDTO getRoleRight() {
        return roleRight;
    }

    /**
     * @param roleRight the roleRight to set
     */
    public void setRoleRight(RoleRightDTO roleRight) {
        this.roleRight = roleRight;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
