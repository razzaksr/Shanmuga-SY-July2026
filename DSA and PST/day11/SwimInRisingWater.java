package day11;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SwimInRisingWater {
    public static int swim(int[][] grid){
        int size = grid.length;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            Comparator.comparingInt(arr->arr[0])
        );
        pq.offer(new int[]{grid[0][0],0,0});
        boolean[][] visited = new boolean[size][size];
        visited[0][0] = true;int result = 0;
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int ht = cur[0], r = cur[1], c = cur[2];
            result = Math.max(result,ht);
            if(r==size-1&&c==size-1) return result;
            for(int[] d:dir){
                int nr = r+d[0], nc=c+d[1];
                if(nr>=0&&nr<size&&nc>=0&&nc<size
                                &&!visited[nr][nc]){
                    visited[nr][nc] = true;
                    pq.offer(new int[]{grid[nr][nc],nr,nc});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {0,1,2,3,4},
            {24,23,22,21,5},
            {12,13,14,15,16},
            {11,17,18,19,20},
            {10,9,8,7,6}
        };
        System.out.println(swim(mat));
    }
}
