/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.FunctionRole;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Johannes
 */
public interface IRoleRight extends Serializable
{

    /**
     *
     * @return
     */
    @OneToMany(cascade =
    {
        CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
    }, fetch = FetchType.LAZY, mappedBy = "roleRight")
    @Cascade(value = org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    Set<FunctionRole> getFunctionRoles();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @Column(name = "name", nullable = false, length = 45)
    String getName();

    void setFunctionRoles(Set<FunctionRole> functionRoles);

    void setId(Integer id);

    void setName(String name);
    
}
