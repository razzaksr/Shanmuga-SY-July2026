package day5;

public class SearchIn2DViaDC {
    public static boolean search(int[][] grid, int target){
        int rSize = grid.length, cSize = grid[0].length;
        int start=0, end = rSize*cSize-1,mid=0;
        while(start<=end){
            mid = start+(end-start)/2;
            int row = mid/cSize;
            int col = mid%cSize;
            int value = grid[row][col];
            if(value==target) return true;
            else if(target>value) start=mid+1;
            else end = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        System.out.println(search(mat, 3));
        System.out.println(search(mat, 34));
        System.out.println(search(mat, 13));
    }
}
