package day11;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public static boolean dfs(List<List<Integer>> grid,
                        int[] visited,int current){
        visited[current]=1;
        for(int nei:grid.get(current)){
            if(visited[nei]==1) return true;// cycle detected
            if(visited[nei]==0&&dfs(grid,visited,nei))
                return true;
        }
        visited[current]=2;
        return false;// no cylce
    }
    public static boolean canFinish(int num, int[][] mat){
        List<List<Integer>> grid=new ArrayList<>();
        for(int ind=0;ind<num;ind++)
            grid.add(new ArrayList<>());
        for(int[] pre: mat)
            grid.get(pre[1]).add(pre[0]);
        int[] visited = new int[num];
        for(int ind=0;ind<num;ind++)
            if(visited[ind]==0&&dfs(grid,visited,ind))
                return false;
        return true;
    }
    public static void main(String[] args) {
        int[][] mat1 = {
            {1,0},{2,1},{0,2}
        };
        System.out.println(canFinish(3,mat1));
        int[][] mat2 = {
            {1,0},{1,0},{2,1}
        };
        System.out.println(canFinish(3,mat2));
        int[][] mat3 = {
            {1,0}
        };
        System.out.println(canFinish(2,mat3));
    }
}
