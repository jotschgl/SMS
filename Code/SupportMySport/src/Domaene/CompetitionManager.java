/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.ClubMember;
import Persistence.PersistenceManager;
import Persistence.Competition;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author rafa
 */
public class CompetitionManager {

    // <editor-fold defaultstate="collapsed" desc="Getting Data from Competitiontable">
    public Competition getCompetitinById(int id) {  
        PersistenceManager persistenceManager = new PersistenceManager();
        return (Persistence.Competition) persistenceManager.getObjectById(Persistence.Competition.class, id);
    }   

    public List<Competition> getCompetitionsByName(String name) {
        String hqlQuerie = "FROM Competition cp WHERE (cp.name LIKE '"+name+"')";
        PersistenceManager persistenceManager = new PersistenceManager();
        List<Competition> competitions = new LinkedList<Competition>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        for(Object obj : result){
            competitions.add((Competition)obj);
        }
        return competitions;
    }

    public List<Competition> getCompetitionByDepartmentId(int departmentId) {
        String hqlQuerie = "FROM Competition cp WHERE (cp.department_id LIKE '"+departmentId+"')";
        PersistenceManager persistenceManager = new PersistenceManager();
        List<Competition> competitions = new LinkedList<Competition>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        for(Object obj : result){
            competitions.add((Competition)obj);
        }
        return competitions;
    }

    public List<Competition> getCompetitionByDate(Date date) {
        String dateString = (date.getYear() + 1900) + "-" + (date.getMonth()+1) + "-" + date.getDate();
        String hqlQuerie = "FROM Competition cp WHERE (cp.dateOfCompetition = '"+dateString+"')";
        
        PersistenceManager persistenceManager = new PersistenceManager();
        List<Competition> competitions = new LinkedList<Competition>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        for(Object obj : result){
            competitions.add((Competition)obj);
        }
        return competitions;
    }

    public List<Competition> getAllCompetitionsBetweenPeriod(Date startdate, Date enddate) {
        String startdateString = (startdate.getYear() + 1900) + "-" + (startdate.getMonth()+1) + "-" + startdate.getDate();
        String enddateString = (enddate.getYear() + 1900) + "-" + (enddate.getMonth()+1) + "-" + enddate.getDate();
        String hqlQuerie = "FROM Competition cp WHERE (cp.dateOfCompetition between '"+startdateString+"' and '"+enddateString+"')";
        PersistenceManager persistenceManager = new PersistenceManager();
        List<Competition> competitions = new LinkedList<Competition>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        for(Object obj : result){
            competitions.add((Competition)obj);
        }
        return competitions;
    }

    public List<Competition> getAllCompetitions() {
        String hqlQuerie = "FROM Competition";
        PersistenceManager persistenceManager = new PersistenceManager();
        List<Competition> competitions = new LinkedList<Competition>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        for(Object obj : result){
            competitions.add((Competition)obj);
        }
        return competitions;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Creating a new Competition">
    public void createNewCompetition(Competition competition){
        PersistenceManager persitenceManager = new PersistenceManager();
        persitenceManager.save(competition);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Updateing a existing Competition">
    public void updateExistingCompetition(Competition competition){
        PersistenceManager persistenceManager = new PersistenceManager();
        persistenceManager.update(competition);
    }
    // </editor-fold>
}
