package Heaps;

import java.util.*;

public class Top_K_Frequent_Elements {

    public static void main(String[] args) {

        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    private static int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> min_heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());


        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (min_heap.size() < k) {
                min_heap.add(entry);
            } else {
                if (entry.getValue() > min_heap.peek().getValue()) {
                    min_heap.poll();
                    min_heap.add(entry);
                }
            }
        }


        int[] result = new int[k];
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : min_heap) {
            result[count] = entry.getKey();
            count++;
        }


        return result;
    }
}
