package Recursion;

public class MagicIndex {

    public int getMagicIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                return i;
            }
        }

        return -1;
    }

    public int solution(int[] arr, int start, int end) {
        if (end < start || start < 0 || end >= arr.length) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == mid) {
            return mid;
        } else if (arr[mid] < mid) {
            return solution(arr, mid + 1, end);
        } else {
            return solution(arr, start, mid - 1);
        }
    }

    public int solutionHelper(int[] arr) {
        return solution(arr, 0, arr.length - 1);
    }

}
