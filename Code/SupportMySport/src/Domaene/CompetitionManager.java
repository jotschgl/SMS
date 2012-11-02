/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.PersistenceManager;

/**
 *
 * @author Dennis
 */
public class CompetitionManager {
    
    private PersistenceManager persistenceManager;
    
    public CompetitionManager(){
        persistenceManager = new PersistenceManager();
    }
    
}
