import java.util.ArrayList;
import java.util.List;

public class ChinaTeam implements OlympicsTeams {

    private int teamMembers;
    private int teamMedals;

    private List<OlympicsTeams> childOlympicTeams = new ArrayList<>();

    public String printTeamNameAndMembers (){
        String result = "Team: "+getClass().getName() +"\n";
        for (int i = 0; i<childOlympicTeams.size(); i++){
           result +=  childOlympicTeams.get(i).printTeamNameAndMembers()+"\n";

        }
        return result;
    }

    public String printTeamNameAndMedals (){
        String result = "Team: "+ getClass().getName() +"\n";
        for (int i = 0; i<childOlympicTeams.size(); i++){
            result += childOlympicTeams.get(i).printTeamNameAndMedals()+"\n";
        }
        return result;
    }

    public int printNumberOfAthletes() {
        return teamMembers;
    }

    public int printNumberOfMedals() {
        return teamMedals;
    }

    public void addOlympicsTeams(OlympicsTeams team) {
        childOlympicTeams.add(team);
    }

}