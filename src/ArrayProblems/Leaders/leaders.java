package ArrayProblems.Leaders;

import java.util.Arrays;

// https://www.youtube.com/watch?v=cHrH9CQ8pmY


public class leaders {
    public static void main(String[] args) {

        int[] arr = {30, 10, 10, 5};
        int[] result = findLeaders(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findLeaders(int[] arr) {

        int n = arr.length;
        int[] array = new int[n];
        int count = 0;
        int leader = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= leader) {
                leader = arr[i];
                array[count] = arr[i];
                count++;
            }
        }

        array=Arrays.copyOf(array,count);

        return array;
    }
}
