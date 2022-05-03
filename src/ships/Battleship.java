package ships;

public class Battleship {
    private final int length = 4;

    public int getLength() {
        return length;
    }

    private final ShipType type = ShipType.BATTLESHIP;

    public ShipType getType() {
        return type;
    }
}
