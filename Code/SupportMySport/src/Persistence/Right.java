package Persistence;
// Generated 27.10.2012 15:46:24 by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Right generated by hbm2java
 */
@Entity
@Table(name = "Right", catalog = "c1teamf")
public class Right implements java.io.Serializable {

    private Integer id;
    private String name;
    private Set<Role> roles = new HashSet(0);

    public Right() {
    }

    public Right(String name) {
        this.name = name;
    }

    public Right(String name, Set roles) {
        this.name = name;
        this.roles = roles;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "right")
    public Set<Role> getRoles() {
        return this.roles;
    }

    public void setRoles(Set roles) {
        this.roles = roles;
    }
}
