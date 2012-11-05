package Persistence;
// Generated 28.10.2012 20:58:08 by Hibernate Tools 3.2.1.GA

import Persistence.interfaces.IRoleRight;
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

/**
 * RoleRight generated by hbm2java
 */
@Entity
@Table(name = "RoleRight", catalog = "c1teamf")
public class RoleRight implements IRoleRight {

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

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 45)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY, mappedBy = "roleRight")
    @Cascade( org.hibernate.annotations.CascadeType.SAVE_UPDATE )
    @Override
    public Set<FunctionRole> getFunctionRoles() {
        return this.functionRoles;
    }

    @Override
    public void setFunctionRoles(Set<FunctionRole> functionRoles) {
        this.functionRoles = functionRoles;
    }
}
