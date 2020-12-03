package OOP.CallCenter.Alternative;

abstract class Employee {
    private call currentCall = null;
    protected Rank rank;

    public void receiveCall(Call call) {
        // Implement receiveCall
    }

    public void callCompleted() {
        // Implement callCompleted
    }

    public void escalateAndReassign() {
        // Implement escalateAndReassign
    }

    public boolean assignNewCall() {
        // Implement assignNewCall
    }

    public boolean isFree() {
        // Implement isFree
    }

    public Rank getRank() {
        return rank;
    }
}
