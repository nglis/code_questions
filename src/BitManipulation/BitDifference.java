package BitManipulation;

public class BitDifference {

    // Solution
    public int bitDifferenceSol(int a, int b) {
        int count = 0;

        for (int c = a ^ b; c != 0; c = c >> 1)
            count++;

        return count;
    }

    // Better solution
    public int bitDifferenceSol2(int a, int b) {
        int count = 0;

        for (int c = a ^ b; c != 0; c = c & (c - 1))
            count++;

        return count;
    }

    // Attempt assuming unsigned integer
    public int bitDifference(int a, int b) {
        int count = 0, i = 31;

        while (i > 0) {
            int mask = 1 << i;

            if ((a & mask) != (b & mask))
                count++;

            i++;
        }

        return count;
    }

}
