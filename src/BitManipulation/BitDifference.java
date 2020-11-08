package BitManipulation;

public class BitDifference {

    // Attempt assuming unsigned integer
    public int bitDifference (int a, int b) {
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
