package Domäne;
// Generated 28.10.2012 20:58:08 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

public class RoleRight implements java.io.Serializable {

    private Integer id;
    private String name;
    private Set<FunctionRole> functionRoles = new HashSet<FunctionRole>(0);

    public RoleRight() {
    }

    public RoleRight(String name) {
        this.name = name;
    }

    public RoleRight(String name, Set<FunctionRole> functionRoles) {
        this.name = name;
        this.functionRoles = functionRoles;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<FunctionRole> getFunctionRoles() {
        return this.functionRoles;
    }

    public void setFunctionRoles(Set<FunctionRole> functionRoles) {
        this.functionRoles = functionRoles;
    }
}
