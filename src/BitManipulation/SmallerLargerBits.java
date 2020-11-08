package BitManipulation;

public class SmallerLargerBits {

    // Bit manipulation approach (get previous) solution

    public int getPrevious(int n) {
        // To get previous number, find rightmost 10, swap the bits, shift all following 1's left as possible to the 10

        int c = n;
        int c0 = 0;
        int c1 = 0;

        // Counts 1's before the rightmost 0 and shift c so that the last bit is 0
        while ((c & 1) == 1) {
            c1++;
            c >>= 1;
        }

        // Count 0's before the rightmost 1 bit in the new c value
        while ((c & 1) == 0 && c != 0) {
            c0++;
            c >>= 1;
        }

        if (c0 + c1 == 31 || c0 + c1 == 0) {
            return -1;
        }

        int p = c0 + c1;

        // Set all bits after and including first 10 to 0's
        n &= ((~0) << p + 1);

        int mask = (1 << (c1 + 1)) - 1;

        n |= mask << (c0 - 1);

        // Set 0 where the first 10 was to 1
        //n |= (1 << p);

        n |= ~(1 << (c1 + 1)) << c0 - 1;
        return n;
    }

    // Bit manipulation approach (get next) solution

    public int getNext(int n) {
        // Find rightmost occurrence of 01, swap bits and shift all following 1's as far right as possible
        int c = n;
        int c0 = 0;
        int c1 = 0;

        //  Find first 0 and shift c until 1 is first (c0 is number of 0's after rightmost 1)
        while (((c & 1) == 0) && (c != 0)) {
            c0++;
            c >>= 1;
        }

        // Find rightmost 01 in whats left of c (where c1 is number of 1's after 0 in rightmost 01)
        while ((c & 1) == 1) {
            c1++;
            c  >>= 1;
        }

        // If c's bit order is 111...111 0000....0000, c is all 1's or c = 0 return -1
        if (c0 + c1 == 31 || c0 + c1 == 0) {
            return -1;
        }

        // p is the first bit after the rightmost 01 combination
        int p = c0 + c1;

        // Change the 0 in 01 to a 1
        n |= (1 << p);

        // Change the 1 in 01 to a 0
        n &= ~((1 << p) - 1);

        // Shift trailing 1's to end of the byte
        n |= (1 << (c1 - 1)) - 1;
        return n;
    }


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
