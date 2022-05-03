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

    private ShipType type;



}
