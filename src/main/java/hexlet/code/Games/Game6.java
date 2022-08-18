package hexlet.code.Games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Game6 {
    public static void prime() {
        Cli.main();
        final int requiredNumberOfRounds = 3;
        final int maxValue = 100;
        System.out.println("Answer 'yes' if given number is prime otherwise answer 'no'.");

        for (var j = 1; j <= requiredNumberOfRounds; j++) {
            int number = (int) (Math.random() * maxValue);
            System.out.print("Question: " + number + "\nYour answer: ");
            String primeCheck = "";
            if (number == 1) {
                primeCheck = "no";
            } else if (number == 2) {
                primeCheck = "yes";
            } else {
                for (var k = 2; k < number; k++) {
                    if (number % k == 0) {
                        primeCheck = "no";
                        break;
                    } else {
                        primeCheck = "yes";
                    }
                }
            }
            Scanner userInputAnswer = new Scanner(System.in);
            String answer = userInputAnswer.nextLine();
            if (answer.equals(primeCheck)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + primeCheck + "'."
                        + "\nLet's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (j == requiredNumberOfRounds) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}
