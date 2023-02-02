package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void start(String userName) {
        int operatorsLength = Engine.operators.length;
        for (var j = 1; j <= Engine.REQ_NUM_OF_ROUNDS; j++) {
            int firstNum = (int) (Math.random() * Engine.MAX_VALUE);
            int secondNum = (int) (Math.random() * Engine.MAX_VALUE);

            Random random = new Random();
            int i = random.nextInt(operatorsLength);

            System.out.println("What is the result of the expression?"
                    + "\nQuestion: " + firstNum + " " + Engine.operators[i] + " " + secondNum);
            System.out.print("Your answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();
            int correctAnswer = 0;
            switch (Engine.operators[i]) {
                case "+" -> correctAnswer = firstNum + secondNum;
                case "-" -> correctAnswer = firstNum - secondNum;
                case "*" -> correctAnswer = firstNum * secondNum;
                default -> {
                }
            }
            if (answer != correctAnswer) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + correctAnswer + "'." + "\nLet's try again, " + userName + "!");
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
