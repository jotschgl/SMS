package Communication;

import Persistence.ClubMember;
import java.util.Date;

/**
 *
 * @author Raphaela
 */
public class GUIClubMemberCreateDTO {

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

    public GUIClubMemberCreateDTO() {
    }

    public GUIClubMemberCreateDTO(ClubMember member) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setUsername(username);
        this.setStreet(street);
        this.setCity(city);        
        this.setCountry(country);
        this.setZip(zip);
        this.setMail(mail);
        this.setPhone(phone);
        this.setGender(gender);
        this.setBirthday(birthday);
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
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getZip() {
        return zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
