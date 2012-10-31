package Domaene;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


public class Federation implements java.io.Serializable {

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

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Set<ClubMember> getClubMembers() {
        return this.clubMembers;
    }

    public void setClubMembers(Set<ClubMember> clubMembers) {
        this.clubMembers = clubMembers;
    }

    public Set<League> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }
}
