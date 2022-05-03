package main;

import ships.Destroyer;
import ships.Ship;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;

public class BoardFactory {

    /**
     * createBoard(): létrehoz egy megadott méretű main.Square típusú kétdimenziós tömböt, a tábla Squerekből áll, amik
     * tartalmazzák a saját koordinátájukat és a státuszukat(empty, ship, missed, hit)
     * @param boardSize a tábla mérete
     * @return visszaadja a legyártott táblát
     */

    public Square[][] createBoard(int boardSize) {

        Square[][] ocean = new Square[boardSize][boardSize];

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                Square square = new Square();
                square.setX(i);
                square.setY(j);
                square.setType(SquareStatus.EMPTY);
                ocean[i][j] = square;
            }
        }
        return ocean;
    }

    public void manualPlacement(Square[][] shipBoard, ArrayList<Ship> ships) {

        Destroyer destroyer = new Destroyer();                      //destroyer példányosítás
        int starterX = 0;                                           //kezdő koordináták
        int starterY = 0;

        int counter = destroyer.getLength();                        //a destroyer hosszából számlálót csinálunk

        for (int i = 0; i < counter; i++) {                         //legyártja a koordinátákat
            Square coordinates = new Square();                      //létrehozza a Square-eket
            coordinates.setY(starterY + i);
            coordinates.setX(starterX);
            coordinates.setType(SquareStatus.SHIP);
            destroyer.getShipCoordinates().add(coordinates);        //hozzáadja a destroyer koordinátáit tároló változóhoz
            shipBoard[starterY + i][starterX] = coordinates;        //hozzáadja a destroyer koordinátáit tároló változóhoz
        }

        ships.add(destroyer);



        //System.out.println(destroyer.getShipCoordinates().get(0).getCharacter());
        //System.out.println(destroyer.getShipCoordinates().get(0));  //a destroyer első koordinátája
        //System.out.println(shipBoard[0][0]);                        //a destroyer első koordinátája a táblán
    }
}
