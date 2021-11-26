import java.util.ArrayList;
import java.util.List;

public class CompositeClass implements OlympicsTeams {
    private String name;
    private int TeamMembers;
    private int TeamMedals;

    private List<OlympicsTeams> childOlympicTeams = new ArrayList<>();

    public void printTeamName() {
        childOlympicTeams.forEach(OlympicsTeams::printTeamName);
    }

    public void printTeamMembers() {
        childOlympicTeams.forEach(OlympicsTeams::printTeamMembers);

    }

    public void printTeamMedals() {
        childOlympicTeams.forEach(OlympicsTeams::printTeamMedals);

    }

    public void addOlympicsTeams(OlympicsTeams team) {
        childOlympicTeams.add(team);
    }

    public void removeOlympicsTeams(OlympicsTeams team) {
        childOlympicTeams.remove(team);
    }
}
