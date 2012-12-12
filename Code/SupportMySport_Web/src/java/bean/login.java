/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import Communication.ClubMemberDTO;
import Communication.ClubMemberDTOControllerFactoryRemote;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Andreas
 */
@ManagedBean
@SessionScoped
public class login {

    @EJB
    private ClubMemberDTOControllerFactoryRemote clubMemberDTOControllerFactory;
    private ClubMemberDTO loggedInMember;
    private String username;
    private String password;
    private String userFirstname;
    private boolean loggedIn = false;

    public String getUsername() {
        return username;
    }

    public void setUsername(String _username) {
        this.username = _username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String _password) {
        this.password = _password;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public ClubMemberDTOControllerFactoryRemote getClubMemberDTOControllerFactory() {
        return clubMemberDTOControllerFactory;
    }

    public void setClubMemberDTOControllerFactory(ClubMemberDTOControllerFactoryRemote clubMemberDTOControllerFactory) {
        this.clubMemberDTOControllerFactory = clubMemberDTOControllerFactory;
    }

    public ClubMemberDTO getLoggedInMember() {
        return loggedInMember;
    }

    public void setLoggedInMember(ClubMemberDTO loggedInMember) {
        this.loggedInMember = loggedInMember;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    
    public String logout() {
        loggedIn = false;
        loggedInMember = null;
        userFirstname = null;
        username = null;
        password = null;
        return "index";
    }
  
    public String checkUserData() {
        if (clubMemberDTOControllerFactory.login(username, password)) {
            setLoggedInMember(clubMemberDTOControllerFactory.getClubmemberByUserName(username));
            userFirstname = getLoggedInMember().getFirstname();

            loggedIn = true;
            return "show";
        } else {
            return "loginFailed";
        }
    }
}
