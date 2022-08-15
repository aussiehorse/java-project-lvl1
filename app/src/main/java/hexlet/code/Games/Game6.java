package hexlet.code.Games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Game6 {
    public static void main() {

        Cli.main();
        System.out.println("Answer 'yes' if given number is prime otherwise answer 'no'.");

        for (var j = 1; j <= 3; j++) {
            int number = (int) (Math.random() * 100);
            System.out.print("Question: " + number + "\nYour answer: ");
            String primeCheck = "";
            int sqrt = (int) Math.sqrt(number);
            if (number == 1 || number == 2 || number == 3) {
                primeCheck = "yes";
            }
            else {
                for (var k = 2; k <= sqrt; k++) {
                    if (number % k == 0) {
                        primeCheck = "no";
                        break;
                    }
                    else {
                        primeCheck = "yes";
                    }
                }
            }
            
            Scanner userInputAnswer = new Scanner(System.in);
            String answer = userInputAnswer.nextLine();
            
            if (answer.equals(primeCheck)) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + primeCheck + "'.\nLet's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (j == 3) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        }
    }
}
