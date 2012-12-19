/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import Communication.ClubMemberDTO;
import Communication.ClubMemberDTOControllerFactoryRemote;
import Communication.FunctionRoleDTO;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Andreas
 */
@ManagedBean (name="login")
@SessionScoped
public class Login {

    @EJB
    private ClubMemberDTOControllerFactoryRemote clubMemberDTOControllerFactory;
    private ClubMemberDTO loggedInMember;
    private String username;
    private String password;
    private String userFirstname;
    private boolean loggedIn = false;
    private boolean userHasEnoughRights = false;
    private int trainerRoleId = 5;
    private int abteilungsleiterRoleId = 7;
    

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
            setLoggedInMember(clubMemberDTOControllerFactory.getLoggedInClubmember());
            System.out.println(loggedInMember.getLastname());
            userFirstname = getLoggedInMember().getFirstname();
            loggedIn = true;
            return "show";
        } else {
            return "loginFailed";
        }
    }

    /**
     * @return the userHasPermissionForChangings
     */
    public boolean getUserHasEnoughRights() {
        userHasEnoughRights = checkPermissions();
        return userHasEnoughRights;
    }

    /**
     * @param userHasPermissionForChangings the userHasPermissionForChangings to set
     */
    public void setUserHasEnoughRights(boolean userHasEnoughRights) {
        this.userHasEnoughRights = userHasEnoughRights;
    }
    
    private boolean checkPermissions(){
        if(loggedInMember == null){
            return false;
        }
        for(FunctionRoleDTO role : loggedInMember.getAllFunctionRolesOfClubMember()){
            if(role.getId() == abteilungsleiterRoleId || role.getId() == trainerRoleId){
                return true;
            }
        }
        return false;
    }
}
