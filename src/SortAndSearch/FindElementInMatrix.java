package SortAndSearch;

public class FindElementInMatrix {
    // Find element in a M x N matrix
    public boolean search(int[][] matrix, int elem) {
        int row = 0;
        int col = matrix[0].length;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == elem) {
                return true;
            }
            if (elem < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

}
