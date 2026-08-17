package day6;

public class UniquePathViaDP {
    // tabular
    public static int unique(int row, int col){
        int[][] grid = new int[row][col];
        for(int ind=0;ind<row;ind++) grid[ind][0]=1;
        for(int ind=0;ind<col;ind++) grid[0][ind]=1;
        for(int rIn=1;rIn<row;rIn++){
            for(int cIn=1;cIn<col;cIn++){
                grid[rIn][cIn] = grid[rIn][cIn-1]+
                                        grid[rIn-1][cIn];
            }
        }
        return grid[row-1][col-1];
    }
    public static void main(String[] args) {
        System.out.println(unique(3, 7));
        System.out.println(unique(3, 2));

    }
}
