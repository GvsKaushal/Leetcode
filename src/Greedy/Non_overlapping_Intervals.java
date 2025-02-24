package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Non_overlapping_Intervals {

    public static void main(String[] args) {

        int[][] intervals = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};

        int result = eraseOverlapIntervals(intervals);

        System.out.println(result);

    }

    private static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        System.out.println(Arrays.deepToString(intervals));

        int end_index = intervals[0][1];

        int overlap = 0;

        for (int i = 1; i < intervals.length; i++) {

            int c = intervals[i][0];
            int d = intervals[i][1];

            if (c < end_index) {
                overlap++;
                continue;
            } else {
                end_index = d;
            }
        }

        return overlap;
    }
}
