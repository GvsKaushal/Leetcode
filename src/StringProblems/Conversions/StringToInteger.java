package StringProblems.Conversions;

public class StringToInteger {

    public static void main(String[] args) {

        String str = "+1";
        int myAtoi = myAtoi(str);
        System.out.println(myAtoi);
    }

    private static int myAtoi(String s) {

        s = s.trim();

        int n = s.length();

        int count = 0;
        long sum = 0;
        int sign = 1;


        for (int i = 0; i < n; i++) {
            if (i == 0 && s.charAt(i) == '-' || i == 0 && s.charAt(i) == '+') {
                if (s.charAt(i) == '-') sign = -1;
            } else if (count == 0 && s.charAt(i) == '0') {
                continue;
            } else if (Character.isDigit(s.charAt(i))) {
                count = 1;

                long l = s.charAt(i) - '0';
                sum = sum * 10 + l;

                if (sum > Integer.MAX_VALUE) {
                    if (sign == -1) {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }

            } else {
                return (int) (sign * sum);
            }
        }

        return (int) (sign * sum);
    }
}
