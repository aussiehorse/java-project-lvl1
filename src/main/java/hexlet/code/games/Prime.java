package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void start(String userName) {
        System.out.println("Answer 'yes' if given number is prime otherwise answer 'no'.");

        for (var j = 1; j <= Engine.REQ_NUM_OF_ROUNDS; j++) {
            int number = (int) (Math.random() * Engine.MAX_VALUE);
            int radical = (int) Math.sqrt(number);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String primeCheck = "";
            if (number < 2) {
                primeCheck = "no";
            } else {
                for (int i = 2; i <= radical; i++) {
                    if (number % i == 0) {
                        primeCheck = "no";
                        break;
                    } else {
                        primeCheck = "yes";
                    }
                }
            }
                Scanner userInputAnswer = new Scanner(System.in);
                String answer = userInputAnswer.nextLine();
                if (!answer.equals(primeCheck)) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + primeCheck + "'."
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
