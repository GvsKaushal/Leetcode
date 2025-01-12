package ArrayProblems.CountFrequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Top_K_FrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int j = 0; j < buckets.length; j++) {
            buckets[j] = new ArrayList<>();
        }

        for (int s : hashMap.keySet()) {
            int val = hashMap.get(s);
            buckets[val].add(s);
        }

        int[] f = new int[k];
        int count = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (!buckets[i].isEmpty()) {
                for (int num : buckets[i]) {
                    if (count < k) {
                        f[count] = num;
                        count++;
                    } else {
                        return f;
                    }
                }
            }
        }

        return f;
    }
}
