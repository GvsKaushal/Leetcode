package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {

    public static void main(String[] args) {

        int n = 4;
        System.out.println(solveNQueens(n));
    }

    private static List<List<String>> solveNQueens(int n) {

        List<List<String>> lists = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, n, lists, 0);

        return lists;
    }


    private static void solve(char[][] board, int n, List<List<String>> lists, int row) {

        if (row == n) {
            lists.add(constructBoard(board));
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, n, row, j)) {
                board[row][j] = 'Q';
                solve(board, n, lists, row + 1);
                board[row][j] = '.';
            }
        }

    }

    private static boolean isSafe(char[][] board, int n, int row, int col) {

        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static List<String> constructBoard(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }

}
