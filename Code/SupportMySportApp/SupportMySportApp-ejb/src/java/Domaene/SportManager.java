/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.Department;
import Persistence.PersistenceManager;
import Persistence.Sport;
import Persistence.Team;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SportManager {

    private PersistenceManager persistenceManager;

    public SportManager() {
        persistenceManager = new PersistenceManager();
    }

    public List<Sport> getAllSports() {
        List<Sport> sports = new LinkedList<Sport>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Sport");
        for (Object obj : result) {
            sports.add((Sport) obj);
        }
        return sports;
    }

    public Sport getSportsById(int id) {
        return (Sport) persistenceManager.getObjectById(Sport.class, id);
    }

    public Sport getSportById(Sport sport) {
        return (Sport) persistenceManager.getObjectById(Sport.class, sport.getId());
    }

    public Sport getSportByName(String name) {
        Sport sep = null;
        List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Sport s WHERE s.name LIKE '" + name + "')");
        if (result.size() == 1) {
            sep = (Sport) result.get(0);
        }
        return sep;
    }

    public void createOrUpdateSport(Sport sport) {
        persistenceManager.update(sport);
    }

    public Collection<Sport> getSportsOfDepartment(Department d) {
        List<Sport> sports = new LinkedList<Sport>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Sport s WHERE s.department = " + d.getId());
        for (Object obj : result) {
            sports.add((Sport) obj);
        }
        return sports;
    }

    public Collection<Team> getAllTeamsOfSport(int sportID) {
        List<Team> result = new LinkedList<Team>();
        for(Object obj : persistenceManager.getObjectsByHQLQuery("FROM Team t where t.sport = " + sportID)){
            result.add((Team)obj);
        }
        return result;
    }
}
