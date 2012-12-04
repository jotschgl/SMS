/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaene;

import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.Meeting;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.util.LinkedList;
import java.util.List;

public class MeetingManager {

    private PersistenceManager persistenceManager;

    public MeetingManager() {
        persistenceManager = new PersistenceManager();
    }

    public void createOrUpdateMeeting(Meeting meeting) {
        persistenceManager.update(meeting);
    }

    public void addResultsToCompetitionMeeting(int teamAId, int teamBId, int pointsA, int pointsB, int competitionId) {

        PersistenceManager persistenceManager = new PersistenceManager();

        Team teamA = (Team) persistenceManager.getObjectById(Team.class, teamAId);
        Team teamB = (Team) persistenceManager.getObjectById(Team.class, teamBId);
        Competition competition = (Competition) persistenceManager.getObjectById(Competition.class, competitionId);

        Meeting meeting = new Meeting(competition, teamA, teamB, pointsA, pointsB);
        persistenceManager.save(meeting);
    }

    public List<Meeting> showCompetitionMeetings(int competitionId) {
        PersistenceManager persistenceManager = new PersistenceManager();
        List<Meeting> competitionMeetings = new LinkedList<Meeting>();
        String hqlQuerie = "FROM Meeting WHERE (competition_id = " + competitionId + ")";
        List<Object> results = persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        for (Object obj : results) {
            competitionMeetings.add((Meeting) obj);
        }
        return competitionMeetings;

    }

    void deleteMeeting(Meeting meeting) {
        persistenceManager.delete(meeting);
    }
}
