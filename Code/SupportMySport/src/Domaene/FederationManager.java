/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.Department;
import Persistence.Federation;
import Persistence.PersistenceManager;
import java.util.LinkedList;
import java.util.List;


public class FederationManager {
    
     private PersistenceManager persistenceManager;
    
    public FederationManager(){
        persistenceManager = new PersistenceManager();
    }
    
    public List<Federation> getAllFederations(){
        List<Federation> federations = new LinkedList<Federation>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Federation");
        for(Object obj : result){
            federations.add((Federation)obj);
        }
        return federations;
    }
    
    public Federation getFederationById(int id){
        return (Federation) persistenceManager.getObjectById(Federation.class, id);
    }
    
    public Federation getFederationById(Federation federation){
        return (Federation) persistenceManager.getObjectById(Federation.class, federation.getId());
    }
    
    public Federation getFederationByName(String name){
         Federation fed = null;
         List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Federation f WHERE f.name LIKE '" +name+ "')");
         if(result.size() == 1){
             fed = (Federation) result.get(0);
         }
         return fed;
    }
    
    public void createOrUpdateFederation(Federation federation) {
        persistenceManager.update(federation);
    }
}
