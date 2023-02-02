package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void start(String userName) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        for (var j = 1; j <= Engine.REQ_NUM_OF_ROUNDS; j++) {
            int i = (int) (Math.random() * Engine.MAX_VALUE);
            System.out.println("Question: " + i);
            System.out.print("Your answer: ");
            String parity = (i % 2 == 0) ? "yes" : "no";
            Scanner userInputAnswer = new Scanner(System.in);
            String answer = userInputAnswer.nextLine();
            if (!answer.equals(parity)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + parity + "'."
                        + "\nLet's try again, " + userName + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
            if (j == Engine.REQ_NUM_OF_ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }

    }
}
