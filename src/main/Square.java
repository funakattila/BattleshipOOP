package main;

public class Square {
    /**
     * x: első koordináta
     * y: második koordináta
     * type: a négyzet állapota
     * getCharacter(): beállítja a négyzet értékének megfelelő, a táblán megjelenítendő karaktert
     */
    private int x = 5;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int y = 10;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private SquareStatus type = SquareStatus.EMPTY;

    public SquareStatus getType() {
        return type;
    }

    public void setType(SquareStatus type) {
        this.type = type;
    }

    public char getCharacter() {

        switch (type) {
            case MISSED:
                return 'M';
            case HIT:
                return 'H';
            case SHIP:
                return 'S';
            default:
                return '~';
        }

    }

}
