package day6;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr, int k){
        int mid = k%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, mid-1);
        reverse(arr, mid, arr.length-1);
    }
    public static void reverse(int[] arr, 
        int start, int end)
    {
        while(start<end){
            arr[start]^=arr[end];
            arr[end]^=arr[start];
            arr[start]^=arr[end];start++;end--;
        }
    }
    public static void main(String[] args) {
        int[] case1 = {1,2,3,4,5,6,7};
        int[] case2 = {-1,-100,3,99};
        int[] case3 = {9,8,11,14,18,33};
        rotate(case1, 3);
        rotate(case2, 2);
        rotate(case3, 4);
        System.out.println(Arrays.toString(case1));
        System.out.println(Arrays.toString(case2));
        System.out.println(Arrays.toString(case3));
    }
}
