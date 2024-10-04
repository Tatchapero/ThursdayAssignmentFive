import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList<Team>();
        teams = TeamBuilder.addTeams(teams, Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        for (Team team : teams) {
            team.toString();
        }
    }
}