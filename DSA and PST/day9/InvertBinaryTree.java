package day9;

public class InvertBinaryTree {
    public static TreeNode invert(TreeNode cur){
        if(cur==null) return null;
        TreeNode third = cur.left;
        cur.left = cur.right;
        cur.right=third;
        invert(cur.left);
        invert(cur.right);
        return cur;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreeNode inverted = invert(root);
        System.out.println(TreeTraverseViaPre.preorderTraversal(inverted));
    }
}
