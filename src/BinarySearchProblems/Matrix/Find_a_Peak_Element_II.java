package BinarySearchProblems.Matrix;

import java.util.Arrays;

public class Find_a_Peak_Element_II {

    public static void main(String[] args) {

        int[][] mat = {{10, 20, 15}, {21, 30, 14}, {7, 16, 32}};

        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }

    private static int[] findPeakGrid(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            int maxrow = 0;

            for (int i = 0; i < m; i++) {
                if (mat[i][mid] > mat[maxrow][mid]) {
                    maxrow = i;
                }
            }

            int left_neighbour = (mid > 0) ? mat[maxrow][mid - 1] : -1;
            int right_neighbour = (mid < n - 1) ? mat[maxrow][mid + 1] : -1;

            if (mat[maxrow][mid] > left_neighbour && mat[maxrow][mid] > right_neighbour) {
                return new int[]{maxrow, mid};
            }

            if (left_neighbour > mat[maxrow][mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
