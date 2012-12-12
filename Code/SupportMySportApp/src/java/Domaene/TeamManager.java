/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.PersistenceManager;
import Persistence.Team;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Dennis
 */
public class TeamManager {
    
    private PersistenceManager persistenceManager;
    
    public TeamManager(){
        persistenceManager = new PersistenceManager();
    }
    
    public Collection<Team> getAllTeams(){
        Collection<Team> allTeams = new LinkedList<Team>();
        Collection<Object> allObjects = persistenceManager.getObjectsByHQLQuery("From Team");
        for(Object obj : allObjects){
            allTeams.add((Team)obj);
        }
        return allTeams;
    }
    
}
