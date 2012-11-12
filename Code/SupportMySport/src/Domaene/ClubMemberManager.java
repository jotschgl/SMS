/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.ClubMember;
import Persistence.PersistenceManager;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dennis
 */
public class ClubMemberManager {

    private PersistenceManager persistenceManager;

    public ClubMemberManager() {
        persistenceManager = new PersistenceManager();
    }

    public List<ClubMember> getAllClubMembers() {
        List<ClubMember> foundClubMembers = new LinkedList<ClubMember>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM ClubMember");
        for (Object obj : result) {
            foundClubMembers.add((ClubMember) obj);
        }
        return foundClubMembers;
    }

    public ClubMember getClubMemberById(int id) {
        return (ClubMember) persistenceManager.getObjectById(ClubMember.class, id);
    }

    public ClubMember getClubMemberById(ClubMember clubmember) {
        return (ClubMember) persistenceManager.getObjectById(ClubMember.class, clubmember.getId());
    }

    public void createOrUpdateClubMember(ClubMember clubMember) {
        persistenceManager.update(clubMember);
    }

    public List<ClubMember> searchMembersByAttributes(String attributes) {
        List<ClubMember> foundClubMembers = new LinkedList<ClubMember>();
        String hqlQuerie = "FROM ClubMember cb WHERE (cb.firstname LIKE '%" + attributes + "%' or cb.lastname LIKE '%" + attributes + "%')";
        List<Object> results = persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        for (Object obj : results) {
            foundClubMembers.add((ClubMember) obj);
        }
        return foundClubMembers;
    }

    ClubMember getClubMemberByUsername(String username) {

        String hqlQuerie = "FROM ClubMember cb WHERE (cb.username = '" + username + "')";
        return (ClubMember) persistenceManager.getObjectsByHQLQuery(hqlQuerie);
    }
}
