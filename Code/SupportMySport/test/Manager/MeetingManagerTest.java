/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Domaene.MeetingManager;
import Persistence.Meeting;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author rafa
 */
public class MeetingManagerTest {
     
    @Test
     public void addResultsToCompetitionMeetingTest(){
        MeetingManager mm = new MeetingManager();
        int teamAId = 1;
        int teamBId = 3;
        int pointsA = 100;
        int pointsB = 200;
        int competitionId = 4;
        System.out.append("In addResultToCompetitionMeetingTest");
        System.out.println("Adding a new result to Meetings");
        System.out.println("Team 1: " + teamAId);
        System.out.println("Team 2: " + teamBId);
        System.out.println("points 1: " + pointsA);
        System.out.println("points 2:" + pointsB);
        System.out.println("competitionId: " + competitionId);
        mm.addResultsToCompetitionMeeting(teamAId, teamBId, pointsA, pointsB, competitionId);
    }
    
    @Test
    public void  showCompetitionMeetingsTest(){
        MeetingManager mm = new MeetingManager();
        List<Meeting> list = mm.showCompetitionMeetings(3);
        System.out.println("In showCompetitionMeetingsTest");
        System.out.println("Lenght of returned List: " + list.size());
        
    }
}
