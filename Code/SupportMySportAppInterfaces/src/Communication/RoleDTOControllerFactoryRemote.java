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
public interface RoleDTOControllerFactoryRemote {

    public Collection<FunctionRoleDTO> getAllRoles();
}
