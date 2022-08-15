package hexlet.code;
import hexlet.code.Games.Game2;
import hexlet.code.Games.Game3;
import hexlet.code.Games.Game4;
import hexlet.code.Games.Game5;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n0 - Exit\nYour choice: ");
            Scanner userInput = new Scanner(System.in);
            int number = userInput.nextInt();
            switch (number) {
                case 1 -> Cli.main();
                case 2 -> Game2.main();
                case 3 -> Game3.main();
                case 4 -> Game4.main();
                case 5 -> Game5.main();
                default -> {
                }
            }

    }

}
