/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationInterfaces;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Dennis
 */
public class SportDTO implements Serializable {

    private Integer id = -1;
    private String name;
    private DepartmentDTO department;
    private RuleDTO rule;
    private Collection<LeagueDTO> leagues;

    public SportDTO(String name, DepartmentDTO department, RuleDTO rule) {
        this.name = name;
        this.department = department;
        this.rule = rule;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the department
     */
    public DepartmentDTO getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    /**
     * @return the rule
     */
    public RuleDTO getRule() {
        return rule;
    }

    /**
     * @param rule the rule to set
     */
    public void setRule(RuleDTO rule) {
        this.rule = rule;
    }

    public Collection<LeagueDTO> getLeagues() {
        return leagues;
    }

    public void setLeagues(Collection<LeagueDTO> leagues) {
        this.leagues = leagues;
    }

    @Override
    public String toString() {
        return getName();
    }
}
