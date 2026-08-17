package day6;

import java.util.Arrays;

public class NonOverlapIntervals {
    public static int erase(int[][] grid){
        Arrays.sort(grid,(r1,r2)->r1[1]-r2[1]);
        int count=0, prev=Integer.MIN_VALUE;
        for(int[] row:grid){
            int start = row[0], end = row[1];
            if(start<prev) count++;
            else prev= end;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(erase(new int[][]{
            {1,2},{2,3},{3,4},{1,3}
        }));
        System.out.println(erase(new int[][]{
            {1,100},{11,22},{1,11},{12,2}
        }));
    }
}
