package hexlet.code.Games;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Game3 {
    public static void main() {
        Cli.main();

        String[] operators = {"+", "-", "*"};

        for (var j = 1; j <= 3; j++) {
            int firstNum = (int) (Math.random() * 100);
            int secondNum = (int) (Math.random() * 100);

            Random random = new Random();
            int i = random.nextInt(3);

            System.out.print("What is the result of the expression?\nQuestion: " + firstNum + " " + operators[i] + " " + secondNum + "\nYour answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();
            int sum = firstNum + secondNum;
            int sub = firstNum - secondNum;
            int mul = firstNum * secondNum;

            if (operators[i].equals("+") && answer == sum) {
                System.out.println("Correct!");
            }
            else if (operators[i].equals("-") && answer == sub) {
                System.out.println("Correct!");
            }
            else if (operators[i].equals("*") && answer == mul) {
                System.out.println("Correct!");
            }
            else {
                switch (operators[i]) {
                    case "+" -> System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + sum + "'.\nLet's try again, " + Cli.getUserName() + "!");
                    case "-" -> System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + sub + "'.\nLet's try again, " + Cli.getUserName() + "!");
                    case "*" -> System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + mul + "'.\nLet's try again, " + Cli.getUserName() + "!");
                }
                break;
            }
            if (j == 3) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }

        }
    }

}
