import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GameMenu gameMenu = new GameMenu(new ArrayList<String>(Arrays.asList(
            "1) Start game",
            "2) Resume game",
            "3) Pause game",
            "4) End game"
        )));

        gameMenu.displayMenu();
    }
}