package day6;

public class EditDistanceViaDP {
    public static int minDistance(String txt1, String txt2){
        int rSize = txt1.length(), cSize = txt2.length();
        int[][] grid = new int[rSize+1][cSize+1];
        for(int rIn=0;rIn<=rSize;rIn++) grid[rIn][0]=rIn;
        for(int cIn=0;cIn<=cSize;cIn++) grid[0][cIn]=cIn;
        for(int rIn=1;rIn<=rSize;rIn++){
            for(int cIn=1;cIn<=cSize;cIn++){
                if(txt1.charAt(rIn-1)==txt2.charAt(cIn-1))
                    grid[rIn][cIn]=grid[rIn-1][cIn-1];
                else{
                    grid[rIn][cIn] = 1 + Math.min(
                        grid[rIn-1][cIn-1],Math.min(
                            grid[rIn-1][cIn],
                            grid[rIn][cIn-1]
                        )
                    );
                }
            }
        }
        return grid[rSize][cSize];
    }
    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros"));
        System.out.println(minDistance("intention", "execution"));
    }
}