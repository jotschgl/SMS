package Domaene;

public class CompetitionTeam implements java.io.Serializable {

    private CompetitionTeamId id;
    private Team team;
    private Competition competition;
    private ClubMember clubMember;

    public CompetitionTeam() {
    }

    public CompetitionTeam(CompetitionTeamId id, Team team, Competition competition, ClubMember clubMember) {
        this.id = id;
        this.team = team;
        this.competition = competition;
        this.clubMember = clubMember;
    }

    public CompetitionTeamId getId() {
        return this.id;
    }

    public void setId(CompetitionTeamId id) {
        this.id = id;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Competition getCompetition() {
        return this.competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public ClubMember getClubMember() {
        return this.clubMember;
    }

    public void setClubMember(ClubMember clubMember) {
        this.clubMember = clubMember;
    }
}
