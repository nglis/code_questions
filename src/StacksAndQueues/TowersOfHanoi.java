package StacksAndQueues;

public class TowersOfHanoi {

    public void moveDisks(int n, Tower origin, Tower destination, Tower buffer) {
        if (n <= 0)
            return;

        moveDisks(n-1, origin, buffer, destination);
        moveTop(origin, destination);
        moveDisks(n-1, buffer, destination, origin);
    }

}
