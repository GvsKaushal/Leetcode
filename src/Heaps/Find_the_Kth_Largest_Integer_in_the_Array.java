package Heaps;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Find_the_Kth_Largest_Integer_in_the_Array {

    public String kthLargestNumber(String[] nums, int k) {

        PriorityQueue<BigInteger> min_heap = new PriorityQueue<>();
        int count = 0;

        for (String str : nums) {

            BigInteger number = new BigInteger(str);

            if (count < k) {
                min_heap.add(number);
                count++;
            } else {
                int result = number.compareTo(min_heap.peek());

                if (result > 0) {
                    min_heap.poll();
                    min_heap.add(number);
                }
            }
        }

        return min_heap.peek().toString();
    }
}
