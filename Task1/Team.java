import java.util.ArrayList;

public class Team {
    private String name;
    private int rank;
    private ArrayList<String> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<String>();
    }

    private void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }

    public void setRank(int rank) {
        this.rank = validateRank(rank);    
    }

    public String toString() {
        setRank(this.rank);
        String teamAndPlayers;
        teamAndPlayers = "Team: " + name + " Rank: " + rank;

        for (String player : players) {
            teamAndPlayers += "\n";
            teamAndPlayers += "- " + player;
        }

        return teamAndPlayers;
    }

    public void addPlayer(String playerName) {
        if (playerName.length() > 0) {
            players.add(playerName);
        }
    }

    private int validateRank(int rank) {
        if (rank < 0) {
            return 999;
        }
        else return rank;
    }
}