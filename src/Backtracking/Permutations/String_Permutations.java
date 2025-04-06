package Backtracking.Permutations;

import java.util.ArrayList;
import java.util.List;

// without Duplicates
public class String_Permutations {

    public static void main(String[] args) {

        String str = "abc";
        List<String> lists = new ArrayList<>();

        generatePermutations(str, "", lists);

        System.out.println(lists);
    }

    private static void generatePermutations(String str, String s, List<String> lists) {

        if (str.length() == 0) {
            lists.add(s);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String string = str.substring(0, i) + str.substring(i + 1);

            generatePermutations(string, s + ch, lists);
        }
    }

}
