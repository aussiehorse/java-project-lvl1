package hexlet.code.Games;
import hexlet.code.Cli;

import java.util.Scanner;

public class Game4 {
    public static void main() {
        Cli.main();
        final int requiredNumberOfRounds = 3;
        final int maxValue = 100;
        for (var j = 1; j <= requiredNumberOfRounds; j++) {
            int firstNum = (int) (Math.random() * maxValue);
            int secondNum = (int) (Math.random() * maxValue);
            int maxNum = Math.max(firstNum, secondNum);
            int minNum = Math.min(firstNum, secondNum);
            while (maxNum % minNum != 0) {
                int temp = maxNum % minNum;
                maxNum = minNum;
                minNum = temp;
            }
            int gcd = minNum;

            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.print("Question: " + firstNum + " " + secondNum + "\nYour answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();

            if (answer == gcd) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gcd + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (j == requiredNumberOfRounds) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}
