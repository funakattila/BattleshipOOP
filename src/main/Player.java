package main;

import ships.Ship;

import java.util.ArrayList;

public class Player {
    /**
     * shipBoard: a játékos hajókat tartalmazó táblája
     * shipBoard(): legyártja a táblát és berakja a shipBoard változóba
     */
    private Square[][] shipBoard;

    public Square[][] getShipBoard() {
        return shipBoard;
    }

    public void setShipBoard(Square[][] shipBoard) {
        this.shipBoard = shipBoard;
    }

    private ArrayList<Ship> ships = new ArrayList<>();

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    public void shipBoard(){
        Board board = new Board();
        board.newBoard();

        setShipBoard(board.newBoard());
    }

}
