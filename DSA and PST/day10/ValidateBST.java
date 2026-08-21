package day10;

import day9.TreeNode;

public class ValidateBST {
    public static boolean isValidBST(TreeNode root){
        return verify(root, Long.MIN_VALUE,
             Long.MAX_VALUE);
    }
    public static boolean verify(TreeNode cur,long min,
                     long max){
        if(cur==null) return true;
        if(cur.val<=min||cur.val>=max) return false;
        return verify(cur.left, min, cur.val)&&
                verify(cur.right, cur.val, max);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        // root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        System.out.println(isValidBST(root));
    }
}
