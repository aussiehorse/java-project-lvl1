package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {
    public static void start(String userName) {
        for (var j = 1; j <= Engine.REQ_NUM_OF_ROUNDS; j++) {
            int firstNum = (int) (Math.random() * Engine.MAX_VALUE);
            int secondNum = (int) (Math.random() * Engine.MAX_VALUE);
            int maxNum = Math.max(firstNum, secondNum);
            int minNum = Math.min(firstNum, secondNum);
            while (maxNum % minNum != 0) {
                int temp = maxNum % minNum;
                maxNum = minNum;
                minNum = temp;
            }
            int gcd = minNum;

            System.out.println("Find the greatest common divisor of given numbers."
                    + "\nQuestion: " + firstNum + " " + secondNum);
            System.out.print("Your answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();

            if (answer == gcd) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gcd + "'."
                        + "\nLet's try again, " + userName + "!");
                break;
            }
            if (j == Engine.REQ_NUM_OF_ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
