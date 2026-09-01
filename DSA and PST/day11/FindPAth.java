package day11;

import java.util.ArrayList;
import java.util.List;

public class FindPAth {
    public static boolean depth(List<List<Integer>> grid,
                int node, int dest, boolean[] visited)
    {
        if(node==dest) return true;
        visited[node]=true;
        for(int nei:grid.get(node)){
            if(!visited[nei]&&depth(grid,nei,dest,visited))
                return true;
        }
        return false;
    }
    public static boolean validPath(int n, int[][] mat, 
                    int src, int dest){
        List<List<Integer>> grid = new ArrayList<>();
        for(int ind=0;ind<n;ind++)
            grid.add(new ArrayList<>());
        for(int[] adj:mat){
            grid.get(adj[0]).add(adj[1]);
            grid.get(adj[1]).add(adj[0]);
        }
        boolean[] visited = new boolean[n];
        return depth(grid,src,dest,visited);
    }
    public static void main(String[] args) {
        int[][] mat={
            {5,3},{5,4},{4,2},{2,1},{1,0}
        };
        System.out.println(validPath(6,mat,5,0));
    }
}
