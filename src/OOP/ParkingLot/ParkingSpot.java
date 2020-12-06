package OOP.ParkingLot;

public class ParkingSpot {
    private boolean occupied;

    public ParkingSpot() {
        occupied = false;
    }

    public void setOccupied(boolean status) {
        occupied = status;
    }

    public boolean isOccupied() {
        return occupied;
    }
}
