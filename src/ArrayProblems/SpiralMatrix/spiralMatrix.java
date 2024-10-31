package ArrayProblems.SpiralMatrix;

// notes
// https://www.youtube.com/watch?v=3Zv-s9UUrFM

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(Arrays.deepToString(arr));
        List<Integer> array = spiralOrder(arr);
        System.out.println(array);
    }

    private static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> array = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                array.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                array.add(matrix[i][right]);
            }
            right--;

            if (left <= right && top <= bottom){

                for (int i = right; i >= left; i--) {
                    array.add(matrix[bottom][i]);
                }
                bottom--;

                for (int i = bottom; i >= top; i--) {
                    array.add(matrix[i][left]);
                }
                left++;

            }

        }

        return array;
    }
}
