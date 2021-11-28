public class Tennis implements OlympicsTeams {
    private int teamMembers;
    private int teamMedals;

    public Tennis(int teamMembers, int teamMedals){
        this.teamMembers = teamMembers;
        this.teamMedals = teamMedals;
    }
    public String printTeamName() {
        return getClass().getSimpleName();
    }

    @Override
    public String printTeamNameAndMembers() {
        return "Team: " + printTeamName()
                + "Number of Athletes: " + printNumberOfAthletes();
    }

    @Override
    public String printTeamNameAndMedals() {
        return "Team: " + printTeamName()
                + "Number of Gold medals: " + printNumberOfMedals();
    }

    @Override
    public int printNumberOfAthletes() {
        return teamMembers;
    }

    @Override
    public int printNumberOfMedals() {
        return teamMedals;
    }
}
