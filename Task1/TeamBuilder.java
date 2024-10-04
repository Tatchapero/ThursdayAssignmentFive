import java.util.ArrayList;
import java.util.Random;

public class TeamBuilder {

    public static ArrayList<Team> addTeams(ArrayList<Team> teams, int numberOfTeams, int playersPerTeam) {
        for (int i = 0; i < numberOfTeams; i++) {
            char teamName = (char)(65+i);
            teams.add(new Team(teamName + ""));
            teams.get(i).setRank(i+1);

            addPlayers(teams.get(i), playersPerTeam);   
            
            System.out.println(teams.get(i).toString());
        }

        return teams;
    }

    public static Team addPlayers(Team team, int playersPerTeam) {
        for (int j = 0; j < playersPerTeam; j++) {                
            team.addPlayer(generateName());
        }
        
        return team;
    }

    private static String generateName() {
        String[] names = {
            "Liam", "Noah", "Oliver", "Elijah", "James", "William", "Benjamin", "Lucas", "Henry", "Alexander",
            "Mason", "Michael", "Ethan", "Daniel", "Jacob", "Logan", "Jackson", "Levi", "Sebastian", "Mateo",
            "Jack", "Owen", "Theodore", "Aiden", "Samuel", "Joseph", "John", "David", "Wyatt", "Matthew",
            "Luke", "Asher", "Carter", "Julian", "Grayson", "Leo", "Jayden", "Gabriel", "Isaac", "Lincoln",
            "Anthony", "Hudson", "Dylan", "Ezra", "Thomas", "Charles", "Christopher", "Jaxon", "Maverick", "Josiah",
            "Isaiah", "Andrew", "Elias", "Joshua", "Nathan", "Caleb", "Ryan", "Adrian", "Miles", "Eli",
            "Nolan", "Christian", "Aaron", "Cameron", "Ezekiel", "Colton", "Luca", "Landon", "Hunter", "Jonathan",
            "Santiago", "Axel", "Easton", "Cooper", "Jeremiah", "Angel", "Roman", "Connor", "Jameson", "Robert",
            "Greyson", "Jordan", "Ian", "Carson", "Jaxson", "Leonardo", "Nicholas", "Dominic", "Austin", "Everett",
            "Brooks", "Xavier", "Kai", "Jose", "Parker", "Adam", "Jace", "Wesley", "Kayden", "Silas",
            "Bennett", "Declan", "Waylon", "Weston", "Evan", "Emmett"
        };

        Random rand = new Random();        
        return names[rand.nextInt(100)+1];
    }    
}
