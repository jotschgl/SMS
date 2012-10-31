/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domäne;

import Persistence.PersistenceManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dennis
 */
public class DomainFacade implements IDomainFacade{

    private PersistenceManager persistenceManager;

    public DomainFacade(PersistenceManager manager) {
        persistenceManager = manager;
    }

    @Override
    public Object deepCopy(Object o) {
        try {
            ByteArrayOutputStream byteouts = new ByteArrayOutputStream();
            new ObjectOutputStream(byteouts).writeObject(o);
            ByteArrayInputStream byteAIns = new ByteArrayInputStream(byteouts.toByteArray());
            return new ObjectInputStream(byteAIns).readObject();
        } catch (ClassNotFoundException ex) {
            //TODO log file
        } catch (IOException ex) {
            //TODO log file
        }
        return null;
    }
}
