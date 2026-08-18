package day7;

import java.util.Stack;

public class EvaluateRPNViaStack {
    public static int evaluate(String[] arr){
        Stack<Integer> stk = new Stack<>();
        int v1=0,v2=0;
        for(String each:arr){
            switch(each){
                case "+":
                    v1 = stk.pop();v2=stk.pop();
                    stk.push(v1+v2);
                    break;
                case "-":
                    v1 = stk.pop();v2=stk.pop();
                    stk.push(v2-v1);
                    break;
                case "*":
                    v1 = stk.pop();v2=stk.pop();
                    stk.push(v2*v1);
                    break;
                case "/":
                    v1 = stk.pop();v2=stk.pop();
                    stk.push(v2/v1);
                    break;
                default: stk.push(Integer.parseInt(each));
            }
        }
        return stk.peek();
    }
    public static void main(String[] args) {
        System.out.println(evaluate(new String[]{"2","1","+","3","*"}));
        System.out.println(evaluate(new String[]{"4","13","5","/","+"}));
    }
}
