package day3;

public class TrappingWater {
    public static int save(int[] arr){
        int start=0, end = arr.length-1, lMax=0, rMax=0;
        int count=0;
        while(start<end){
            if(arr[start]<arr[end]){
                if(lMax<arr[start]) lMax=arr[start];
                count+=lMax-arr[start];
                start++;
            }else{
                if(rMax<arr[end]) rMax=arr[end];
                count+=rMax-arr[end];
                end--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(save(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(save(new int[]{4,2,0,3,2,5}));
    }
}
