package ss11_stack_queue.exercise.count_the_number_of_occurrences;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
//        Map<String, Integer> treemap = new TreeMap<String, Integer>();
//        treemap.put("java", 1);
//        treemap.put("c++", 2);
//        treemap.put("php", 3);
//
//        String treemap1 = "huynl";
//        String[] strings = treemap1.split("");
//        for (int i = 0; i < treemap1.length(); i++) {
//            int count = 0;
//            Set<String> keySet = treemap.keySet();
//            for (String key : keySet) {
//                System.out.println(key + "-" + treemap.get(key));
//            }
////            if (treemap.equals(treemap1)) {
////                treemap1.toUpperCase();
////            }
//        }
//        System.out.println(treemap);
        String str = "nguyen le huy huynl";
        String[] str1 = str.toUpperCase().split(" ");

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String key : str1) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        System.out.println(map);
    }
}
