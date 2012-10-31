/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domäne;

import Persistence.PersistenceManager;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dennis
 */
public class ClubMemberManager {
    
    private PersistenceManager persistenceManager;
    
    public ClubMemberManager(){
        persistenceManager = new PersistenceManager();
    }
    
    public List<ClubMember> getAllClubMembers(){
        List<Object> persistenceClubMembers = persistenceManager.getObjectsByHQLQuery("Select * from ClubMember");
        List<Domäne.ClubMember> result = new LinkedList<ClubMember>();
        for(Object obj : persistenceClubMembers){
            
        }
    }
}
