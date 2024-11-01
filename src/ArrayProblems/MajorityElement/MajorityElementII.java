package ArrayProblems.MajorityElement;

// Moore Vote Algorithm
// leetcode


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {

        int[] arr = {3, 2, 3};

        List<Integer> list = findMajorityElement2(arr);

        System.out.println(list);

    }

    private static List<Integer> findMajorityElement2(int[] nums) {

        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        int z = n / 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > z) {
                list.add(e.getKey());
            }
        }

        return list;
    }
}
