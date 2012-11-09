/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.interfaces.ILoginController;
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
    public boolean auth(String id, String pw) {
        id = "jsc8968";
        pw = "pprotona";

        id = "tf-test";
        pw = "";

        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, "ldaps://ldap.fhv.at:636/dc=uclv,dc=net");


        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        if (id.equals("tf-test")) {
            env.put(Context.SECURITY_PRINCIPAL, "uid=" + id + ",ou=apps,dc=uclv,dc=net"); // specify the username
        } else {
            env.put(Context.SECURITY_PRINCIPAL, "uid=" + id + ",ou=fhv,ou=People,dc=uclv,dc=net"); // specify the username
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
}
