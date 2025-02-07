package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {

    public static void main(String[] args) {

        int[][] intervals = {{0, 2}, {1, 4}, {3, 5}, {10, 15}, {23, 35}, {40, 42}, {41, 44}, {43, 45}};

        int[][] result = merge(intervals);

        System.out.println(Arrays.deepToString(result));


    }

    private static int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> lists = new ArrayList<>();

        lists.add(intervals[0]);

        int j = 0;


        for (int i = 1; i < intervals.length; i++) {
            int[] pre = lists.get(j);

            int a = pre[0];
            int b = pre[1];

            int c = intervals[i][0];
            int d = intervals[i][1];

            if (a <= c && b >= c) {
                pre[1] = Math.max(b, d);
            } else {
                j++;
                lists.add(new int[]{c, d});
            }
        }

        return lists.toArray(new int[lists.size()][]);

    }
}
