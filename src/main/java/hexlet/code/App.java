package hexlet.code;
import hexlet.code.Games.Game2;
import hexlet.code.Games.Game3;
import hexlet.code.Games.Game4;
import hexlet.code.Games.Game5;
import hexlet.code.Games.Game6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even"
                + "\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        final int greeting = 1;
        final int game2 = 2;
        final int game3 = 3;
        final int game4 = 4;
        final int game5 = 5;
        final int game6 = 6;
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        switch (number) {
            case greeting -> Cli.main();
            case game2 -> Game2.main();
            case game3 -> Game3.main();
            case game4 -> Game4.main();
            case game5 -> Game5.main();
            case game6 -> Game6.main();
            default -> {
            }
        }

    }

}
