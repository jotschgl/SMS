package Controller;

import Communication.ClubMemberDTO;
import Controller.interfaces.IClubMemberController;
import Domaene.DomainFacade;
import Persistence.ClubMember;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.LinkedList;

public class ClubMemberController extends UnicastRemoteObject implements IClubMemberController
{
    private DomainFacade myDomainFacade;

    public ClubMemberController() throws RemoteException
    {
        super();
        myDomainFacade = new DomainFacade();
    }

    @Override
    public void createOrUpdateClubMember(ClubMemberDTO clubMember) throws RemoteException
    {
        ClubMember mem = new ClubMember(clubMember.getFirstname(), clubMember.getLastname(), clubMember.getUsername(), clubMember.getStreet(), clubMember.getCity(), clubMember.getCountry(), clubMember.getZip(), clubMember.getMail(), clubMember.getPhone(), clubMember.getGender(), clubMember.getBirthday());
        myDomainFacade.createOrUpdateClubMember(mem);
    }

    @Override
    public Collection<ClubMemberDTO> getAllClubMembers() throws RemoteException
    {
        Collection<ClubMemberDTO> retval = new LinkedList<ClubMemberDTO>();
        for (ClubMember member : myDomainFacade.getAllClubMembers())
        {
            retval.add(new ClubMemberDTO(member));
        }
        return retval;
    }

    @Override
    public Collection<ClubMemberDTO> searchMemberByAttributes(String attributes) throws RemoteException
    {
        Collection<ClubMemberDTO> retval = new LinkedList<ClubMemberDTO>();
        for (ClubMember member : myDomainFacade.searchMemberByAttributes(attributes))
        {
            retval.add(new ClubMemberDTO(member));
        }
        return retval;

    }
}
