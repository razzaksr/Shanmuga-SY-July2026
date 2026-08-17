package day6;

public class LCSViaDP {
    public static int commonSub(String txt1, String txt2){
        int rSize = txt1.length(), cSize = txt2.length();
        int[][] grid = new int[rSize+1][cSize+1];
        for(int row=1;row<=rSize;row++){
            for(int col=1;col<=cSize;col++){
                if(txt1.charAt(row-1)==txt2.charAt(col-1))
                    grid[row][col] = grid[row-1][col-1]+1;
                else{
                    grid[row][col] = Math.max(
                        grid[row-1][col],grid[row][col-1]
                        );
                    }
            }
        }
        return grid[rSize][cSize];
    }
    public static void main(String[] args) {
        System.out.println(commonSub("abcde", "ace"));
        System.out.println(commonSub("abc", "abc"));
        System.out.println(commonSub("abc", "def"));
    }
}
