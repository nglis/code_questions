package MathAndProbability;

public class OperationsWithAddition {
    // Implement subtraction, division and multiplication using addition operator

    public static int subtract (int a, int b) {
        return a + negate(b);
    }

    public static int negate(int a) {
        int neg = 0;
        int d = a < 0 ? 1 : -1;

        while(a != 0) {
            a += d;
            neg += d;
        }

        return neg;
    }

}
