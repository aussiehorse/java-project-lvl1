package hexlet.code.Games;
import hexlet.code.Cli;
import java.util.Scanner;
import java.util.Arrays;

public class Game5 {
    public static void main() {

        Cli.main();
        final int requiredNumberOfRounds = 3;
        final int maxValue = 100;

        final int minArrayLength = 5;
        final int maxArrayLength = 10;
        final int maxStepLength = 10;
        for (var j = 1; j <= requiredNumberOfRounds; j++) {
            int step = (int) (1 + Math.random() * maxStepLength);
            int arrayLength = (int) (minArrayLength + Math.random() * (1 + maxArrayLength - minArrayLength));
            int[] progression = new int[arrayLength];
            progression[0] = (int) (Math.random() * maxValue);
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

            System.out.print("What number is missing in the progression?"
                    + "\nQuestion: " + printProgression + "\nYour answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();

            if (answer == temp) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + temp + "'."
                        + "\nLet's try again, " + Cli.getUserName() + "!");
                break;
            }
            if (j == requiredNumberOfRounds) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }

        }


    }

}
