package main;

public class Board {
    /**
     * ocean: a tábla változója
     * newBoard: legyárt egy boardot és egyenlővé teszi az ocean változóval
     */
    private Square[][] ocean;

    public Square[][] getOcean() {
        return ocean;
    }

    public void setOcean(Square[][] ocean) {
        this.ocean = ocean;
    }


    public Square[][] newBoard(){
        BoardFactory boardFactory = new BoardFactory();
        boardFactory.createBoard(6);
        setOcean(boardFactory.createBoard(6));
        return ocean;
    }





}
