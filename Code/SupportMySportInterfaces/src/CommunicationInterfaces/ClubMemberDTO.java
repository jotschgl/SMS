package CommunicationInterfaces;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Dennis
 */
public class ClubMemberDTO implements Serializable {

    private Integer id = -1;
    private String firstname;
    private String lastname;
    private String username;
    private String street;
    private String city;
    private String country;
    private String zip;
    private String mail;
    private String phone;
    private char gender;
    private Date birthday;
    private Boolean membershipFeePayed;
    private SportDTO sport;
    private Collection<FunctionRoleDTO> clubMembersRoles;

    public ClubMemberDTO(String firstname, String lastname, String username, String street, String city, String country, String zip, String email, String phone, char gender, Date birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.mail = email;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
        this.clubMembersRoles = new LinkedList<FunctionRoleDTO>();
    }

    public ClubMemberDTO(String firstname, String lastname, String username, String street, String city, String country, String zip, String email, String phone, char gender, Date birthday, Collection<FunctionRoleDTO> allRoles) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
        this.mail = email;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
        this.clubMembersRoles = allRoles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the membershipFeePayed
     */
    public Boolean getMembershipFeePayed() {
        return membershipFeePayed;
    }

    /**
     * @param membershipFeePayed the membershipFeePayed to set
     */
    public void setMembershipFeePayed(Boolean membershipFeePayed) {
        this.membershipFeePayed = membershipFeePayed;
    }

    /**
     * @return the sport
     */
    public SportDTO getSport() {
        return sport;
    }

    /**
     * @param sport the sport to set
     */
    public void setSport(SportDTO sport) {
        this.sport = sport;
    }

    public Collection<FunctionRoleDTO> getAllFunctionRolesOfClubMember() {
        return this.clubMembersRoles;
    }

    public void addFunctionRole(FunctionRoleDTO function) {
        this.clubMembersRoles.add(function);
    }
}
