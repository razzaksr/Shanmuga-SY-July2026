package day10;

import java.util.ArrayList;
import java.util.List;

import day9.TreeNode;
import day9.TreeTraverseViaPre;

public class BalanceBST {
    public static List<Integer> items = new ArrayList<>();
    public static void inOrder(TreeNode node){
        if(node==null) return;
        inOrder(node.left);
        items.add(node.val);
        inOrder(node.right);
    }
    public static TreeNode build(int start, int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        TreeNode cur = new TreeNode(items.get(mid));
        cur.left = build(start, mid-1);
        cur.right = build(mid+1,end);
        return cur;
    }
    public static TreeNode balanceBST(TreeNode root){
        inOrder(root);
        return build(0, items.size()-1);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right=new TreeNode(4);
        TreeNode balanced = balanceBST(root);
        System.out.println(TreeTraverseViaPre.preorderTraversal(balanced));;
    }
}
