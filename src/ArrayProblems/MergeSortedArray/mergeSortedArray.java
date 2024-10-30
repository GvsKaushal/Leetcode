package ArrayProblems.MergeSortedArray;

// https://www.youtube.com/watch?v=C4oBXLr3zos


import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        merge(arr1, 3, arr2, 3);

        System.out.println(Arrays.toString(arr1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {

        int read1 = m - 1;
        int read2 = n - 1;
        int write = nums1.length - 1;

        while (read2 >= 0) {

            if (read1 >= 0 && nums1[read1] >= nums2[read2]) {
                nums1[write] = nums1[read1];
                write--;
                read1--;
            } else {
                nums1[write] = nums2[read2];
                write--;
                read2--;
            }
        }

    }

}
