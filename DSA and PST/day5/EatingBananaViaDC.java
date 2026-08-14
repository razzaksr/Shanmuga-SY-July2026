package day5;

import java.util.Arrays;

public class EatingBananaViaDC {
    public static boolean eatable(int[] arr, int hr, int sp){
        long cur = 0;
        for(int piller:arr)cur+=(piller+sp-1)/sp;
        return cur<=hr;
    }
    public static int minEatingSpeed(int[] arr, int hours){
        int start=1, end = Arrays.stream(arr).max()
                            .orElse(0), mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(eatable(arr, hours, mid)) end = mid-1;
            else start=mid+1;
        }
        return start;
    }
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8));
    }
}
