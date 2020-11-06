package BitManipulation;

public class SmallerLargerBits {

    public void printSmallestAndLargest(int n) {
        boolean oneFound = false, zeroFound = false;
        int count = -1;

        while (!oneFound || !zeroFound) {
            int temp = 1 << ++count;
            if ((n & temp) == 0)
                zeroFound = true;

            if (zeroFound && (n & temp) == Math.pow(2, count))
                oneFound = true;
        }

        if (!oneFound || !zeroFound)
            System.out.println("Smaller number not applicable.");
        else {
            int n_small = n;
            setBit(n_small, count - 1);
            clearBit(n_small, count);
            System.out.println("Smaller number is: " + n_small);
        }

        oneFound = false;
        zeroFound = false;
        count = -1;

        while (!oneFound || !zeroFound) {
            int temp = 1 << ++count;
            if ((n & temp) == Math.pow(2, count))
                oneFound = true;

            if (oneFound && (n & temp) == 0)
                zeroFound = true;
        }

        if (!oneFound || !zeroFound)
            System.out.println("Larger number not applicable.");
        else {
            int n_large = n;
            setBit(n_large, count);
            clearBit(n_large, count - 1);
            System.out.println("Larger number is: " + n_large);
        }

    }

}
