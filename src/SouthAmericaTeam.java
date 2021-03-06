public class SouthAmericaTeam implements OlympicsTeams {

    private String name;
    private int teamMembers;
    private int teamMedals;

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
