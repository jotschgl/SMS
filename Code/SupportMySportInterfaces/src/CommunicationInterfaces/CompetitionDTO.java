/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationInterfaces;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Dennis
 */
public class CompetitionDTO implements Serializable {

    private int id = -1;
    private DepartmentDTO department;
    private String name;
    private double competitionfee;
    private Date dateOfCompetition;
    private Collection<MeetingDTO> allMeetingsOfCompetition;
    private Collection<CompetitionTeamDTO> allTeamsOfCompetition;

    public CompetitionDTO(DepartmentDTO responsibleDepartment, String competitionName, double competitionfee, Date dateOfCompetition) {
        this.department = responsibleDepartment;
        this.name = competitionName;
        this.competitionfee = competitionfee;
        this.dateOfCompetition = dateOfCompetition;
        allMeetingsOfCompetition = new LinkedList<MeetingDTO>();
        allTeamsOfCompetition = new LinkedList<CompetitionTeamDTO>();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the competitionfee
     */
    public double getCompetitionfee() {
        return competitionfee;
    }

    /**
     * @param competitionfee the competitionfee to set
     */
    public void setCompetitionfee(double competitionfee) {
        this.competitionfee = competitionfee;
    }

    /**
     * @return the dateOfCompetition
     */
    public Date getDateOfCompetition() {
        return dateOfCompetition;
    }

    /**
     * @param dateOfCompetition the dateOfCompetition to set
     */
    public void setDateOfCompetition(Date dateOfCompetition) {
        this.dateOfCompetition = dateOfCompetition;
    }

    public void addMeetingToCompetition(MeetingDTO meeting) {
        allMeetingsOfCompetition.add(meeting);
    }

    public Collection<MeetingDTO> getAllCompetitionMeetings() {
        return allMeetingsOfCompetition;
    }

    public void setAllCompetitionMeetings(Collection<MeetingDTO> allMeetingDTOs) {
        allMeetingsOfCompetition = allMeetingDTOs;
    }

    public void addTeamToCompetition(CompetitionTeamDTO team) {
        allTeamsOfCompetition.add(team);
    }

    public Collection<CompetitionTeamDTO> getAllTeamsOfCompetition() {
        return allTeamsOfCompetition;
    }
}
