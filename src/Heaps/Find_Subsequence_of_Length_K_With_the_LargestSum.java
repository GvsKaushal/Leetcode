package Heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Find_Subsequence_of_Length_K_With_the_LargestSum {

    public static void main(String[] args) {

        int[] nums = {50,-75};
        int k = 2;

        System.out.println(Arrays.toString(maxSubsequence(nums, k)));
    }

    private static int[] maxSubsequence(int[] nums, int k) {

        if (k == nums.length) return nums;

        class pair {
            int value;
            int index;

            pair(int value, int index) {
                this.value = value;
                this.index = index;
            }
        }

        PriorityQueue<pair> min_heap = new PriorityQueue<>((a, b) -> a.value - b.value);


        for (int i = 0; i < nums.length; i++) {
            if (min_heap.size() < k) {
                min_heap.add(new pair(nums[i], i));
            } else {
                if (nums[i] > min_heap.peek().value) {
                    min_heap.poll();
                    min_heap.add(new pair(nums[i], i));
                }
            }
        }

        pair[] pair_list = new pair[min_heap.size()];
        int count1 = 0;

        for (pair p : min_heap) {
            pair_list[count1] = p;
            count1++;
        }

        Arrays.sort(pair_list, (a, b) -> a.index - b.index);

        int[] result = new int[k];
        int count = 0;

        for (pair p : pair_list) {
            result[count] = p.value;
            count++;
        }

        return result;
    }
}
