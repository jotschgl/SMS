/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import Persistence.ClubMember;
import java.util.Date;

/**
 *
 * @author Raphaela
 */
public class GUIClubMemberSearchDTO {

    private String firstname;
    private String lastname;
    private String country;
    private String city;
    private String mail;
    private Date birthday;

    public GUIClubMemberSearchDTO() {
    }

    public GUIClubMemberSearchDTO(ClubMember member) {
        this.getFirstname();
        this.getLastname();
        this.getCountry();
        this.getCity();
        this.getMail();
        this.getBirthday();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
