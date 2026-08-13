package day4;

public class TrapMaxVolumeViaTP {
    public static int water(int[] hts){
        int start=0, end = hts.length-1, mArea=0;
        while(start<end){
            int ht = Math.min(hts[start], hts[end]);
            int wd = end - start;
            mArea = Math.max(mArea,(ht*wd));
            if(hts[start]<hts[end]) start++;
            else end--;
        }
        return mArea;
    }
    public static void main(String[] args) {
        System.out.println(water(new int[]{7,10,6,2,5,4,8,3,7}));
        System.out.println(water(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
