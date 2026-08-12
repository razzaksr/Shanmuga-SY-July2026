package day3;

import java.util.Arrays;

public class SortColorsViaDutchTP {
    // two pointers
    public static void flag(int[] arr){
        int zero=0, cur=0, two=arr.length-1;
        while(cur<=two){
            if(arr[cur]==2){
                int temp = arr[cur];
                arr[cur]=arr[two];
                arr[two]=temp;
                two--;
            }
            else if(arr[cur]==0){
                int temp = arr[cur];
                arr[cur]=arr[zero];
                arr[zero]=temp;
                zero++;cur++;
            }else cur++;
        }
    }
    public static void main(String[] args) {
        int[] case1 = {2,0,2,1,1,0};
        int[] case2 = {2,0,1};
        int[] case3 = {2,0,1,2,0,1,2,0,1};
        flag(case1);
        System.out.println(Arrays.toString(case1));
        flag(case2);
        System.out.println(Arrays.toString(case2));
        flag(case3);
        System.out.println(Arrays.toString(case3));
    }    
}
