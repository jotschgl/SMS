package Persistence;
// Generated 28.10.2012 20:58:08 by Hibernate Tools 3.2.1.GA

import Persistence.interfaces.IFederation;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Federation generated by hbm2java
 */
@Entity
@Table(name = "Federation", catalog = "c1teamf", uniqueConstraints =
@UniqueConstraint(columnNames = "name"))
public class Federation implements IFederation {

    private Integer id;
    private String name;
    private String website;
    private Set<ClubMember> clubMembers = new HashSet<ClubMember>(0);
    private Set<League> leagues = new HashSet<League>(0);

    public Federation() {
    }

    public Federation(String name) {
        this.name = name;
    }

    public Federation(String name, String website, Set<ClubMember> clubMembers, Set<League> leagues) {
        this.name = name;
        this.website = website;
        this.clubMembers = clubMembers;
        this.leagues = leagues;
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

    @Column(name = "name", unique = true, nullable = false, length = 45)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "website", length = 45)
    @Override
    public String getWebsite() {
        return this.website;
    }

    @Override
    public void setWebsite(String website) {
        this.website = website;
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "MemberFederation", catalog = "c1teamf", joinColumns = {
        @JoinColumn(name = "federation_id", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "clubMember_id", nullable = false, updatable = false)})
    @Override
    public Set<ClubMember> getClubMembers() {
        return this.clubMembers;
    }

    @Override
    public void setClubMembers(Set<ClubMember> clubMembers) {
        this.clubMembers = clubMembers;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "federation")
    @Override
    public Set<League> getLeagues() {
        return this.leagues;
    }

    @Override
    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }
}
