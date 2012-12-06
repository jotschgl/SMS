/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.util.Collection;
import javax.ejb.Remote;

/**
 *
 * @author Dennis
 */
@Remote
public interface ClubMemberDTOControllerFactoryRemote {

    void createOrUpdateClubMember(ClubMemberDTO clubMemberDTO);

    Collection<ClubMemberDTO> getAllClubMembers();

    public ClubMemberDTO getClubmemberByUserName(String username);

    public ClubMemberDTO getLoggedInClubmember();

    public boolean login(String username, String password);

    public Collection<ClubMemberDTO> getAllTeamMembers(TeamDTO team);

    public void getHello(TestInterface t);

    public void sayHello();
}
