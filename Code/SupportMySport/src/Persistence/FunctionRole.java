package Persistence;
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

/**
 * FunctionRole generated by hbm2java
 */
@Entity
@Table(name = "FunctionRole", catalog = "c1teamf")
public class FunctionRole implements java.io.Serializable {

    private Integer id;
    private RoleRight roleRight;
    private String name;
    private Set<ClubMember> clubMembers = new HashSet<ClubMember>(0);

    public FunctionRole() {
    }

    public FunctionRole(RoleRight roleRight, String name) {
        this.roleRight = roleRight;
        this.name = name;
    }

    public FunctionRole(RoleRight roleRight, String name, Set<ClubMember> clubMembers) {
        this.roleRight = roleRight;
        this.name = name;
        this.clubMembers = clubMembers;
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

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @Cascade( org.hibernate.annotations.CascadeType.SAVE_UPDATE )
    @JoinColumn(name = "roleRight_id", nullable = false)
    public RoleRight getRoleRight() {
        return this.roleRight;
    }

    public void setRoleRight(RoleRight roleRight) {
        this.roleRight = roleRight;
    }

    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "MemberFunctionRole", catalog = "c1teamf", joinColumns = {
        @JoinColumn(name = "functionRole_id", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "clubMember_id", nullable = false, updatable = false)})
    public Set<ClubMember> getClubMembers() {
        return this.clubMembers;
    }

    public void setClubMembers(Set<ClubMember> clubMembers) {
        this.clubMembers = clubMembers;
    }
}
