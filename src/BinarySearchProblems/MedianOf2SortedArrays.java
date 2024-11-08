package BinarySearchProblems;

public class MedianOf2SortedArrays {

    public static void main(String[] args) {

        int[] nums1 = {};
        int[] nums2 = {2, 3};

        double median = findMedianSortedArrays(nums1, nums2);

        System.out.println(median);

    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        double e1 = 0;
        double e2 = 0;

        int arr1 = 0;
        int arr2 = 0;

        int count = 0;

        int arr1Length = nums1.length;
        int arr2Length = nums2.length;
        int length = arr1Length + arr2Length;

        int mid = length / 2;

        while (arr1 < arr1Length && arr2 < arr2Length) {

            if (nums1[arr1] <= nums2[arr2]) {

                count++;

                if (count == mid) {
                    e1 = nums1[arr1];
                } else if (count == mid + 1) {
                    e2 = nums1[arr1];
                    break;
                }
                arr1++;

            } else {

                count++;

                if (count == mid) {
                    e1 = nums2[arr2];
                } else if (count == mid + 1) {
                    e2 = nums2[arr2];
                    break;
                }

                arr2++;

            }
        }

        while (arr1 < arr1Length) {

            count++;

            if (count == mid) {
                e1 = nums1[arr1];
            } else if (count == mid + 1) {
                e2 = nums1[arr1];
                break;
            }
            arr1++;
        }

        while (arr2 < arr2Length) {

            count++;

            if (count == mid) {
                e1 = nums2[arr2];
            } else if (count == mid + 1) {
                e2 = nums2[arr2];
                break;
            }

            arr2++;
        }

        if (length % 2 == 0) {
            return (e1 + e2) / 2;
        } else {
            return e2;
        }
    }
}
