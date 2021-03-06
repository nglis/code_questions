package OOP.ParkingLot.Alternative;

import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void parkInSpot(ParkingSpot s) {
        parkingSpots.add(s);
    }

    public void clearSpots() {
        // Remove car from spots
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);
}

