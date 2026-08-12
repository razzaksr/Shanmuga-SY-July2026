package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumViaGreedy {
    public static List<List<Integer>> sum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int ind = 0; ind < arr.length - 2; ind++) {
            if (ind > 0 && arr[ind] == arr[ind - 1]) continue;
            int start = ind + 1, end = arr.length - 1;
            while (start < end) {
                int sum = arr[ind] + arr[start] + arr[end];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[ind],
                             arr[start], arr[end]));
                    start++;end--;
                    while (start < end && 
                        arr[start] == arr[start - 1]) start++;  
                    while (start < end &&
                         arr[end] == arr[end + 1]) end--; 
                } else if (sum < 0) start++;
                else end--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(sum(new int[]{0, 0, 0}));
    }
}


