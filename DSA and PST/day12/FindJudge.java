package day12;

public class FindJudge {
    public static int find(int size,int[][] trust){
        int[] in = new int[size+1];
        int[] out = new int[size+1];
        for(int[] each:trust){
            out[each[0]]++;in[each[1]]++;
        }
        for(int it=1;it<=size;it++)
            if(in[it]==size-1&&out[it]==0) return it;
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(find(2,new int[][]{{1,2}}));
        System.out.println(find(3,new int[][]{{1,3},{2,3}}));
        System.out.println(find(3,new int[][]{{1,3},{2,3},{3,1}}));
        System.out.println(find(3,new int[][]{{1,3},{2,3},{2,1}}));
    }
}
