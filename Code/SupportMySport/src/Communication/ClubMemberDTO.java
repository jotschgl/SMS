package Communication;

import Persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Dennis
 */
public class ClubMemberDTO implements Serializable
{
    private int id;
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
    private Sport sport;
    private Team team;
    private Collection<Department> departments;
    private Collection<FunctionRole> roles;

    public ClubMemberDTO()
    {
    }

    public ClubMemberDTO(ClubMember member)
    {
        this.setBirthday(new Date(member.getBirthday().getTime()));
        this.setCity(member.getCity());
        this.setCountry(member.getCountry());
        this.setDepartments(member.getDepartments());
        this.setFirstname(member.getFirstname());
        this.setGender(member.getGender());
        this.setLastname(member.getLastname());
        this.setMail(member.getEmail());
        this.setMembershipFeePayed(member.getMembershipfeePayed());
        this.setPhone(member.getPhone());
        this.setRoles(member.getFunctionRoles());
        this.setStreet(member.getStreet());
        this.setUsername(member.getUsername());
        this.setZip(member.getZip());
        //this.setSport(member.ge);
    }
    
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
    }

    public int getId()
    {
        return id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname()
    {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname()
    {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    /**
     * @return the username
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * @return the street
     */
    public String getStreet()
    {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street)
    {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry()
    {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country)
    {
        this.country = country;
    }

    /**
     * @return the zip
     */
    public String getZip()
    {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip)
    {
        this.zip = zip;
    }

    /**
     * @return the mail
     */
    public String getMail()
    {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail)
    {
        this.mail = mail;
    }

    /**
     * @return the phone
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    /**
     * @return the gender
     */
    public char getGender()
    {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday()
    {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    /**
     * @return the membershipFeePayed
     */
    public Boolean getMembershipFeePayed()
    {
        return membershipFeePayed;
    }

    /**
     * @param membershipFeePayed the membershipFeePayed to set
     */
    public void setMembershipFeePayed(Boolean membershipFeePayed)
    {
        this.membershipFeePayed = membershipFeePayed;
    }

    /**
     * @return the roles
     */
    public Collection<FunctionRole> getRoles()
    {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(Collection<FunctionRole> roles)
    {
        this.roles = roles;
    }

    public Collection<Department> getDepartments()
    {
        return departments;
    }

    public void setDepartments(Collection<Department> departments)
    {
        this.departments = departments;
    }

    public Sport getSport()
    {
        return sport;
    }

    public void setSport(Sport sport)
    {
        this.sport = sport;
    }

    public Team getTeam()
    {
        return team;
    }

    public void setTeam(Team team)
    {
        this.team = team;
    }
}
