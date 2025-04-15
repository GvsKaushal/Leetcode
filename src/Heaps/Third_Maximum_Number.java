package Heaps;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Third_Maximum_Number {

    public int thirdMax(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        PriorityQueue<Integer> min_heap = new PriorityQueue<>();

        for (int num : nums) {
            if (!hashSet.contains(num)) {
                if (min_heap.size() < 3) {
                    min_heap.add(num);
                    hashSet.add(num);
                } else {
                    if (num > min_heap.peek()) {
                        hashSet.remove(min_heap.poll());
                        min_heap.add(num);
                        hashSet.add(num);
                    }
                }
            }
        }

        if (min_heap.size() < 3) {
            int max = Integer.MIN_VALUE;

            for (Integer num : min_heap) {
                max = Math.max(max, num);
            }

            return max;
        }

        return min_heap.peek();
    }
}
