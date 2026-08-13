package day4;

import java.util.Arrays;

public class TwoSumInSortedViaTP {
    public static int[] sum(int[] arr, int target){
        int start=0, end=arr.length-1,sum=0;
        while(start<end){
            sum=arr[start]+arr[end];
            if(sum==target)
                return new int[]{start+1,end+1};
            else if(sum>target) end--;
            else start++;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] case1 = {0,1,2,3,4};
        int[] case2 = {1,3,1,-1};
        int[] case3 = {-1,1,1,3};
        System.out.println(Arrays.toString(sum(case1,5)));
        System.out.println(Arrays.toString(sum(case2,2)));
        System.out.println(Arrays.toString(sum(case3,2)));
    }
}
