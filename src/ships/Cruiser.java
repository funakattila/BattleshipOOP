package ships;

public class Cruiser extends Ship{
    private final int length = 4;

    public int getLength() {
        return length;
    }

    private final ShipType type = ShipType.CRUSIER;

    public ShipType getType() {
        return type;
    }
}
