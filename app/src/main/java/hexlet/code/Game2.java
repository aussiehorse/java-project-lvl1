package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Game2 {
    public static void main() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner userInputName = new Scanner(System.in);
        String name = userInputName.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (var j = 1; j <= 3; j++) {
            Random random = new Random();
            int i = random.nextInt();
            System.out.print("Question: " + i + "\nYour answer: ");
            String parity = "";
            if (i % 2 == 0) {
                parity = "yes";
            }
            else {
                parity = "no";
            }

            Scanner userInputAnswer = new Scanner(System.in);
            String answer = userInputAnswer.nextLine();
            if (answer.equals(parity)) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + parity + "'.\nLet's try again, " + name + "!");
                break;
            }
            if (j == 3) {
                System.out.println("Congratulations, " + name + "!");
            }
        }

    }
}
