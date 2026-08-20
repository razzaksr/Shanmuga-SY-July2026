package day9;

public class TreeNode {
    int val;
    TreeNode left,right;
    public TreeNode(int data){
        val = data;left=null;right=null;
    }
    public TreeNode(int data, TreeNode lt,TreeNode rt){
        val=data;left=lt;right=rt;
    }
}
