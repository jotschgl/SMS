package Persistence;
// Generated 28.10.2012 20:58:08 by Hibernate Tools 3.2.1.GA

import Persistence.interfaces.IFunctionRole;
import java.util.HashSet;
import java.util.Set;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;

/**
 * FunctionRole generated by hbm2java
 */
@Entity
@Table(name = "FunctionRole", catalog = "c1teamf")
public class FunctionRole implements IFunctionRole {

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
    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @Cascade( org.hibernate.annotations.CascadeType.SAVE_UPDATE )
    @JoinColumn(name = "roleRight_id", nullable = false)
    @Override
    public RoleRight getRoleRight() {
        return this.roleRight;
    }

    @Override
    public void setRoleRight(RoleRight roleRight) {
        this.roleRight = roleRight;
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

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "MemberFunctionRole", catalog = "c1teamf", joinColumns = {
        @JoinColumn(name = "functionRole_id", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "clubMember_id", nullable = false, updatable = false)})
    @Override
    public Set<ClubMember> getClubMembers() {
        return this.clubMembers;
    }

    @Override
    public void setClubMembers(Set<ClubMember> clubMembers) {
        this.clubMembers = clubMembers;
    }
    
}
