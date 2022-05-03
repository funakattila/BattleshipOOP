package ships;

import ships.Ship;
import ships.ShipType;

public class Destroyer extends Ship {
    private final int length = 2;

    public int getLength() {
        return length;
    }

    private final ShipType type = ShipType.DESTROYER;

    public ShipType getType() {
        return type;
    }
}
