/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.ClubMember;
import Persistence.League;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Johannes
 */
public interface IFederation extends Serializable
{

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "MemberFederation", catalog = "c1teamf", joinColumns =
    {
        @JoinColumn(name = "federation_id", nullable = false, updatable = false)
    }, inverseJoinColumns =
    {
        @JoinColumn(name = "clubMember_id", nullable = false, updatable = false)
    })
    Set<ClubMember> getClubMembers();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "federation")
    Set<League> getLeagues();

    @Column(name = "name", unique = true, nullable = false, length = 45)
    String getName();

    @Column(name = "website", length = 45)
    String getWebsite();

    void setClubMembers(Set<ClubMember> clubMembers);

    void setId(Integer id);

    void setLeagues(Set<League> leagues);

    void setName(String name);

    void setWebsite(String website);
    
}
