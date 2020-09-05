package ArraysAndLists;

public class ZeroMatrix {

    public void solution(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    row[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if (row[i] || column[j])
                    matrix[i][j] = 0;
            }
        }
    }

}
