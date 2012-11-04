/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.ClubMember;
import Persistence.RoleRight;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Johannes
 */
public interface IFunctionRole extends Serializable
{

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "MemberFunctionRole", catalog = "c1teamf", joinColumns =
    {
        @JoinColumn(name = "functionRole_id", nullable = false, updatable = false)
    }, inverseJoinColumns =
    {
        @JoinColumn(name = "clubMember_id", nullable = false, updatable = false)
    })
    Set<ClubMember> getClubMembers();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @Column(name = "name", nullable = false, length = 45)
    String getName();

    @ManyToOne(cascade =
    {
        CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH
    }, fetch = FetchType.LAZY)
    @Cascade(value = org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "roleRight_id", nullable = false)
    RoleRight getRoleRight();

    void setClubMembers(Set<ClubMember> clubMembers);

    void setId(Integer id);

    void setName(String name);

    void setRoleRight(RoleRight roleRight);
    
}
