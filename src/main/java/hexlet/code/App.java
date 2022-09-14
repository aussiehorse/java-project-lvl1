package hexlet.code;
import hexlet.code.Games.Even;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Gcd;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;


import java.util.Scanner;

public class App {
    private static final int GREETING = 1;
    private static final int GAME2 = 2;
    private static final int GAME3 = 3;
    private static final int GAME4 = 4;
    private static final int GAME5 = 5;
    private static final int GAME6 = 6;
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
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        switch (number) {
            case GREETING -> Engine.readUserName();
            case GAME2 -> Even.start(Engine.readUserName());
            case GAME3 -> Calc.start(Engine.readUserName());
            case GAME4 -> Gcd.start(Engine.readUserName());
            case GAME5 -> Progression.start(Engine.readUserName());
            case GAME6 -> Prime.start(Engine.readUserName());
            default -> System.out.println("Unfortunately, we do not have such a game. Please try again.");
        }

    }

}
