package Persistence;
// Generated 11.11.2012 20:07:48 by Hibernate Tools 3.2.1.GA

import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * ClubMember generated by hbm2java
 */
@Entity
@Table(name = "ClubMember", catalog = "c1teamf", uniqueConstraints =
@UniqueConstraint(columnNames = "username"))
public class ClubMember implements java.io.Serializable {

    private Integer id;
    private String firstname;
    private String lastname;
    private String username;
    private String street;
    private String city;
    private String country;
    private String zip;
    private String email;
    private String phone;
    private char gender;
    private Date birthday;
    private Sport sport;
    private Boolean membershipfeePayed;
    private Set<CompetitionTeam> competitionTeams = new HashSet<CompetitionTeam>(0);
    private Set<Federation> federations = new HashSet<Federation>(0);
    private Set<Team> teams = new HashSet<Team>(0);
    private Set<FunctionRole> functionRoles = new HashSet<FunctionRole>(0);
    private Set<Department> departments = new HashSet<Department>(0);
    private Set<Team> teams_1 = new HashSet<Team>(0);

    public ClubMember() {
    }

    public ClubMember(String firstname, String lastname, String username, String street, String city, String country, String zip, String email, String phone, char gender, Date birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
    }

    public ClubMember(String firstname, String lastname, String username, String street, String city, String country, String zip, String email, String phone, char gender, Date birthday, Boolean membershipfeePayed, Set competitionTeams, Set federations, Set teams, Set functionRoles, Set departments, Set teams_1) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
        this.membershipfeePayed = membershipfeePayed;
        this.competitionTeams = competitionTeams;
        this.federations = federations;
        this.teams = teams;
        this.functionRoles = functionRoles;
        this.departments = departments;
        this.teams_1 = teams_1;
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

    @Column(name = "firstname", nullable = false, length = 45)
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "lastname", nullable = false, length = 45)
    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "username", unique = true, nullable = false, length = 45)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "street", nullable = false, length = 45)
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "city", nullable = false, length = 45)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "country", nullable = false, length = 45)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "zip", nullable = false, length = 45)
    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "phone", nullable = false, length = 45)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "gender", nullable = false, length = 1)
    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "birthday", nullable = false, length = 10)
    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(name = "membershipfeePayed")
    public Boolean getMembershipfeePayed() {
        return this.membershipfeePayed;
    }

    public void setMembershipfeePayed(Boolean membershipfeePayed) {
        this.membershipfeePayed = membershipfeePayed;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "clubMember")
    public Set<CompetitionTeam> getCompetitionTeams() {
        return this.competitionTeams;
    }

    public void setCompetitionTeams(Set<CompetitionTeam> competitionTeams) {
        this.competitionTeams = competitionTeams;
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "MemberFederation", catalog = "c1teamf", joinColumns = {
        @JoinColumn(name = "clubMember_id", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "federation_id", nullable = false, updatable = false)})
    public Set<Federation> getFederations() {
        return this.federations;
    }

    public void setFederations(Set<Federation> federations) {
        this.federations = federations;
    }

    @ManyToMany(mappedBy="clubMembers")
    public Set<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "MemberFunctionRole", catalog = "c1teamf", joinColumns = {
        @JoinColumn(name = "clubMember_id", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "functionRole_id", nullable = false, updatable = false)})
    public Set<FunctionRole> getFunctionRoles() {
        return this.functionRoles;
    }

    public void setFunctionRoles(Set<FunctionRole> functionRoles) {
        this.functionRoles = functionRoles;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "clubMember")
    public Set<Department> getDepartments() {
        return this.departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "clubMember")
    public Set<Team> getTeams_1() {
        return this.teams_1;
    }

    public void setTeams_1(Set<Team> teams_1) {
        this.teams_1 = teams_1;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 17 * hash + (this.firstname != null ? this.firstname.hashCode() : 0);
        hash = 17 * hash + (this.lastname != null ? this.lastname.hashCode() : 0);
        hash = 17 * hash + (this.username != null ? this.username.hashCode() : 0);
        hash = 17 * hash + (this.street != null ? this.street.hashCode() : 0);
        hash = 17 * hash + (this.city != null ? this.city.hashCode() : 0);
        hash = 17 * hash + (this.country != null ? this.country.hashCode() : 0);
        hash = 17 * hash + (this.zip != null ? this.zip.hashCode() : 0);
        hash = 17 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 17 * hash + (this.phone != null ? this.phone.hashCode() : 0);
        hash = 17 * hash + this.gender;
        hash = 17 * hash + (this.birthday != null ? this.birthday.hashCode() : 0);
        hash = 17 * hash + (this.membershipfeePayed != null ? this.membershipfeePayed.hashCode() : 0);
        //hash = 17 * hash + (this.competitionTeams != null ? this.competitionTeams.hashCode() : 0);
        hash = 17 * hash + (this.federations != null ? this.federations.hashCode() : 0);
        hash = 17 * hash + (this.functionRoles != null ? this.functionRoles.hashCode() : 0);
        hash = 17 * hash + (this.departments != null ? this.departments.hashCode() : 0);
        hash = 17 * hash + (this.teams_1 != null ? this.teams_1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClubMember other = (ClubMember) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sport_id", nullable = true)
    public Sport getSport() {
        return sport;
    }

    /**
     * @param sport the sport to set
     */
    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
