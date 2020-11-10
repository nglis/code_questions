package BitManipulation;

public class SwapOddEvenBits {

    // Swaps odd and even bits using 1010101010 bit patterns as masks then shifting
    public int solution (int n) {
        return (((n & (0xaaaaaaaa)) >> 1) | ((n & (0x55555555)) << 1));
    }

    // Attempt
    public int swapOddEven (int n) {
        int temp = n;

        while (temp != 0) {
            int even = temp & 1;
            int odd = (temp >> 1) & 1;

            if (even > odd)
                n = n & (~(0) - 1);

            if (odd > even)
                n = n & (~(0) - 2);

            temp = temp >> 2;
        }

        return n;
    }
}
