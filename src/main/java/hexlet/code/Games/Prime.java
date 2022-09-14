package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void start(String userName) {
        System.out.println("Answer 'yes' if given number is prime otherwise answer 'no'.");

        for (var j = 1; j <= Engine.REQNUMOFROUNDS; j++) {
            int number = (int) (Math.random() * Engine.MAXVALUE);
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
                        + "\nLet's try again, " + userName + "!");
                break;
            }
            if (j == Engine.REQNUMOFROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
