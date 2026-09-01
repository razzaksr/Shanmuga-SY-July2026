package day11;

public class NumberOfIslands {
    public static void dfs(char[][] map,int row, int col){
        int rSize = map.length, cSize = map[0].length;
        if(row<0||col<0||row>=rSize||col>=cSize
                                    ||map[row][col]=='0')
            return;
        map[row][col]='0';
        dfs(map,row+1,col);dfs(map,row-1,col);
        dfs(map,row,col+1);dfs(map,row,col-1);
    }
    public static int numIslands(char[][] mat){
        int rSize = mat.length, cSize = mat[0].length;
        int count=0;
        for(int row=0;row<rSize;row++)
            for(int col=0;col<cSize;col++)
                if(mat[row][col]=='1')
                    {count++;dfs(mat,row,col);}
        return count;
    }
    public static void main(String[] args) {
        char[][] map = {
                {'1','1','0','1','1'},
                {'1','1','0','1','1'},
                {'1','0','0','0','0'},
                {'1','0','0','1','0'}
        };
        System.out.println(numIslands(map));
    }
}
