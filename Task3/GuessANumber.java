import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	    System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess(){
        Scanner sc = new Scanner(System.in);
        int guess;

        if (sc.hasNextDouble()) {
            guess = sc.nextInt();

            if (guess != rnd_number) {
                System.out.println("Wrong guess :-)");
            }
            else {
                System.out.println("You guessed it!");
                return;
            }

            if (rnd_number < guess) {
                System.out.println("Lower");
            }
            else if (rnd_number > guess) {
                System.out.println("Higher");
            }
        }
        else {
            System.out.println("Input must be numeric");
        }

    makeAGuess();
    }
}
