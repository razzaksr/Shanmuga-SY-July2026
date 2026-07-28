package day6;

import java.util.Arrays;

public class MoveZeroViaRecursion {
    public static void reOrder(int[] arr,
        int index,int proper)
    {
        if(index==arr.length){
            Arrays.fill(arr, proper,arr.length,
                0);
            return;
        }
        if(arr[index]!=0)
        {arr[proper] = arr[index];proper++;}
        reOrder(arr, index+1, proper);
    }
    public static void moveZeros(int[] arr)
    {
        reOrder(arr, 0, 0);
    }
    public static void main(String[] args) {
        int[] issues = {0,1,0,24,76,91};
        moveZeros(issues);
        System.out.println(Arrays.toString(issues));
    }
}
