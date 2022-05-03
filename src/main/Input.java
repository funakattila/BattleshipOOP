package main;

import java.util.Scanner;

public class Input {
    public String newInput(String message) {
        System.out.println(message);
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }
}
