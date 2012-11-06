/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.ClubMember;
import Persistence.Department;
import Persistence.PersistenceManager;
import Persistence.interfaces.IDepartment;
import java.util.LinkedList;
import java.util.List;


public class DepartmentManager {
     private PersistenceManager persistenceManager;
    
    public DepartmentManager(){
        persistenceManager = new PersistenceManager();
    }
    
    public List<IDepartment> getAllDepartments(){
        List<IDepartment> departments = new LinkedList<IDepartment>();
        List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Department");
        for(Object obj : result){
            departments.add((Department)obj);
        }
        return departments;
    }
    
    public Department getDepartmentById(int id){
        return (Department) persistenceManager.getObjectById(Department.class, id);
    }
    
    public Department getDepartmentById(Department department){
        return (Department) persistenceManager.getObjectById(Department.class, department.getId());
    }
    
    public Department getDepartmentByName(String name){
         Department dep = null;
         List<Object> result = persistenceManager.getObjectsByHQLQuery("FROM Department d WHERE d.name LIKE '" +name+ "')");
         if(result.size() == 1){
             dep = (Department) result.get(0);
         }
         return dep;
    }
    
    public void createOrUpdateDepartment(Department department) {
        persistenceManager.update(department);
    }
}
