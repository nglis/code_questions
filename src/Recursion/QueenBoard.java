package Recursion;

import java.util.ArrayList;

public class QueenBoard {

    // Arrange eight queens on 8x8 chess board without any sharing same file,rank or diagonal

    int GRID_SIZE = 8;

    void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results) {
        if (row == GRID_SIZE) {
            results.add(columns.clone());
        } else {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (checkValid(columns, row, col)) {
                    columns[row] = col;
                    placeQueens(row + 1, columns, results);
                }
            }
        }
    }

    boolean checkValid(Integer[] columns, int row1, int column1) {
        for (int row2 = 0; row2 < row1; row2++) {
            int column2 = columns[row2];

            if (column1 == column2) {
                return false;
            }

            int columnDistance = Math.abs(column2 - column1);

            int rowDistance = row1 - row2;
            if (columnDistance == rowDistance) {
                return false;
            }
        }

        return true;
    }

}
