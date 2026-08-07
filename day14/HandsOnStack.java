package day14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/*
List: clear, isEmpty
Stack: 
    push, pop, peek, search, 
*/

public class HandsOnStack {
    public static void main(String[] args) {
        Stack<double[]> stk = new Stack<>();
        stk.push(new double[]{6.7,9.2});
        stk.push(new double[]{12.7,8.8,3.4,2.6});
        stk.push(new double[]{9.2,4.7,12.3});
        Iterator<double[]> it = stk.iterator();
        while (it.hasNext()) System.out.println(Arrays.toString(it.next()));
        stk.clear(); System.out.println(stk.size());
        System.out.println(stk.isEmpty());
        Stack<Integer> intStk = new Stack<>();
        intStk.push(12);intStk.push(98);intStk.push(47);
        intStk.push(12);intStk.push(67);intStk.push(89);
        System.out.println(intStk); System.out.println(intStk.search(98));
        System.out.println(intStk.pop());
        System.out.println(intStk.peek());
    }
}
