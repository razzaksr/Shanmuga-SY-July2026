package day1;

import java.util.Arrays;

public class PlusOne {
    public static int[] plus(int[] arr){
        int size = arr.length;
        for(int index=size-1;index>=0;index--){
            if(arr[index]<9){
                arr[index]++;
                return arr;
            }
            arr[index]=0;
        }
        int[] newOne = new int[size+1];
        newOne[0]=1;
        return newOne;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plus(new int[]{1,4,9})));
        System.out.println(Arrays.toString(plus(new int[]{8,9})));
        System.out.println(Arrays.toString(plus(new int[]{9,9,9})));
        System.out.println(Arrays.toString(plus(new int[]{1,4})));
    }
}
