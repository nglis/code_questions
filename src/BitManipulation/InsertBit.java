package BitManipulation;

public class InsertBit {

    // More efficient approach

    public int soln(int n, int m, int i, int j) {
        int ones = ~0;

        int leftMask = ones << (j + 1);
        int rightMask = ((1 << i) - 1);

        int mask = leftMask | rightMask;

        int n_masked = n & mask;
        int m_shifted = m << i;

        return n_masked | m_shifted;

    }

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
