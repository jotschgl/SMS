package Domaene;

public class CompetitionTeamId implements java.io.Serializable {

    private int competitionId;
    private int teamId;

    public CompetitionTeamId() {
    }

    public CompetitionTeamId(int competitionId, int teamId) {
        this.competitionId = competitionId;
        this.teamId = teamId;
    }

    public int getCompetitionId() {
        return this.competitionId;
    }

    public void setCompetitionId(int competitionId) {
        this.competitionId = competitionId;
    }

    public int getTeamId() {
        return this.teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof CompetitionTeamId)) {
            return false;
        }
        CompetitionTeamId castOther = (CompetitionTeamId) other;

        return (this.getCompetitionId() == castOther.getCompetitionId())
                && (this.getTeamId() == castOther.getTeamId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getCompetitionId();
        result = 37 * result + this.getTeamId();
        return result;
    }
}
