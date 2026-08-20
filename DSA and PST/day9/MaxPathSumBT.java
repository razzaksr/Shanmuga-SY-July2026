package day9;

public class MaxPathSumBT {
    public static int maxSum = Integer.MIN_VALUE;
    public static int find(TreeNode cur){
        if(cur==null) return 0;
        int lSum = Math.max(find(cur.left), 0);
        int rSum = Math.max(find(cur.right), 0);
        int cSum = cur.val+lSum+rSum;
        maxSum = Math.max(maxSum, cSum);
        return cur.val+Math.max(rSum, lSum);
    }
    public static int maxPathSum(TreeNode root){
        find(root);
        return maxSum;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxPathSum(root));
    }
}
