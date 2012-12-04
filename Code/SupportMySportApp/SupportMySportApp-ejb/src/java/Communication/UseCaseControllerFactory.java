/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import javax.ejb.Stateless;

/**
 *
 * @author Dennis
 */
@Stateless
public class UseCaseControllerFactory implements UseCaseControllerFactoryRemote {

    public UseCaseControllerFactory()  {
    }

    @Override
    public ClubMemberDTOControllerFactoryRemote createClubMemberController()  {
        return new ClubMemberDTOControllerFactory();
    }

    @Override
    public CompetitionDTOControllerFactoryRemote createCompetitionController()  {
        return new CompetitionDTOControllerFactory();
    }

    @Override
    public RoleDTOControllerFactoryRemote createRoleController()  {
        return new RoleDTOControllerFactory();
    }

    @Override
    public DepartmentDTOControllerFactoryRemote createDepartmentController()  {
        return new DepartmentDTOControllerFactory();
    }

    @Override
    public MessageControllerFactoryRemote createMessageControllerFactory()  {
        return new MessageControllerFactory();
    }
}
