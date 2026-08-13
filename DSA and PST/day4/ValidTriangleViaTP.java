package day4;

import java.util.Arrays;

// side1+side2>side3  is valid triangle
public class ValidTriangleViaTP {
    public static int valid(int[] arr){
        int count=0, size=arr.length;
        Arrays.sort(arr);
        for(int n1=0;n1<size;n1++){
            int n2 = 0, n3 = n1-1;
            while(n2<n3){
                if(arr[n2]+arr[n3]>arr[n1]){
                    count+=n3-n2;
                    n3--;
                }else n2++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(valid(new int[]{4,2,3,4}));
        System.out.println(valid(new int[]{4,2,3,2}));
        System.out.println(valid(new int[]{9,5,7,2}));
    }
}
