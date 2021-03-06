/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;


import Domaene.CompetitionManager;
import Persistence.Competition;
import Persistence.Department;
import Persistence.PersistenceManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CompetitionManagerTest {
    
   
    
    public CompetitionManagerTest () {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test methods of CompetitionManager
     */
    @Test
    public void testGetCompetitinById(){
         int id = 1;
         CompetitionManager mng = new CompetitionManager();
         Competition testComp = mng.getCompetitinById(id);
         System.out.println();
         System.out.println("Running test on getCompetition by ID");
         System.out.println("Getting Competition with id: " + id);
         System.out.println("Returne Competition with id: " + testComp.getId());
         System.out.println();
    }
    
    @Test
    public void testGetCompetitinByName(){
         String name = "Weltmeisterschaft";
         CompetitionManager mng = new CompetitionManager();
         List<Competition> testComp = mng.getCompetitionsByName(name);
         Competition comp = testComp.get(0);
         System.out.println();
         System.out.println("Running test on getCompetition by Name");
         System.out.println("eturned Competition with name: " + comp.getName());
         System.out.println();
        
    }
    
    @Test
    public void testgetCompetitionByDepartmentId(){
         int departmentId = 3;
         CompetitionManager mng = new CompetitionManager();
         List<Competition> testComp = mng.getCompetitionByDepartmentId(departmentId);
         Competition comp = (Competition) testComp.get(0);
         System.out.println();
         System.out.println("Running test on getCompetition over Departmentid: " + departmentId);
         System.out.println("Returned Competition with name: " + comp.getName());
         System.out.println();
        
    }

    @Test
    public void testgetCompetitionByDate() throws ParseException{            
 
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
         String strDateTo = "2012-12-12";
         Date startDate = formatter.parse(strDateTo);
         CompetitionManager mng = new CompetitionManager();
         List<Competition> testComp = mng.getCompetitionByDate(startDate);
         Competition comp =  testComp.get(0);
         System.out.println();
         System.out.println("Running test on getCompetition over Date: " + startDate.getYear() + "-" + startDate.getMonth() + "-" + startDate.getDate());
         System.out.println("Length of list: " + testComp.size());
         System.out.println("Running test on getCompetition over Date");
         System.out.println("Returned Competition with date: " + comp.getDateOfCompetition());
         System.out.println();
        
    }
    
    @Test
    public void testgetAllCompetitionsBetweenPeriod() throws ParseException{            
 
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
         String startDateTo = "2012-12-12";
         String endDateTo = "2013-12-24";
         Date startDate = formatter.parse(startDateTo);
         Date endDate = formatter.parse(endDateTo);
         CompetitionManager mng = new CompetitionManager();
         List<Competition> testComp = mng.getAllCompetitionsBetweenPeriod(startDate, endDate);
         Competition comp =  testComp.get(0);
         System.out.println();
         System.out.println("Running test on getCompetition between Dates: ");
         System.out.println("Length of list: " + testComp.size());
         System.out.println("Returned one of a Competition with date: " + comp.getDateOfCompetition());
         System.out.println();
        
    }
    
    @Test
    public void testgetAllCompetitions() throws ParseException{            
         CompetitionManager mng = new CompetitionManager();
         List<Competition> testComp = mng.getAllCompetitions();
         Competition comp = testComp.get(0);
         System.out.println();
         System.out.println("Running test on getAllCompetitions:");
         System.out.println("Length of list: " + testComp.size());
         System.out.println();
    }
    
    @Ignore
    @Test
    public void testUpdateExistingCompetition(){
        
        //Getting an existing Competition
        PersistenceManager mngr = new PersistenceManager();
        Competition comp = (Competition) mngr.getObjectById(Competition.class, 1);
        Random generator = new Random( 19580427 );
        int randomFee = generator.nextInt();
        comp.setCompetitionfee(randomFee);
        
        CompetitionManager compMngr = new CompetitionManager();
        compMngr.updateExistingCompetition(comp);
    }
}
