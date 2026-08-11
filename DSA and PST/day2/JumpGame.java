package day2;

public class JumpGame {
    public static boolean reach(int[] arr){
        int jump=0;
        for(int index=0;index<arr.length;index++){
            if(index>jump) return false;
            jump=Math.max(jump,index+arr[index]);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(reach(new int[]{2,3,1,1,4}));
        System.out.println(reach(new int[]{3,2,1,0,4}));
    }
}
