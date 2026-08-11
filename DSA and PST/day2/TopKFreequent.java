package day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFreequent {
    // O(nlogk)>> time and O(n >> space)
    public static int[] freequent(int[] arr, int k){
        int[] res = new int[k];
        Map<Integer, Integer> tab = new HashMap<>();
        for(int each:arr){
            tab.put(each, tab.getOrDefault(
                each, 0)+1);
        }
        Queue<Map.Entry<Integer, Integer>> pq = 
            new PriorityQueue<>((e1,e2)->
                        e1.getValue()-e2.getValue());
        for(Map.Entry<Integer, Integer> entry:tab.entrySet()){
            pq.offer(entry);
            if(pq.size()>k) pq.poll();
        }
        for(int ind=k-1;ind>=0;ind--)
            res[ind] = pq.poll().getKey();
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(freequent(new int[]{1,1,1,2,2,3}, 2)));
        System.out.println(Arrays.toString(freequent(new int[]{3,5,7,3,5,8,7,6}, 2)));
    }
}
