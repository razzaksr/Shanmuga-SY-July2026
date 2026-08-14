package day5;

import java.util.Arrays;

public class MagnetForcesViaDC {
    public static boolean place(int[] pos,int no, int ran){
        int count=1, visited = pos[0];
        for(int ind=1;ind<pos.length;ind++){
            if(pos[ind]-visited>=ran){
                count++; visited = pos[ind];
                if(count>=no) return true;
            }
        }
        return false;
    }
    public static int maxDist(int[] pos, int no){
        Arrays.sort(pos);
        int start=1, end = pos[pos.length-1]-pos[0],ans=0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(place(pos, no, mid)){
                ans = mid;
                start=mid+1;
            }else end = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxDist(new int[]{1,2,3,4,7}, 3));
    }
}
