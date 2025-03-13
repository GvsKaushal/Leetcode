package StringProblems.Sliding;

public class Minimum_Window_Substring {

    public static void main(String[] args) {

        String s = "a";
        String t = "a";

        System.out.println(minWindow(s, t));
    }

    private static String minWindow(String s, String t) {

        int len_s = s.length();
        int len_t = t.length();

        int[] arr = new int[60];

        for (int i = 0; i < len_t; i++) {
            arr[t.charAt(i) - 'A']++;
        }

        int left = 0;
        int count = 0;
        int min_len = Integer.MAX_VALUE;
        int sub_start = -1;

        for (int right = 0; right < len_s; right++) {

            int index = s.charAt(right) - 'A';
            if (arr[index] > 0) {
                count++;
            }
            arr[index]--;

            while (count == len_t) {

                if (right - left + 1 < min_len) {
                    min_len = right - left + 1;
                    sub_start = left;
                }

                arr[s.charAt(left) - 'A']++;

                if (arr[s.charAt(left) - 'A'] > 0) {
                    count--;
                }
                left++;
            }
        }

        return (sub_start == -1) ? "" : s.substring(sub_start,sub_start+min_len);

    }
}
