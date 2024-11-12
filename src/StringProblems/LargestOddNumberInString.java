package StringProblems;


public class LargestOddNumberInString {

    public static void main(String[] args) {

        String str = "57525534";
        String largestOddNumber = largestOddNumber(str);
        System.out.println(largestOddNumber);
    }

    private static String largestOddNumber(String num) {

        int n = num.length();

        for (int i = n - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if (c % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
