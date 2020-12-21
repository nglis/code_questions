package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CoinCalculations {

    // List all the way of representing n cents with coins (1, 5, 10, 25)

    public int solution(int n, int denom) {
        int next_denom = 0;
        switch (denom) {
            case 25:
                next_denom = 10;
                break;
            case 10:
                next_denom = 5;
                break;
            case 5:
                next_denom = 1;
                break;
            case 1:
                return 1;
        }

        int ways = 0;
        for (int i = 0; i * denom <= n; i++) {
            ways += solution(n-i * denom, next_denom);
        }
        return ways;
    }

    public void combinations(ArrayList<ArrayList<Integer>> combinations, ArrayList<Integer> coins, int addCoin, int n) {
        coins.add(addCoin);

        if (sum(coins) > n) {
            return;
        } else if(sum(coins) == n) {
            combinations.add(coins);
            return;
        }

        combinations(combinations, new ArrayList(coins), 25, n);
        combinations(combinations, new ArrayList(coins), 10, n);
        combinations(combinations, new ArrayList(coins), 5, n);
        combinations(combinations, new ArrayList(coins), 1, n);
    }

    public int sum(ArrayList<Integer> coins) {
        int s = 0;

        for (Integer coin : coins) {
            s += coin;
        }

        return s;
    }

}
