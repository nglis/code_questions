package OOP.ParkingLot;

public class ParkingLot {
    private int maxCapacity;
    private PaymentMachine paymentMachine;
    private ParkingSpot[] spots = new ParkingSpot[maxCapacity];

    public ParkingLot(int c, int t) {
        maxCapacity = c;
        paymentMachine = new PaymentMachine(t);
    }

    public boolean openGate() {
        // Implement code to open gate
    }

    public boolean closeGate() {
        // Implement code to close gate
    }

    public int getAvailableSpot () {
        for (int i = 0; i < maxCapacity; i++) {
            if(spots[i].isOccupied() == false) {
                return i;
            }
        }

        return -1;
    }

    public boolean atMaxCapacity () {
        return getAvailableSpot() == -1;
    }

}
