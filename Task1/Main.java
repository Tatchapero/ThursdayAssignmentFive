import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList<Team>();
        int numberOfTeams = 6;
        int playersPerTeam = 5;

        for (int i = 0; i < numberOfTeams; i++) {
            char teamName = (char)(65+i);
            teams.add(new Team(teamName + ""));
            teams.get(i).setRank(i+1);

            for (int j = 0; j < playersPerTeam; j++) {
                Random rand = new Random();
                char playerName = (char)(rand.nextInt(90-65)+65);
                teams.get(i).addPlayer("Mr. " + playerName);
            }

            System.out.println(teams.get(i).toString());
        }
    }
}