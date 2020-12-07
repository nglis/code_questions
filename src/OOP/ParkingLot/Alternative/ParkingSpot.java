package OOP.ParkingLot.Alternative;

public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private Level level;

    public ParkingSpot(Level lvl, int r, int n, VehicleSize s) {
        // Implement constructor
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        // Implement canFitVehicle
    }

    public boolean park(Vehicle v) {
        // Implement park
    }

    public int getRow() {
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void removeVehicle() {
        // Implement removeVehicle
    }

}
