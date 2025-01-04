package Heaps;

// https://www.youtube.com/watch?v=i7Mt70QERw4

import java.util.PriorityQueue;

public class Kth_LargestElement_in_a_Stream {

    private PriorityQueue<Integer> heap;
    private int k;

    public void KthLargest(int k, int[] nums) {

        this.heap = new PriorityQueue<>();
        this.k = k;

        for (int num : nums) {
            add(num);
        }

    }

    public int add(int val) {

        if (heap.size() < k) {
            heap.add(val);
        } else {
            if (val > heap.peek()) {
                heap.poll();
                heap.add(val);
            }
        }

        return heap.peek();
    }
}
