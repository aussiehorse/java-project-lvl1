package hexlet.code;

import java.util.Scanner;

public class TryIt {
    public static final int REQ_NUM_OF_ROUNDS = 3;
    //  maximum numerical value used in game questions
    public static final int MAX_VALUE = 100;
    public static final String[] operators = {"+", "-", "*"};
    public static final int MIN_ARRAY_LENGTH = 5;
    public static final int MAX_ARRAY_LENGTH = 10;
    public static final int MAX_STEP_LENGTH = 10;

    public static String readUserName() {
        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

}
