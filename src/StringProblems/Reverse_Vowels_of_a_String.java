package StringProblems;
// https://leetcode.com/problems/reverse-vowels-of-a-string/description/

public class Reverse_Vowels_of_a_String {

    public static void main(String[] args) {

        String s = "IceCreAm";

        System.out.println(reverseVowels(s));
    }

    private static String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int len = chars.length;

        int left = 0;
        int right = len - 1;

        while (left < right) {

            while (left < right) {
                if (chars[left] == 'A' || chars[left] == 'a' || chars[left] == 'E' || chars[left] == 'e' || chars[left] == 'I' || chars[left] == 'i' || chars[left] == 'O' || chars[left] == 'o' || chars[left] == 'U' || chars[left] == 'u') {
                    break;
                }
                left = left + 1;
            }

            while (left < right) {
                if (chars[right] == 'A' || chars[right] == 'a' || chars[right] == 'E' || chars[right] == 'e' || chars[right] == 'I' || chars[right] == 'i' || chars[right] == 'O' || chars[right] == 'o' || chars[right] == 'U' || chars[right] == 'u') {
                    break;
                }
                right = right - 1;
            }

            swap(chars, left, right);
            left = left + 1;
            right = right - 1;
        }

        return new String(chars);
    }

    private static void swap(char[] chars, int left, int right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }


}
