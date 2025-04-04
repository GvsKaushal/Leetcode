package ArrayProblems;

// https://leetcode.com/problems/reverse-integer/description/

public class ReverseInteger {

    public static void main(String[] args) {

        int x = -123000;

        System.out.println(reverse(x));
    }

    private static int reverse(int x) {

        int num = x;
        long rev = 0;

        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) rev;
    }
}
