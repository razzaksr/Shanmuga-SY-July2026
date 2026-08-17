package day6;

import java.util.HashMap;
import java.util.Map;

public class ClimbViaDP {
    
    // using memorization
    static Map<Integer,Integer> cache = new HashMap<>();
    public static int climbTd(int stairs){
        if(stairs<=2) return stairs;
        if(cache.containsKey(stairs)) 
            return cache.get(stairs);
        int res = climbTd(stairs-1)+climbTd(stairs-2);
        cache.put(stairs, res);
        return res;
    }
    // Tabular approach
    public static int climbBu(int stairs){
        if(stairs<=2) return stairs;
        int[] poss = new int[stairs+1];
        poss[0]=0;poss[1]=1;poss[2]=2;
        for(int ind=3;ind<=stairs;ind++)
            poss[ind]=poss[ind-1]+poss[ind-2];
        return poss[stairs];
    }
    public static void main(String[] args) {
        System.out.println(climbBu(8));
    }
}
