package main;

import ships.Destroyer;
import ships.Ship;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Battleship {
    public static void main(String[] args) {
        /**
         *  Próba kiiratás :)
          */


        Display display = new Display();
        Player playerOne = new Player();
        BoardFactory boardFactory = new BoardFactory();

        System.out.println("Az egyes jatekos ures tablaja");
        playerOne.shipBoard();
        playerOne.getShipBoard();
        display.printShipBoard(playerOne.getShipBoard());

        System.out.println();
        System.out.println("Az egyes jatekos tablaja lerakott Destroyer");
        boardFactory.manualPlacement(playerOne.getShipBoard(), playerOne.getShips());
        display.printShipBoard(playerOne.getShipBoard());





        Input input = new Input();
        int[] coords = input.convertToCoordinate();                     //a bekért inputot, koordinátává alakítja

        int x = coords[0];
        int y = coords[1];

        Square[][] testboard = playerOne.getShipBoard();
        String shot = String.valueOf(testboard[x][y].getType());        //megnézi, hogy a játékos tábláján a lövéssel
                                                                        // eltalált Square, milyen állapotú
        System.out.println(shot);

        /*
        System.out.println();
        System.out.println("Az egyes jatekos hajo listajanak elso 0. eleme");
        System.out.println(playerOne.getShips().get(0));
        System.out.println("Az egyes jatekos destroyer első negyzet koordinátája");
        System.out.println(playerOne.getShips().get(0).getShipCoordinates().get(0).getX());
        System.out.println(playerOne.getShips().get(0).getShipCoordinates().get(0).getY());

        System.out.println("Az egyes jatekos destroyer masodik negyzet koordinátája");
        System.out.println(playerOne.getShips().get(0).getShipCoordinates().get(1).getX());
        System.out.println(playerOne.getShips().get(0).getShipCoordinates().get(1).getY());

         */




    }


    /**
     *  Hajó lerakás
     *  - a koordináta a táblán belül van
     *  - irány vizsgálta illetve többi mező is befér-e
     *  - a mezők szabadok-e illetve nem tiltottak-e
     */

    /**
     * Lövés
     * - a koordináta a táblán belül van
     * - mező állapota
     */

}
