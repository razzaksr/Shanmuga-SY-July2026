package day6;

import java.util.Arrays;

public class SetMatrixZero {
    public static void sets(int[][] arr){
        int rSize=arr.length, cSize = arr[0].length;
        boolean[] rowB=new boolean[rSize];
        boolean[] colB = new boolean[cSize];
        for(int row=0;row<rSize;row++){
            for(int col=0;col<cSize;col++){
                if(arr[row][col]==0)
                {rowB[row]=true;colB[col]=true;}
            }
        }
        for(int row=0;row<rSize;row++){
            for(int col=0;col<cSize;col++){
                if(rowB[row]||colB[col])
                    arr[row][col]=0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] test1 = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int[][] test2 = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        sets(test1);sets(test2);
        for(int[] each:test1) 
            System.out.println(Arrays.toString(each));
        for(int[] each:test2) 
            System.out.println(Arrays.toString(each));
    }
}
