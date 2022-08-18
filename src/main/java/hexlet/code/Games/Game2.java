package hexlet.code.Games;
import hexlet.code.Cli;

import java.util.Scanner;

public class Game2 {
    public static void even() {
        Cli.main();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        final int requiredNumberOfRounds = 3;
        final int maxValue = 100;
        for (var j = 1; j <= requiredNumberOfRounds; j++) {
            int i = (int) (Math.random() * maxValue);
            System.out.print("Question: " + i + "\nYour answer: ");
            String parity;
            if (i % 2 == 0) {
                parity = "yes";
            } else {
                parity = "no";
            }

            Scanner userInputAnswer = new Scanner(System.in);
            String answer = userInputAnswer.nextLine();
            if (answer.equals(parity)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + parity + "'."
                        + "\nLet's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (j == requiredNumberOfRounds) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }

    }
}
