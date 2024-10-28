package ArrayProblems.RemoveDuplicates;

import java.util.Arrays;
import java.util.HashMap;

// Time - o(n)
// space - o(n)

public class UnSortedArray {
    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 10, 5, 5, 2, 1, 10, 2, 1, 5, 10, 2, 1, 1, 10, 5, 2, 10};
        System.out.println(Arrays.toString(arr));

        int[] array = RemoveDuplicatesFromUnsortedArray(arr);

        System.out.println(Arrays.toString(array));
    }

    private static int[] RemoveDuplicatesFromUnsortedArray(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] array = new int[n];
        int count=0;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                array[count]=nums[i];
                count++;
            }
        }

        array=Arrays.copyOf(array,count);

        return array;
    }
}
