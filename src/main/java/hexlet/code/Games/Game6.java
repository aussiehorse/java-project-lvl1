package hexlet.code.Games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Game6 {
    public static void main() {
        Cli.main();
        final int requiredNumberOfRounds = 3;
        final int maxValue = 100;
        final int firstPrimeNumbersQuantity = 3;
        System.out.println("Answer 'yes' if given number is prime otherwise answer 'no'.");

        for (var j = 1; j <= requiredNumberOfRounds; j++) {
            int number = (int) (Math.random() * maxValue);
            System.out.print("Question: " + number + "\nYour answer: ");
            String primeCheck = "";
            int sqrt = (int) Math.sqrt(number);
            for (var k = 2; k <= sqrt; k++) {
                if (number > firstPrimeNumbersQuantity && number % k == 0) {
                    primeCheck = "no";
                    break;
                } else {
                    primeCheck = "yes";
                }
            }

            Scanner userInputAnswer = new Scanner(System.in);
            String answer = userInputAnswer.nextLine();
            if (answer.equals(primeCheck)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + primeCheck + "'." +
                        "\nLet's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (j == requiredNumberOfRounds) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}
