package main;

import java.util.Scanner;

public class Input {

    /**
     * New user input
     * @param message to print when ask user to enter input
     * @return user input
     */
    public String newInput(String message) {
        System.out.println(message);
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    /**
     * Convert the user input (e.g. B3 to 2, 1 - 3rd row and 2nd column of the board)
     * FELADAT: nem teljes a validáció, azaz bármit elfogad és ha nem a várt formátumú és értékű koordináta jön be,
     * akkor elhasal
     * @return int[] with two coordinates
     *
     */
    public int[] convertToCoordinate() {
        int[] coordinates = new int[2];
        String rawCoordinate = newInput("Add a coordiante (e.g. B3)");
        String strY = rawCoordinate.substring(0,1);
        char letter = rawCoordinate.substring(0,1).toUpperCase().charAt(0);
        int y = letter - 'A' + 1;
        int x = Integer.parseInt(rawCoordinate.substring(1));
        coordinates[0] = x - 1;
        coordinates[1] = y - 1;

        return coordinates;
    }


}
