package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node{
    double data;
    Node left,right;
    public Node(double val)
        {data = val;left=null;right=null;}
    public Node(double val,Node lt,Node rt)
        {data=val;left = lt;right=rt;}
}
public class BuildingBT {
    public static List<Double> travInViaLoop(Node root){
        List<Double> items = new ArrayList<>();
        Stack<Node> stk = new Stack<>();
        Node cur = root;
        while(cur!=null||!stk.isEmpty()){
            // push left's
            while(cur!=null){
                stk.push(cur); cur = cur.left;
            }
            // pop left and add to list 
            cur = stk.pop();
            // then move towards right
            items.add(cur.data);
            cur=cur.right;
        }
        return items;
    }
    public static void main(String[] args) {
        Node c1 = new Node(2.5);
        Node c2 = new Node(9.2);
        Node c3 = new Node(5.6);
        Node c4 = new Node(25.1);
        c2.left = c4;
        c3.right = c2;
        Node root = new Node(10.2,c1,c3);
        System.out.println(travInViaLoop(root));
    }
}
