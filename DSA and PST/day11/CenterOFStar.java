package day11;

public class CenterOFStar {
    public static int find(int[][] grid){
        if(grid[0][0]==grid[1][0]||grid[0][0]==grid[1][1])
            return grid[0][0];
        else return grid[0][1];
    }
    public static void main(String[] args) {
        System.out.println(find(new int[][]{{1,2},{2,2}}));
        System.out.println(find(new int[][]{{1,2},{1,1}}));
    }
}
