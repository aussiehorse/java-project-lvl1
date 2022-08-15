package hexlet.code.Games;
import hexlet.code.Cli;

import java.util.Scanner;

public class Game4 {
    public static void main() {
        Cli.main();
        for (var j = 1; j <= 3; j++) {
            int firstNum = (int) (Math.random() * 100);
            int secondNum = (int) (Math.random() * 100);
            int maxNum = Math.max(firstNum, secondNum);
            int minNum = Math.min(firstNum, secondNum);
            while (maxNum % minNum != 0) {
                int temp = maxNum % minNum;
                maxNum = minNum;
                minNum = temp;
            }
            int gcd = minNum;

            System.out.print("Find the greatest common divisor of given numbers.\nQuestion: " + firstNum + " " + secondNum + "\nYour answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();

            if (answer == gcd) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gcd + "'.\nLet's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (j == 3) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}