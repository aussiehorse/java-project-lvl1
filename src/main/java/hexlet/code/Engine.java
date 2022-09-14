package hexlet.code;

import java.util.Scanner;

public class Engine {
//  required number of rounds for each game
    public static final int REQNUMOFROUNDS = 3;
//  maximum numerical value used in game questions
    public static final int MAXVALUE = 100;

    public static String readUserName() {
        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

}

