/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.interfaces;

import java.util.Collection;

/**
 *
 * @author Johannes
 */
public interface ILoginController {

    boolean auth(String username, String pw);

    public Collection<String> getRolses(String username);
}
