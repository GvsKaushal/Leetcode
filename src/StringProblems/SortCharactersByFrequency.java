package StringProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        String str = "eeeee";
        String frequencySort = frequencySort(str);
        System.out.println(frequencySort);
    }

    private static String frequencySort(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        int n = s.length();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (hashMap.size()==1){
            return s;
        }

        List<List<Character>> buckets = new ArrayList<>();
        for (int j = 0; j <= n; j++) {
            buckets.add(new ArrayList<>());
        }

        for (char c : hashMap.keySet()) {
            int freq = hashMap.get(c);
            buckets.get(freq).add(c);
        }

        for (int i = buckets.size() - 1; i > 0; i--) {
            for (Character c : buckets.get(i)) {
                for (int j = 0; j < i; j++) {
                    stringBuilder.append(c);
                }
            }
        }



        return String.valueOf(stringBuilder);
    }

}
