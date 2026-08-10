package day1;

public class SingleNumber {
    public static int single(int[] arr){
        int output = 0;
        for(int each:arr) output ^= each;
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 4};
        System.out.println(single(arr));
    }
}
