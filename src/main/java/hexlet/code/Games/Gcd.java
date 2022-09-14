package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static void start(String userName) {
        for (var j = 1; j <= Engine.REQNUMOFROUNDS; j++) {
            int firstNum = (int) (Math.random() * Engine.MAXVALUE);
            int secondNum = (int) (Math.random() * Engine.MAXVALUE);
            int maxNum = Math.max(firstNum, secondNum);
            int minNum = Math.min(firstNum, secondNum);
            while (maxNum % minNum != 0) {
                int temp = maxNum % minNum;
                maxNum = minNum;
                minNum = temp;
            }
            int gcd = minNum;

            System.out.print("Find the greatest common divisor of given numbers."
                    + "\nQuestion: " + firstNum + " " + secondNum + "\nYour answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();

            if (answer == gcd) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gcd + "'."
                        + "\nLet's try again, " + userName + "!");
                break;
            }
            if (j == Engine.REQNUMOFROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
