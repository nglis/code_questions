package OOP.ParkingLot.Alternative;

public class Level {
    private int floor;
    private parkingSpot[] spots;
    private int availableSpots = 0;
    private static final int SPOTS_PER_ROW = 10;

    public Level(int flr, int numberSpots) {
        // Implement constructor
    }

    public int availableSpots() {
        return availableSpots;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        // Implement parkVehicle
    }

    // Park a vehicle starting at spot spotNumber, until vehicle.spotsNeeded
    private boolean parkStartingAtSpot(int num, Vehicle v) {
        // Implement parkStartingAtSpot
    }

    private int findAvailableSpots(Vehicle vehicle) {
        // Implement findAvailableSpots
    }

    public void spotFreed() {
        availableSpots++;
    }
}
