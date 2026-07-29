package day7;

import java.util.Arrays;

public class MinMaxOf2D {
    public static int[] find(int[][] arr){
        // int[] result = new int[2];
        // 0th index min Value, 1th index max
        // Stream.min, max returns OptionalInt 
        // so we have to call getAsInt
        int[] result = {
            Integer.MAX_VALUE, 
            Integer.MIN_VALUE
        };
        for(int[] row:arr){
            result[0] = Math.min(result[0],
                        Arrays.stream(row).
                            min().getAsInt());
            result[1] = Math.max(result[1],
                        Arrays.stream(row).
                            max().getAsInt());
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] tds = {
            {2,5,12},
            {9,4},
            {45,89,20,30}
        };
        int[] received = find(tds);
        System.out.println(Arrays.toString(received));
    }
}
