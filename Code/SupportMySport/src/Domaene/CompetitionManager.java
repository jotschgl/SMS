/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.PersistenceManager;
import Persistence.Competition;
/**
 *
 * @author rafa
 */
public class CompetitionManager {

    public Competition getCompetitinById(int id) {  
        PersistenceManager persistenceManager = new PersistenceManager();
        return (Persistence.Competition) persistenceManager.getObjectById(Persistence.Competition.class, id);
    }   
    
}
