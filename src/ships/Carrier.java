package ships;

public class Carrier {
    private final int length = 5;

    public int getLength() {
        return length;
    }

    private final ShipType type = ShipType.CARRIER;

    public ShipType getType() {
        return type;
    }
}
