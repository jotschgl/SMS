/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.io.Serializable;

/**
 *
 * @author Johannes
 */
public class FederationDTO implements Serializable {

    private Integer id = -1;
    private String name;
    private String website;
    
    public FederationDTO(String name){
        this.name = name;        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
