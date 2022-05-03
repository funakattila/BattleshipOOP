package main;

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

    public void shipBoard(){
        Board board = new Board();
        board.newBoard();

        setShipBoard(board.newBoard());
    }



}
