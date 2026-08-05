package day12;

import java.util.Arrays;

interface Perform{
    int shortList(int[] arr);
}
public class ExecuteLamda {
    public static void main(String[] args) {
        Perform pulse = (arr)->{
            return (int) Arrays.stream(arr)
                .filter(each->each>110||each<90).count();
        };
        int abnormal = pulse.shortList(
            new int[]{98,99,120,78,95,96,35});
        System.out.println(abnormal);
        Perform finance = (arr)->{
            int[] dates = Arrays.copyOfRange(arr, 0,10);
            return Arrays.stream(dates).sum()>40000?1:0;
        };
        int status = finance.shortList(new int[]{1,400,500,
            2000,1000,90,100,450,780,1200,400,200,10,500});
        System.out.println("Loan Status "+status);
    }
}
