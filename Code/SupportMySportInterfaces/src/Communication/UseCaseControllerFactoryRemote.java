/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import javax.ejb.Remote;

/**
 *
 * @author Johannes
 */
@Remote
public interface UseCaseControllerFactoryRemote {

    public ClubMemberDTOControllerFactoryRemote createClubMemberController();

    public CompetitionDTOControllerFactoryRemote createCompetitionController();

    public RoleDTOControllerFactoryRemote createRoleController();

    public DepartmentDTOControllerFactoryRemote createDepartmentController();

    public MessageControllerFactoryRemote createMessageControllerFactory();
}
