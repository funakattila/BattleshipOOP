package ships;

public class Submarine extends Ship {
    private final int length = 3;

    public int getLength() {
            return length;
    }

    private final ShipType type = ShipType.SUBMARINE;

    public ShipType getType() {
            return type;
    }
}

