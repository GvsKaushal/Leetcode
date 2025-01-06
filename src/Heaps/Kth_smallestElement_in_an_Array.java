package Heaps;

import java.util.PriorityQueue;

public class Kth_smallestElement_in_an_Array {

    public static int kthSmallest(int[] arr, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            heap.poll();
        }

        return heap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int result = kthSmallest(nums, k);
        System.out.println(result);
    }
}
