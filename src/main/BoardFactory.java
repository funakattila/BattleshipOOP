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
}
