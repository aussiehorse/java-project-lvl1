package hexlet.code.Games;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void start(String userName) {
        String[] operators = {"+", "-", "*"};
        int operatorsLength = operators.length;
        for (var j = 1; j <= Engine.REQNUMOFROUNDS; j++) {
            int firstNum = (int) (Math.random() * Engine.MAXVALUE);
            int secondNum = (int) (Math.random() * Engine.MAXVALUE);

            Random random = new Random();
            int i = random.nextInt(operatorsLength);

            System.out.println("What is the result of the expression?"
                    + "\nQuestion: " + firstNum + " " + operators[i] + " " + secondNum + "\nYour answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();
            if (operators[i].equals("+") && answer == (firstNum + secondNum)) {
                System.out.println("Correct!");
            } else if (operators[i].equals("-") && answer == (firstNum - secondNum)) {
                System.out.println("Correct!");
            } else if (operators[i].equals("*") && answer == (firstNum * secondNum)) {
                System.out.println("Correct!");
            } else {
                switch (operators[i]) {
                    case "+" -> System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + (firstNum + secondNum) + "'." + "\nLet's try again, " + userName + "!");
                    case "-" -> System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + (firstNum - secondNum) + "'." + "\nLet's try again, " + userName + "!");
                    case "*" -> System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + (firstNum * secondNum) + "'." + "\nLet's try again, " + userName + "!");
                    default -> {
                    }
                }
                break;
            }
            if (j == Engine.REQNUMOFROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }

        }
    }

}
