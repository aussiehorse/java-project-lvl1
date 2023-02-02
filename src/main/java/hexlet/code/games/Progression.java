package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Arrays;

public class Progression {
    public static void start(String userName) {
        for (var j = 1; j <= Engine.REQ_NUM_OF_ROUNDS; j++) {
            int step = (int) (1 + Math.random() * Engine.MAX_STEP_LENGTH);
            int arrayLength = (int) (Engine.MIN_ARRAY_LENGTH + Math.random() * (1
                    + Engine.MAX_ARRAY_LENGTH - Engine.MIN_ARRAY_LENGTH));
            int[] progression = new int[arrayLength];
            String[] strProgression = new String[arrayLength];
            int randomElement = (int) (Math.random() * arrayLength);
            progression[0] = (int) (Math.random() * Engine.MAX_VALUE);
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
//            Left as a keepsake))
//            String printProgression = Arrays.toString(strProgression).replaceAll("[\\[\\],]", "");

            String printProgression = String.join(" ", strProgression);

            System.out.println("What number is missing in the progression?"
                    + "\nQuestion: " + printProgression);
            System.out.print("Your answer: ");

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
            if (j == Engine.REQ_NUM_OF_ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }

        }


    }

}
