package ships;

import main.Square;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    private ArrayList<Square> shipCoordinates = new ArrayList<Square>();

    public ArrayList<Square> getShipCoordinates() {
        return shipCoordinates;
    }

    public void setShipCoordinates(ArrayList<Square> shipCoordinates) {
        this.shipCoordinates = shipCoordinates;
    }

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private ShipType type;

    public ShipType getType() {
        return type;
    }

    public void setType(ShipType type) {
        this.type = type;
    }



}
