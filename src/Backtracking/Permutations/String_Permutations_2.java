package Backtracking.Permutations;

import java.util.*;

// with Duplicates
public class String_Permutations_2 {

    public static void main(String[] args) {

        String str = "aba";
        List<String> lists = new ArrayList<>();

        Permutations(str, lists);

        System.out.println(lists);
    }

    private static void Permutations(String str, List<String> lists) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String string = new String(arr);

        generatePermutations(string, "", lists);

    }

    private static void generatePermutations(String str, String s, List<String> lists) {

        if (str.length() == 0) {
            lists.add(s);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            if (i != 0 && str.charAt(i) == str.charAt(i - 1)) continue;

            char ch = str.charAt(i);
            String string = str.substring(0, i) + str.substring(i + 1);

            generatePermutations(string, s + ch, lists);
        }
    }

}
