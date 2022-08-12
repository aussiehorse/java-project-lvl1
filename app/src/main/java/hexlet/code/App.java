package hexlet.code;
import java.util.Scanner;
public class App {
        public static void main(String[] args) {
            System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\nYour choice: ");
            Scanner userInput = new Scanner(System.in);
            int number = userInput.nextInt();
        switch (number) {
            case 1:
                Cli.main();
                break;
            case 2:
                Game2.main();
                break;
            default:
                break;
        }

    }

}
