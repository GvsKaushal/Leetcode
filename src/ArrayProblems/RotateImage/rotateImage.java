package ArrayProblems.RotateImage;

// notes

import java.util.Arrays;

public class rotateImage {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Arrays.deepToString(arr));
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    private static void rotate(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < columns; j++) {
                swapTemp(matrix, i, j);
            }
        }

        for (int i = 0; i < rows; i++) {
            Reverse(matrix[i], 0, columns - 1);
        }

    }

    private static void swapTemp(int[][] nums, int i, int j) {

        int temp = nums[i][j];
        nums[i][j] = nums[j][i];
        nums[j][i] = temp;

    }

    private static void Reverse(int[] arr, int first, int last) {

        while (first < last) {

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
}
