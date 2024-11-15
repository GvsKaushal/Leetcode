package StringProblems;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str1 = {"flower", "flow", "flight"};

        String longestCommonPrefix = longestCommonPrefix(str1);
        System.out.println(longestCommonPrefix);
    }

    private static String longestCommonPrefix(String[] strs) {

        int n = strs.length;

        if (n == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < n; i++) {

            while (strs[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.length()==0){
                    return "";
                }
            }
        }

        return prefix;
    }
}
