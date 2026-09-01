package day11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFillViaBFS {
    public static int[][] floodFill(int[][] grid, int sr,
                                int sc, int nColor){
        int ogColor = grid[sr][sc];
        if(ogColor==nColor) return grid;
        int  rSize = grid.length, cSize = grid[0].length;
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{sr,sc});
        while(!que.isEmpty()){
            int[] polled = que.poll();
            int pr = polled[0], pc = polled[1];
            if(pr<0||pc<0||pr>=rSize||pc>=cSize
                            ||grid[pr][pc]!=ogColor)
                continue;
            grid[pr][pc] = nColor;
            que.offer(new int[]{pr+1,pc});
            que.offer(new int[]{pr-1,pc});
            que.offer(new int[]{pr,pc+1});
            que.offer(new int[]{pr,pc-1});
        }
        return grid;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {3,3,2},{3,3,0},{1,0,3}
        };
        grid = floodFill(grid,1,0,0);
        for(int[] row:grid)
            System.out.println(Arrays.toString(row));
    }
}
