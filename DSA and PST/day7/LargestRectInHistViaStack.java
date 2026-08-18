package day7;

import java.util.Stack;

public class LargestRectInHistViaStack {
    public static int findLarge(int[] arr){
        int mArea = 0, size = arr.length, ht=0,wd=0;
        Stack<Integer> stk = new Stack<>();
        for(int ind=0;ind<=size;ind++){
            int curHt = (ind==size)?0:arr[ind];
            while(!stk.isEmpty()&&curHt<arr[stk.peek()]){
                ht = arr[stk.pop()];
                wd = (stk.isEmpty())?ind:ind-stk.peek()-1;
                mArea = Math.max(mArea, ht*wd);
            }
            stk.push(ind);
        }
        return mArea;
    }
    public static void main(String[] args) {
        System.out.println(findLarge(new int[]{3,6,5,7,4,8,1,0}));
        System.out.println(findLarge(new int[]{2,1,5,6,2,3}));
    }
}
