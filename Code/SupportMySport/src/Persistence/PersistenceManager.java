/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;

/**
 *
 * @author Dennis
 */
public class PersistenceManager {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Transaction transaction = null;
    private Session session = null;

    public void save(Object object) {
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw ex;
        } finally {
            session.close();
        }
    }

    public void delete(Object object) {
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw ex;
        } finally {
            session.close();
        }
    }
    
    public void update(Object object){
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(object);
            transaction.commit();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw ex;
        } finally {
            session.close();
        }
    }
    
    public Object getObjectById(Class type, int id){
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Object result = session.get(type, id);
            transaction.commit();
            return result;
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw ex;
        } finally {
            session.close();
        }
    }
    
    /**
     *
     * @param hqlQuery
     * @return
     */
    public List<Object> getObjectsByHQLQuery(String hqlQuery){
        try{
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        return session.createQuery(hqlQuery).list();
        } catch (HibernateException ex){
            if(transaction != null){
                transaction.rollback();
            }
            throw ex;
        } finally{
            session.close();
        }  
    }
}
