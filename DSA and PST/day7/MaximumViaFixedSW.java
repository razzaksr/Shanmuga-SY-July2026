package day7;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaximumViaFixedSW {
    public static int[] maxi(int[] arr, int win){
        int size = arr.length, trav=0;
        int[] res = new int [size-win+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int ind=0;ind<size;ind++){
            while(!dq.isEmpty()&&dq.peekFirst()<=ind-win)
                dq.pollFirst();
            while(!dq.isEmpty()&&
                            arr[dq.peekLast()]<arr[ind])
                dq.pollLast();
            dq.offer(ind);
            if(ind>=win-1) 
                {res[trav] = arr[dq.peekFirst()];trav++; }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] receive = maxi(new int[]{2,1,4,5,3,4,1,2}, 4);
        System.out.println(Arrays.toString(receive));
        receive = maxi(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        System.out.println(Arrays.toString(receive));
    }
}
