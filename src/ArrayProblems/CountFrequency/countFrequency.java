package ArrayProblems.CountFrequency;

import java.util.HashMap;
import java.util.Map;

public class countFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 6, 8, 4, 2, 5, 6, 8, 3, 1, 4, 5, 7, 5, 3, 4, 5, 5, 6, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        System.out.println(map);

        if (map.containsValue(3)){
            System.out.println(map.containsValue(3));
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue()==3){
                System.out.println(e.getKey());
            }
        }


    }
}
