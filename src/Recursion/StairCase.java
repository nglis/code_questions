package Recursion;

public class StairCase {

    // attempt
    private int n;
    private int combinations;

    public void getCombinations(int n) {
        if (n == 0) {
            combinations++;
        } else if (n < 0) {
            return;
        }

        getCombinations(n - 1);
        getCombinations(n - 2);
        getCombinations(n - 3);
    }

    // solution
    public int countSteps(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }

        return countSteps(n - 1) + countSteps(n - 2) + countSteps(n - 3);
    }

    // with cache
    public int countStepsCached(int n, int[] map) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (map[n] > -1) {
            return map[n];
        }

        map[n] = countStepsCached(n - 1, map) + countStepsCached(n - 2, map) + countStepsCached(n - 3, map);
        return map[n];
    }

}
