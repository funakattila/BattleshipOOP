package main;

import ships.*;

import java.util.ArrayList;

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

    private ArrayList<Ship> ships = new ArrayList<Ship>();

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    public void shipBoard(){
        Board board = new Board();
        board.newBoard();

        setShipBoard(board.newBoard());
    }

    public void addShips(ArrayList<Ship> ships) {
        Destroyer destroyer = new Destroyer();                      //destroyer példányosítás
        ships.add(destroyer);                                       //destroyer hozzáadása a hajókhoz

        Submarine submarine = new Submarine();                      //submarine példányosítás
        ships.add(submarine);                                       //submarine hozzáadása a hajókhoz

        Cruiser cruiser = new Cruiser();                            //cruiser példányosítás
        ships.add(cruiser);                                         //cruiser hozzáadása a hajókhoz

        Battleship battleship = new Battleship();                   //battleship példányosítás
        ships.add(battleship);                                      //battleship hozzáadása a hajókhoz

        Carrier carrier = new Carrier();                            //battleship példányosítás
        ships.add(carrier);                                         //battleship hozzáadása a hajókhoz
    }


    public void manualPlacement(Square[][] shipBoard, ArrayList<Ship> ships) {

        addShips(ships);
        Display display = new Display();

        for (int i = 0; i < ships.size(); i++) {

            System.out.println("Please place your " + ships.get(i).getType() + "!");
            Input input = new Input();

            char orientation = input.shipOrientation();                     //hajó irányénak bekérése

            int[] inputCoordinates = input.convertToCoordinate();           //koordináták bekérése

            int starterX = inputCoordinates[1];                             //kezdő koordináták
            int starterY = inputCoordinates[0];

            int counter = ships.get(i).getLength();                         //a hajó hosszából számlálót csinálunk

            if (orientation == 'H') {
                for (int j = 0; j < counter; j++) {                         //legyártja a koordinátákat
                    Square coordinates = new Square();                      //létrehozza a Square-eket
                    coordinates.setY(starterY);
                    coordinates.setX(starterX + j);                         //jelenleg csak vízszintesen helyez el
                    coordinates.setType(SquareStatus.SHIP);                 //a status beállítása
                    shipBoard[starterY][starterX + j] = coordinates;        //hozzáadja a hajó koordinátáit tábláhpz
                    ships.get(i).getShipCoordinates().add(coordinates);     //hozzáadja a hajó koordinátáit a hajóhoz
                }
            } else {
                for (int j = 0; j < counter; j++) {                         //legyártja a koordinátákat
                    Square coordinates = new Square();                      //létrehozza a Square-eket
                    coordinates.setY(starterY + j);
                    coordinates.setX(starterX);                             //jelenleg csak vízszintesen helyez el
                    coordinates.setType(SquareStatus.SHIP);                 //a status beállítása
                    shipBoard[starterY + j][starterX] = coordinates;        //hozzáadja a hajó koordinátáit tábláhpz
                    ships.get(i).getShipCoordinates().add(coordinates);     //hozzáadja a hajó koordinátáit a hajóhoz
                }
            }

            System.out.println();
            display.printShipBoard(getShipBoard());
            System.out.println();



        }







        //System.out.println(destroyer.getShipCoordinates().get(0).getCharacter());
        //System.out.println(destroyer.getShipCoordinates().get(0));  //a destroyer első koordinátája
        //System.out.println(shipBoard[0][0]);                        //a destroyer első koordinátája a táblán
    }

}
