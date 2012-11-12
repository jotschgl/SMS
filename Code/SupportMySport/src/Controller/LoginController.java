/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.interfaces.ILoginController;
import Domaene.DomainFacade;
import Persistence.FunctionRole;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Johannes
 */
public class LoginController implements ILoginController {

    @Override
    public boolean auth(String username, String pw) {
        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, "ldaps://ldap.fhv.at:636/dc=uclv,dc=net");


        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        if (username.equals("tf-test")) {
            env.put(Context.SECURITY_PRINCIPAL, "uid=" + username + ",ou=apps,dc=uclv,dc=net"); // specify the username
        } else {
            env.put(Context.SECURITY_PRINCIPAL, "uid=" + username + ",ou=fhv,ou=People,dc=uclv,dc=net"); // specify the username
        }

        env.put(Context.SECURITY_CREDENTIALS, pw);
        try {
            Context ctx = new InitialContext(env);
            System.out.println("You have Access");
            return true;

        } catch (NamingException e) {
            System.out.println("Wrong pw or username");
        }

        return false;
    }

    @Override
    public Collection<String> getRolses(String username) {
        DomainFacade f = new DomainFacade();
        ArrayList<String> al = new ArrayList<String>();
        for (FunctionRole r : f.getRolesOfClubmember(username)) {
            al.add(r.getName());
        }
        return al;
    }
}
