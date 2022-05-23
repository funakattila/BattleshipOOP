package main;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        String[][] playerTable = new String[6][6];
        System.out.println(Arrays.deepToString(Placement(5, 1,1,playerTable)));
    }

    public static String[][] Placement(int numberOfShips, int x, int y, String[][] playerTable) {

        while (numberOfShips > 0) {
            //input
            Scanner sc = new Scanner(System.in);
            System.out.println("Please provide the x coordinate");
            x = sc.nextInt();
            System.out.println("Please provide the y coordinate");
            y = sc.nextInt();
            //input
            for (int i = 0; i < playerTable.length; i++) {
                for (int j = 0; j < playerTable.length; j++) {
                    if (i==x && j==y && playerTable[i][j]==null) {
                        playerTable[i][j]="S";
                        System.out.println("Ship has laid!");
                        numberOfShips--;
                    } else if(i==x && j==y && playerTable[i][j]!=null){
                        System.out.println("There is already a ship here. Please chose another place.");
                    } else {
                        // System.out.println("Coordinate was not valid."); // túl sokszor fut le mielőtt újra bekéris az inputot
                    }
                }
            }
        }
        return playerTable;
    }
}
