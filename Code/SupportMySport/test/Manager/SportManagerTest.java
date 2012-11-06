/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Domaene.SportManager;
import Persistence.Department;
import Persistence.PersistenceManager;
import Persistence.Rule;
import Persistence.Sport;
import java.util.LinkedList;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;


public class SportManagerTest {
    
    @Test
    public void getAllSportsTest(){
      SportManager sm = new SportManager();
      List<Sport> s;
      s = sm.getAllSports();
      System.out.println("");
      System.out.println("In getAllSportsTest");
      System.out.println("Getting all Sports");
      System.out.println("Length of list: " + s.size());
      System.out.println("");
    }
    
    @Test
    public void getSportByIdTest(){
      SportManager sm = new SportManager();
      Sport s;
      s = sm.getSportsById(1);
      System.out.println("");
      System.out.println("In getSportsByIdTest");
      System.out.println("Getting Sport");
      System.out.println("Name of sport: " + s.getName());
      System.out.println("");
    }
    
    @Test
    public void getSportByName(){
      String name = "Handball";
      SportManager sm = new SportManager();
      Sport s;
      s = sm.getSportByName(name);
      System.out.println("");
      System.out.println("In getSportsByName");
      System.out.println("Getting Sport: " + name);
      System.out.println("Name of sport: " + s.getName());
      System.out.println("");
    }
    @Ignore
    @Test
    public void createOrUpdateSportTest(){
        String name = "frisbee";
        PersistenceManager pm = new PersistenceManager();
        Department dep = (Department)pm.getObjectById(Department.class, 1);
        Rule r = (Rule)pm.getObjectById(Rule.class, 1);
        Sport s = new Sport(dep, r, name);
        SportManager sm = new SportManager();
        sm.createOrUpdateSport(s);
        System.out.println("");
        System.out.println("In getSportsByName");
        System.out.println("Getting Sport: " + name);
        System.out.println("Name of sport: " + s.getName());
        System.out.println("");
    }
}
