package main;

public class Display {

    /**
     * printShipBoard() kinyomja a képernyőre a táblát
     */

    public void printShipBoard(Square[][] printBoard){

        System.out.print("  ");
        char c;
        for(c = 'A'; c <= 'Z' - (26-printBoard.length); ++c) {              //A ABC fejlecet nyomtatja
            System.out.print(c + " ");

        }
        System.out.println();
        for (int i = 0; i < printBoard.length ; i++) {
            System.out.print(i + 1 + " ");                                  //A szám oszlopot nyomtatja
            for (int j = 0; j < printBoard[i].length; j++) {
                char stausOfSuqare = printBoard[i][j].getCharacter();       //A main.Square állapotát jelző karakter
                System.out.print(stausOfSuqare + " ");
            }
            System.out.println();
        }
    }
}

