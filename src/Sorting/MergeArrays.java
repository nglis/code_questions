package Sorting;

public class MergeArrays {
    // Merge array B into A in sorted order

    public void merge(int[] A, int[] B) {
        int lastIndexA = A.length - 1;
        int lastIndexB = B.length - 1;
        int mergeIndex = lastIndexA;

        while (lastIndexA >= 0 && lastIndexB >= 0) {
            if (A[lastIndexA] > B[lastIndexB]) {
                A[mergeIndex] = A[lastIndexA];
                lastIndexA--;
            } else if (A[lastIndexA] < B[lastIndexB]) {
                A[mergeIndex] = B[lastIndexB];
                lastIndexB--;
            }
            mergeIndex--;
        }

        for (int i = lastIndexB; i >= 0; i--) {
            A[mergeIndex] = B[i];
            mergeIndex--;
        }
    }
}
