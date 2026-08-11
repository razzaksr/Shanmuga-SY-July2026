package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGrouping {
    // O(n.klogk)>> n>> number of words from array
    // k length of chars>> sort, search computation
    public static List<List<String>> group(String[] strs) {
        Map<String, List<String>> tab = new HashMap<>();
        for(String each:strs){
            char[] temp = each.toCharArray();
            Arrays.sort(temp);String key = new String(temp);
            tab.computeIfAbsent(key, k->new ArrayList<>())
                        .add(each);
        }
        return tab.values().stream().toList();
    }
    public static void main(String[] args) {
        System.out.println(group(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(group(new String[]{"a"}));
        System.out.println(group(new String[]{}));
    }
}
