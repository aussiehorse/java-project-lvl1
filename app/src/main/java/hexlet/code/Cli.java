package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static void main() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();
        System.out.println("Hello, " + name + "!");
        }

}