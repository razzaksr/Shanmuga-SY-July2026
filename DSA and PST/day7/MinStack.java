package day7;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    public MinStack(){
        mainStack = new Stack<>();minStack = new Stack<>();
    }
    public void push(int value){
        mainStack.push(value);
        if(minStack.isEmpty()||value<=minStack.peek())
            minStack.push(value);
    }
    public void pop(){
        int popped = mainStack.pop();
        if(popped == minStack.peek()) minStack.pop();
    }
    public int top(){return mainStack.peek();}
    public int getMin(){return minStack.peek();}
    public static void main(String[] args) {
        MinStack stk = new MinStack();
        stk.push(4);stk.push(-9);
        stk.push(0);stk.push(-9);
        stk.push(-9);stk.push(2);
        stk.push(-5);stk.push(-5);
        stk.push(-5);stk.push(10);
        stk.push(-5);stk.push(-2);stk.push(-3);
        stk.push(8);stk.push(-3);stk.push(-3);
        stk.push(-3);stk.push(5);stk.push(5);
        System.out.println(stk.getMin());
        System.out.println(stk.top());
    }
}

