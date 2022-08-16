package hexlet.code.Games;
import hexlet.code.Cli;

import java.util.Scanner;

public class Game2 {
    public static void main() {
        Cli.main();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (var j = 1; j <= 3; j++) {
            int i = (int) (Math.random() * 100);
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
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + parity + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (j == 3) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }

    }
}
