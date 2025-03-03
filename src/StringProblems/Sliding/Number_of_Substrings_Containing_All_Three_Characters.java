package StringProblems.Sliding;

import java.util.Arrays;

// Time Limit Exceeded

public class Number_of_Substrings_Containing_All_Three_Characters {

    public static void main(String[] args) {

        String s = "aaacb";

        System.out.println(numberOfSubstrings(s));
    }

    private static int numberOfSubstrings(String s) {

        int len = s.length();

        boolean[] arr = new boolean[3];
        int count = 0;

        for (int i = 0; i < len; i++) {

            Arrays.fill(arr, false);

            for (int j = i; j < len; j++) {
                arr[s.charAt(j) - 'a'] = true;
                if (arr[0] && arr[1] && arr[2]) {
                    count++;
                    count = count + (len - (j - 0 + 1));
                    break;
                }
            }
        }

        return count;
    }
}
