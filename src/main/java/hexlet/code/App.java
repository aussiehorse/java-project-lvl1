package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


import java.util.Scanner;

public class App {
    private static final int GREETING = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
//        Scanner userInput = new Scanner(System.in);
//        int number = userInput.nextInt();
//        switch (number) {
//            case GREETING -> Engine.readUserName();
//            case EVEN -> Even.start(Engine.readUserName());
//            case CALC -> Calc.start(Engine.readUserName());
//            case GCD -> Gcd.start(Engine.readUserName());
//            case PROGRESSION -> Progression.start(Engine.readUserName());
//            case PRIME -> Prime.start(Engine.readUserName());
//            case EXIT -> System.exit(0);
//            default -> System.out.println("Unfortunately, we do not have such a game. Please try again.");
//        }

    }

}
