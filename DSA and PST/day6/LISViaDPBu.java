package day6;

import java.util.Arrays;

public class LISViaDPBu {
    public static int longestIncreasingSub(int[] arr){
        int size = arr.length, maxLen=1;
        int[] poss = new int[size];
        Arrays.fill(poss, 1);
        for(int select=1;select<size;select++){
            for(int com=0;com<select;com++){
                if(arr[select]>arr[com]){
                    poss[select] = Math.max(
                        poss[select], poss[com]+1);
                }
            }
            maxLen = Math.max(maxLen, poss[select]);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(longestIncreasingSub(new int[]
            {18,100,5,9,7,10}
        ));
        System.out.println(longestIncreasingSub(new int[]
            {10,9,2,5,3,7,101,18}
        ));
        System.out.println(longestIncreasingSub(new int[]
            {0,1,0,3,2,3}
        ));
    }
}
