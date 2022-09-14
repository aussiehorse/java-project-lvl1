package hexlet.code.Games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Arrays;

public class Progression {
    public static void start(String userName) {
        final int minArrayLength = 5;
        final int maxArrayLength = 10;
        final int maxStepLength = 10;
        for (var j = 1; j <= Engine.REQNUMOFROUNDS; j++) {
            int step = (int) (1 + Math.random() * maxStepLength);
            int arrayLength = (int) (minArrayLength + Math.random() * (1 + maxArrayLength - minArrayLength));
            int[] progression = new int[arrayLength];
            String[] strProgression = new String[arrayLength];
            int randomElement = (int) (Math.random() * arrayLength);
            progression[0] = (int) (Math.random() * Engine.MAXVALUE);
            for (var i = 0; i < (arrayLength - 1); i++) {
                progression[i + 1] = progression[i] + step;
            }
            for (var k = 0; k < arrayLength; k++) {
                if (k != randomElement) {
                    strProgression[k] = String.valueOf(progression[k]);
                } else {
                    strProgression[k] = "..";
                }
            }
            String printProgression = Arrays.toString(strProgression).replaceAll("[\\[\\],]", "");

            System.out.print("What number is missing in the progression?"
                    + "\nQuestion: " + printProgression + "\nYour answer: ");

            Scanner userInputAnswer = new Scanner(System.in);
            int answer = userInputAnswer.nextInt();

            if (answer == progression[randomElement]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + progression[randomElement] + "'."
                        + "\nLet's try again, " + userName + "!");
                break;
            }
            if (j == Engine.REQNUMOFROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }

        }


    }

}
