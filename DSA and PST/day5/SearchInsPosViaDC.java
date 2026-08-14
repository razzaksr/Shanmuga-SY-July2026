package day5;

public class SearchInsPosViaDC {
    public static int findPos(int[] arr, int target){
        int start=0, end = arr.length-1, mid=0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]>target) end = mid-1;
            else start=mid+1;
        }
        return start;
    }
    public static void main(String[] args) {
        System.out.println(findPos(new int[]{1,3,5,6}, 2));
        System.out.println(findPos(new int[]{1,3,5,6}, 7));
        System.out.println(findPos(new int[]{1,3,5,6}, 5));
    }
}

