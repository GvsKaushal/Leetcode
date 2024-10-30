package ArrayProblems.MajorityElement;

// Moore Vote Algorithm
// leetcode
// we can also use hashmap


import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {

        int[] arr = {3, 2, 3};

        List<Integer> list = findMajorityElement2(arr);

        System.out.println(list);

    }

    private static List<Integer> findMajorityElement2(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int n = nums.length;

        Integer majority1 = null;
        int count1 = 0;

        Integer majority2 = null;
        int count2 = 0;

        for (int num : nums) {

            if (majority1 != null && majority1 == num) {
                count1++;
            } else if (majority2 != null && majority2 == num) {
                count2++;
            } else if (count1 == 0) {
                majority1 = num;
            } else if (count2 == 0) {
                majority2 = num;
            } else {
                count1--;
                count2--;
            }

        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (majority1 != null && majority1 == num) {
                count1++;
            }
            if (majority2 != null && majority2 == num) {
                count2++;
            }
        }


//        if (count1 >= com) {
//            list.add(majority1);
//        }
//
//        if (count2 >= com) {
//            list.add(majority2);
//        }

        return list;
    }
}
