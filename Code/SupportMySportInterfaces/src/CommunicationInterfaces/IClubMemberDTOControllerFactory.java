/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 *
 * @author Dennis
 */
public interface IClubMemberDTOControllerFactory extends Remote {

    void createOrUpdateClubMember(ClubMemberDTO clubMemberDTO) throws RemoteException;

    Collection<ClubMemberDTO> getAllClubMembers() throws RemoteException;

    public ClubMemberDTO getClubmemberByUserName(String username) throws RemoteException;

    public ClubMemberDTO getLoggedInClubmember() throws RemoteException;

    public boolean login(String username, String password) throws RemoteException;

    public Collection<ClubMemberDTO> getAllTeamMembers(TeamDTO team) throws RemoteException;
    
}
