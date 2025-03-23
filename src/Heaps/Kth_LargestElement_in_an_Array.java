package Heaps;

import java.util.PriorityQueue;

public class Kth_LargestElement_in_an_Array {

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int num : nums) {
            if (heap.size() < k) {
                heap.add(num);
            } else {
                if (num > heap.peek()) {
                    heap.poll();
                    heap.add(num);
                }
            }
        }

        return heap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 4;

        int result = findKthLargest(nums, k);
        System.out.println(result);
    }
}
