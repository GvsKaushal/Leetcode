package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class K_ClosestPoints_to_Origin {

    public static void main(String[] args) {

        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    private static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> max_heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int[] pts : points) {
            int x = pts[0];
            int y = pts[1];

            int distance_square = ((x * x) + (y * y));

            if (max_heap.size() < k) {
                max_heap.add(new int[]{distance_square, x, y});
            } else {
                if (distance_square < max_heap.peek()[0]) {
                    max_heap.poll();
                    max_heap.add(new int[]{distance_square, x, y});
                }
            }
        }

        int[][] result = new int[k][2];
        int count = 0;

        for (int[] arr : max_heap) {
            result[count][0] = arr[1];
            result[count][1] = arr[2];
            count++;
        }

        return result;
    }
}
