package day5;

import java.util.Arrays;

public class DemoPreFixSum {
    public static void sumPre(int[] og, int[] dest, int index){
        if(index==0)
            {dest[index] = og[index];return;}
        sumPre(og, dest, index-1);
        dest[index] = dest[index-1] + og[index];
    }
    public static void main(String[] args) {
        int[] numbers = {12,5,21,6,43};
        int[] prefix = new int[numbers.length];
        sumPre(numbers, prefix, numbers.length-1);
        System.out.println(Arrays.toString(prefix));
    }
}
