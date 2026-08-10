package day1;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
    public static List<Integer> traverse(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int start=0, end = arr[0].length-1;
        int top = 0, bottom=arr.length-1;
        while(top<=bottom&&start<=end){
            for(int ind=start;ind<=end;ind++) 
                result.add(arr[top][ind]);
            top++;
            for(int ind=top;ind<=bottom;ind++)
                result.add(arr[ind][end]);
            end--;
            if(top<=bottom){
                for(int ind=end;ind>=start;ind--)
                    result.add(arr[bottom][ind]);
                bottom--;
            }
            if(start<=end){
                for(int ind=bottom;ind>=top;ind--)
                    result.add(arr[ind][start]);
                start++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(traverse(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(traverse(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}
