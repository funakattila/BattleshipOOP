package main;

import ships.Destroyer;
import ships.Ship;

import java.util.ArrayList;
import java.util.List;

public class Battleship {
    public static void main(String[] args) {

    Display display = new Display();
    display.printShipBoard();

    //majd ennek helyet kell keresni

       Destroyer destroyer = new Destroyer();
       int starterX = 0;
       int starterY = 0;

       int counter = destroyer.getLength();

        for (int i = 0; i < counter; i++) {
            Square coordinates = new Square();
            coordinates.setY(starterY + i);
            coordinates.setX(starterX);
            coordinates.setType(SquareStatus.SHIP);
            destroyer.getShipCoordinates().add(coordinates);        //lehet, hoyg setter nem is kell?
        }



        System.out.println(destroyer.getShipCoordinates().get(0).getCharacter());

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
