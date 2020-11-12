package BitManipulation;

public class FindMissingInteger {

    // Find the missing integer in an array
    public int missingInt(int[] values) {
        int lastBit = -1;

        for (int i = 0; i < values.length; i++) {
            if (lastBit == (values[i] & 1))
                return values[i] - 1;

            lastBit = (values[i] & 1);
        }

        return -1;
    }
}
