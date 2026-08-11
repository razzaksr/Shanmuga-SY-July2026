package day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Longest Consequetive Sequence
public class LCS {
    // O(n)>> time, space
    public static int find(int[] arr){
        int ovLen =0, len=0;
        Set<Integer> lcs = new HashSet<>();
        for(int each:arr) lcs.add(each);
        for(int each:lcs){
            if(!lcs.contains(each-1)){
                len = 1;int next = each+1;
                while(lcs.contains(next)){
                    len++;next++;
                }
                ovLen = Math.max(ovLen, len);
            }
        }
        return ovLen;
    }
    // O(n2)
    // public static int find(int[] arr){
    //     Arrays.sort(arr);
    //     List<Integer> res = Arrays.stream(arr).boxed().toList();
    //     Map<Integer, Integer> tab = new HashMap<>();
    //     for(int each:arr)
    //         if(res.contains(each+1))
    //             tab.put(each, 1);
    //         else{
    //             return 1+(int)tab.values().stream().filter(val->val==1).count();
    //         }
    //     return 1;
    // }
    public static void main(String[] args) {
        System.out.println(find(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(find(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println(find(new int[]{1}));
        System.out.println(find(new int[]{10,20,30,40}));
    }
}
