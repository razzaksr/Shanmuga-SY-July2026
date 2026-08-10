package day5;

import java.util.Arrays;

public class DemoPostFixSum {
    public static void sumPost(int[] og, int[] dest, int index){
        if(index==og.length-1)
            {dest[index] = og[index];return;}
        sumPost(og, dest, index+1);
        dest[index] = dest[index+1] + og[index];
    }
    public static void main(String[] args) {
        int[] numbers = {12,5,21,6,43};
        int[] postfix = new int[numbers.length];
        sumPost(numbers, postfix, 0);
        System.out.println(Arrays.toString(postfix));
    }
}
