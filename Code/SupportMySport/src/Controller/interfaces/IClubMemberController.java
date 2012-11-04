/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.interfaces;

import Communication.ClubMemberDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 *
 * @author Johannes
 */
public interface IClubMemberController extends Remote
{
    void createOrUpdateClubMember(ClubMemberDTO clubMember) throws RemoteException;

    Collection<ClubMemberDTO> getAllClubMembers() throws RemoteException;

    Collection<ClubMemberDTO> searchMemberByAttributes(String attributes) throws RemoteException;
}
