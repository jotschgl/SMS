/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;


import Domaene.FederationManager;
import Persistence.Federation;
import Persistence.PersistenceManager;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author rafa
 */
public class FedarationManagerTest {
    @Test
     public void getAllFederationsTest(){
        
        FederationManager fm = new FederationManager();
        List<Federation> fed = fm.getAllFederations();
        System.out.println("");
        System.out.println("In get all federations test.");
        System.out.println("Listlenght " + fed.size());
        System.out.println("");
    }
    
    @Test
    public void getFederationsByIdTest(){
        FederationManager fm = new FederationManager();
        Federation fed = fm.getFederationById(1);
        System.out.println("");
        System.out.println("In get federation by id test.");
        System.out.println("Federationname " + fed.getName());
        System.out.println("");
    }
    
    @Test
    public void getFederationsByNameTest(){
        String name = "DFB";
        FederationManager fm = new FederationManager();
        Federation fed = fm.getFederationByName(name);
        System.out.println("");
        System.out.println("In get federation by name: " + name);
        System.out.println("Federationname: " + fed.getName());
        System.out.println("");
    }
    
    @Ignore
    @Test
    public void createOrUpdateFederationsTest(){
        PersistenceManager mng = new PersistenceManager();
        Federation fed = new Federation("Gönki");
        FederationManager fm = new FederationManager();
        fm.createOrUpdateFederation(fed);
    }
}
