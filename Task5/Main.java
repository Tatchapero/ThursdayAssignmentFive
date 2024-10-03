import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GameMenu gameMenu = new GameMenu(new ArrayList<String>(Arrays.asList(
                "1) Start game",
                "2) Resume game",
                "3) Pause game",
                "4) End game")));

        gameMenu.displayMenu();
        int userChoice = tryParseInt(gameMenu.getAction());
        doAction(userChoice);
    }

    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
            default:
            System.out.println("Ending game");
        }
    }

    public static int tryParseInt(String input) {
        try {
            return Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
}