/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import CommunicationInterfaces.ClubMemberDTO;
import CommunicationInterfaces.IClubMemberDTOControllerFactory;
import Controller.ClubMemberController;
import Persistence.ClubMember;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Dennis
 */
public class ClubMemberDTOControllerFactory extends UnicastRemoteObject implements IClubMemberDTOControllerFactory {

    private ClubMemberController clubMemberController;
    private DTOAssembler dtoAssembler;

    public ClubMemberDTOControllerFactory() throws RemoteException {
        clubMemberController = new ClubMemberController();
        dtoAssembler = new DTOAssembler();
    }

    @Override
    public void createOrUpdateClubMember(ClubMemberDTO clubMemberDTO) throws RemoteException {
        clubMemberController.createOrUpdateClubMember(dtoAssembler.updateClubMemberEntity(clubMemberDTO));
    }

    @Override
    public Collection<ClubMemberDTO> getAllClubMembers() throws RemoteException {
        Collection<ClubMemberDTO> allClubMembers = new LinkedList<ClubMemberDTO>();
        for (ClubMember clubMember : clubMemberController.getAllClubMembers()) {
            allClubMembers.add(dtoAssembler.createClubMemberDTO(clubMember));
        }
        return allClubMembers;
    }
}
