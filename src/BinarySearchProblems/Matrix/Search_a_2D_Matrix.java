package BinarySearchProblems.Matrix;

public class Search_a_2D_Matrix {

    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;

//        searchMatrix(matrix, target);

        System.out.println(searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix[0].length;
        int n = matrix.length;


        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][m - 1]) {
                int left = 0;
                int right = m - 1;

                while (left <= right) {

                    int mid = (left + right) / 2;

                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (matrix[i][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }


        return false;
    }
}
