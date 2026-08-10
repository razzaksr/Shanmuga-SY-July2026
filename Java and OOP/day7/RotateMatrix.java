package day7;

import java.util.Arrays;

public class RotateMatrix {
    public static void rotation(int[][] mat){
        int size = mat.length;
        for(int row=0;row<size;row++){
            for(int col=row+1;col<size;col++){
                mat[row][col]^=mat[col][row];
                mat[col][row]^=mat[row][col];
                mat[row][col]^=mat[col][row];
            }
        }
        for(int row=0;row<size;row++){
            int start=0, end = size-1;
            while(start<end){
                mat[row][start]^=mat[row][end];
                mat[row][end]^=mat[row][start];
                mat[row][start]^=mat[row][end];
                start++;end--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] image1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int[][] image2 = {
            {5,1,9,11},
            {2,4,8,10},
            {13,3,6,7},
            {15,14,12,16}
        };
        rotation(image1);
        rotation(image2);
        for(int[] row:image1) 
            System.out.println(Arrays.toString(row));
        for(int[] row:image2) 
            System.out.println(Arrays.toString(row));
    }
}
