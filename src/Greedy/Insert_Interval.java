package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_Interval {

    public static void main(String[] args) {

        int[][] intervals = {{1, 3}};
        int[] newInterval = {4, 5};

        int[][] result = insert(intervals, newInterval);

        System.out.println(Arrays.deepToString(result));

    }

    private static int[][] insert(int[][] intervals, int[] newInterval) {

        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }

        int c = newInterval[0];
        int d = newInterval[1];
        boolean added = false;

        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];

            if (a <= c && b >= c) {
                intervals[i][1] = Math.max(b, d);
                added = true;
                break;
            }
        }

        if (!added) {
            List<int[]> lists = new ArrayList<>(Arrays.asList(intervals));
            lists.add(newInterval);
            intervals = lists.toArray(new int[lists.size()][]);
        }

        return merge(intervals);

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
