package ArrayProblems.SetMatrixZeroes;

import java.util.Arrays;
import java.util.HashSet;

public class setMatrixZeroes {
    public static void main(String[] args) {

        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println(Arrays.deepToString(arr));
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    private static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        HashSet<Integer> setRow = new HashSet<>();
        HashSet<Integer> setcol = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    setRow.add(i);
                    setcol.add(j);
                }
            }
        }

        for (int i : setRow) {
            for (int j=0;j<columns;j++){
                matrix[i][j]=0;
            }
        }

        for (int j : setcol) {
            for (int i=0;i<rows;i++){
                matrix[i][j]=0;
            }
        }
    }
}
