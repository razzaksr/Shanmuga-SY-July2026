package day7;

import java.util.Arrays;
import java.util.Stack;

public class TemperaturesViaStack {
    public static int[] find(int[] arr){
        int size = arr.length;
        int[] res = new int[size];
        Stack<Integer> stk = new Stack<>();
        for(int ind=0;ind<size;ind++){
            while(!stk.isEmpty()&&arr[ind]>arr[stk.peek()]){
                int pIn = stk.pop();
                res[pIn] = ind-pIn;
            }
            stk.push(ind);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] got = find(new int[]{89,62,70,58,47,47,46,76,100,70});
        System.out.println(Arrays.toString(got));
        got = find(new int[]{30,40,50,60});
        System.out.println(Arrays.toString(got));
    }
}
