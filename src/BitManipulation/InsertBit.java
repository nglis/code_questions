package BitManipulation;

public class InsertBit {

    // Insert a 32-bit number into another 32-bit number between given positions
    // i.e. A = 1000100, B = 101, i = 5, Result = 1101100

    public int insertNum(int N, int M, int i, int j) {
        int zeroed = N;

        for (int p = i; p <= j; p++)
            zeroed = clearBit(zeroed, p);

        int M_updated = M << i;

        return zeroed | M_updated;
    }

}
