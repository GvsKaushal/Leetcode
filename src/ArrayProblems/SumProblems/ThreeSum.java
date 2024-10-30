package ArrayProblems.SumProblems;

// leetcode video
// you can remove duplicates hashset

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);

    }

    private static List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        HashSet<List<Integer>> list = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < n; i++) {

            if (!duplicates.contains(nums[i])) {

                duplicates.add(nums[i]);

                for (int j = i + 1; j < n; j++) {

                    int complement = -nums[i] - nums[j];

                    if (map.containsKey(complement) && map.get(complement) == i) {
                        List<Integer> l = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(l);
                        list.add(l);
                    }
                    map.put(nums[j], i);
                }
            }

        }

        return new ArrayList<>(list);
    }
}
