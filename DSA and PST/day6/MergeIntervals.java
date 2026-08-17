package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] combine(int[][] exists){
        Arrays.sort(exists,(r1,r2)->r1[0]-r2[0]);
        List<int[]> temp = new ArrayList<>();
        int[] prev = exists[0];
        for(int ind = 1;ind<exists.length;ind++){
            if(exists[ind][0]<=prev[1])
                prev[1]=Math.max(prev[1], exists[ind][1]);
            else{
                temp.add(prev);
                prev = exists[ind];
            }
        }
        temp.add(prev);
        return temp.toArray(new int[temp.size()][]);
    }
    public static void main(String[] args) {
        int[][] got = combine(new int[][]{
            {4,7},{1,4}
        });
        Arrays.stream(got).forEach(row->
            System.out.println(Arrays.toString(row)));
        got = combine(new int[][]{
            {1,3},{2,6},{8,10},{15,18}
        });
        Arrays.stream(got).forEach(row->
            System.out.println(Arrays.toString(row)));
    }
}
