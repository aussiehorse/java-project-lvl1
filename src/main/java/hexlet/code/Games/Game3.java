package hexlet.code.Games;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Game3 {
    public static void main() {
        Cli.main();

        String[] operators = {"+", "-", "*"};
        int operatorsLength = operators.length;
        final int requiredNumberOfRounds = 3;
        final int maxValue = 100;
        for (var j = 1; j <= requiredNumberOfRounds; j++) {
            int firstNum = (int) (Math.random() * maxValue);
            int secondNum = (int) (Math.random() * maxValue);

            Random random = new Random();
            int i = random.nextInt(operatorsLength);

            System.out.println("What is the result of the expression?");
            System.out.print("Question: " + firstNum + " " + operators[i] + " " + secondNum + "\nYour answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();
            int sum = firstNum + secondNum;
            int sub = firstNum - secondNum;
            int mul = firstNum * secondNum;

            if (operators[i].equals("+") && answer == sum) {
                System.out.println("Correct!");
            } else if (operators[i].equals("-") && answer == sub) {
                System.out.println("Correct!");
            } else if (operators[i].equals("*") && answer == mul) {
                System.out.println("Correct!");
            } else {
                switch (operators[i]) {
                    case "+" -> {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + sum + "'.");
                        System.out.println("Let's try again, " + Cli.getUserName() + "!");
                    }
                    case "-" -> {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + sub + "'.");
                        System.out.println("Let's try again, " + Cli.getUserName() + "!");
                    }
                    case "*" -> {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + mul + "'.");
                        System.out.println("Let's try again, " + Cli.getUserName() + "!");
                    }
                    default -> {
                    }
                }
                break;
            }
            if (j == requiredNumberOfRounds) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }

        }
    }

}
