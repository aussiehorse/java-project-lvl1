package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void start(String userName) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        for (var j = 1; j <= Engine.REQNUMOFROUNDS; j++) {
            int i = (int) (Math.random() * Engine.MAXVALUE);
            System.out.println("Question: " + i);
            System.out.println("Your answer: ");
            String parity = (i % 2 == 0) ? "yes" : "no";
            Scanner userInputAnswer = new Scanner(System.in);
            String answer = userInputAnswer.nextLine();
            if (answer.equals(parity)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + parity + "'."
                        + "\nLet's try again, " + userName + "!");
                break;
            }
            if (j == Engine.REQNUMOFROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }

    }
}
