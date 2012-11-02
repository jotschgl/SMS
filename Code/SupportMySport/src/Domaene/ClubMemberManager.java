/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

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
        List<Domaene.ClubMember> result = new LinkedList<ClubMember>();
        for(Object obj : persistenceClubMembers){
            ClubMember cb = (ClubMember) obj;
            result.add(new Domaene.ClubMember(cb.getFirstname(), cb.getLastname(), cb.getUsername(), cb.getStreet(), cb.getCity(), cb.getCountry(), cb.getZip(), cb.getEmail(), cb.getPhone(), cb.getGender(), cb.getBirthday()));
        }
        return result;
    }
}
