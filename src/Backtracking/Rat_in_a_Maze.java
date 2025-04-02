package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Rat_in_a_Maze {

    public static void main(String[] args) {


        int[][] mat = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        List<String> paths = findPath(mat);

        System.out.println(paths);
    }

    private static List<String> findPath(int[][] mat) {

        int n = mat.length;
        int[][] visited = new int[n][n];

        List<String> stringList = new ArrayList<>();

        findAllPaths(mat, n, visited, stringList, "", 0, 0);

        return stringList;

    }

    private static void findAllPaths(int[][] mat, int n, int[][] visited, List<String> stringList, String str, int row, int col) {

        //base case
        if (row == n - 1 && col == n - 1) {
            stringList.add(str);
            return;
        }

        // down
        if (row + 1 < n && visited[row + 1][col] == 0 && mat[row + 1][col] == 1) {
            visited[row][col] = 1;
            findAllPaths(mat, n, visited, stringList, str + "D", row + 1, col);
            visited[row][col] = 0;
        }

        // right
        if (col + 1 < n && visited[row][col + 1] == 0 && mat[row][col + 1] == 1) {
            visited[row][col] = 1;
            findAllPaths(mat, n, visited, stringList, str + "R", row, col + 1);
            visited[row][col] = 0;
        }


        // left
        if (col - 1 >= 0 && visited[row][col - 1] == 0 && mat[row][col - 1] == 1) {
            visited[row][col] = 1;
            findAllPaths(mat, n, visited, stringList, str + "L", row, col - 1);
            visited[row][col] = 0;
        }


        // up
        if (row - 1 >= 0 && visited[row - 1][col] == 0 && mat[row - 1][col] == 1) {
            visited[row][col] = 1;
            findAllPaths(mat, n, visited, stringList, str + "U", row - 1, col);
            visited[row][col] = 0;
        }
    }


}
