package hexlet.code.Games;
import hexlet.code.Cli;
import java.util.Scanner;
import java.util.Arrays;

public class Game5 {
    public static void main() {

        Cli.main();

        for (var j = 1; j <= 3; j++) {
            int step = (int) (1 + Math.random() * 10);
            int arrayLength = (int) (5 + Math.random() * 6);
            int[] progression = new int[arrayLength];
            progression[0] = (int) (Math.random() * 100);
            for (var i = 0; i < (arrayLength - 1); i++) {
                progression[i + 1] = progression[i] + step;
            }
            int randomElement = (int) (Math.random() * arrayLength);
            int temp = progression[randomElement];
            progression[randomElement] = -1;

            String printProgression = Arrays.toString(progression);
            printProgression = printProgression.replace("[", "");
            printProgression = printProgression.replace("]", "");
            printProgression = printProgression.replace(",", "");
            printProgression = printProgression.replace("-1", "..");

            System.out.print("What number is missing in the progression?\nQuestion: " + printProgression + "\nYour answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();

            if (answer == temp) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + temp + "'.\nLet's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (j == 3) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }

        }


    }

}
