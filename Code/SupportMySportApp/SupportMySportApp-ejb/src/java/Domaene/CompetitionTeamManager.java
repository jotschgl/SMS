package Domaene;

import Persistence.ClubMember;
import Persistence.Competition;
import Persistence.CompetitionTeam;
import Persistence.Meeting;
import Persistence.PersistenceManager;
import Persistence.Team;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public class CompetitionTeamManager {

    private PersistenceManager persistenceManager;

    public CompetitionTeamManager() {
        persistenceManager = new PersistenceManager();
    }


    public void removeMemberFromCompetition(int memberId, int competitionId, int teamId) {
        String hqlQuerie = "FROM CompetitionTeam WHERE (clubMember_id = " + memberId + " AND competition_id = " + competitionId + " AND team_id = " + teamId + ")";
        List<Object> cp = persistenceManager.getObjectsByHQLQuery(hqlQuerie);
        CompetitionTeam ct = (CompetitionTeam) cp.get(0);
        persistenceManager.delete(ct);
    }

    public List<Team> showAllTeamsOfCompetition(int competitionId) {
        Competition comp = (Competition) persistenceManager.getObjectById(Competition.class, competitionId);
        List<Team> allTeams = new LinkedList<Team>();
        for (CompetitionTeam compTeam : comp.getCompetitionTeams()) {
            allTeams.add(compTeam.getTeam());
        }
        return allTeams;
    }

    public Collection<CompetitionTeam> getCompetitionData(int competitionID) {
        Collection<CompetitionTeam> competitionData = new LinkedList<CompetitionTeam>();
        for (Object obj : persistenceManager.getObjectsByHQLQuery("From CompetitionTeam compt where compt.competition.id = '" + competitionID + "'")) {
            competitionData.add((CompetitionTeam) obj);
        }
        return competitionData;
    }

    public Collection<ClubMember> getAllClubMembersOfCompetitionTeam(int teamID, int competitionID) {
        Collection<ClubMember> allClubMemberOfCompetitionTeam = new LinkedList<ClubMember>();
        CompetitionTeam curCompTeam;
        Collection allCompetitionTeams = persistenceManager.getObjectsByHQLQuery("From CompetitionTeam");
        for (Object obj : allCompetitionTeams) {
            curCompTeam = (CompetitionTeam) obj;
            if (curCompTeam.getTeam().getId() == teamID && curCompTeam.getCompetition().getId() == competitionID) {
                allClubMemberOfCompetitionTeam.add(curCompTeam.getClubMember());
            }
        }
        return allClubMemberOfCompetitionTeam;
    }

    void saveOrUpdateCompetitionTeams(Collection<CompetitionTeam> teams) {
        for (CompetitionTeam competitionTeam : teams) {
            persistenceManager.update(competitionTeam);
        }
    }
}
