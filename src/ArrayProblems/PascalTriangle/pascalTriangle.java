package ArrayProblems.PascalTriangle;

// notes
// https://www.youtube.com/watch?v=bR7mQgwQ_o8

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {

        int pascalTriangle = 4;
        List<List<Integer>> list = findPascalTriangle(pascalTriangle);
        System.out.println(list);
    }

    private static List<List<Integer>> findPascalTriangle(int numRows) {

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            lists.add(generateRow(i));
        }

        return lists;
    }

    private static List<Integer> generateRow(int row) {

        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            list.add(ans);
        }

        return list;
    }
}
