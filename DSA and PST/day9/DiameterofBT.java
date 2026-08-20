package day9;

public class DiameterofBT {
    public static int diameter;
    public static int findDia(TreeNode root){
        diameter = 0;
        findDepth(root);
        return diameter;
    }
    public static int findDepth(TreeNode cur){
        if(cur==null) return 0;
        int lDepth = findDepth(cur.left);
        int rDepth = findDepth(cur.right);
        diameter = Math.max(diameter, lDepth+rDepth);
        return 1+Math.max(lDepth, rDepth);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(7);
        root.left.left.left.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.left.right = new TreeNode(10);
        System.out.println(findDia(root));
    }
}
