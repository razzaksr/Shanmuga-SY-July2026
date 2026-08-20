package day9;

import java.util.HashMap;
import java.util.Map;

public class BTFromInNPre {
    private static int preIndex = 0;
    private static Map<Integer, Integer> inMap = 
                    new HashMap<>();
    public static TreeNode helper(int[] preorder, 
                        int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int inRoot = inMap.get(rootVal);
        root.left = helper(preorder, inStart, inRoot - 1);
        root.right = helper(preorder, inRoot + 1, inEnd);
        return root;
    }
    public static TreeNode buildTree(int[] preorder,
                 int[] inorder) {
        for (int ind = 0; ind < inorder.length; ind++)
            inMap.put(inorder[ind], ind);
        return helper(preorder, 0, 
                        inorder.length - 1);
    }
    public static void main(String[] args) {
        int[] in = {3,9,10,20,15,11,7}, pre = {10,9,3,11,15,20,7};
        TreeNode root = buildTree(pre, in);
        System.out.println(BTFromArrayNINOrder.inorderTraversal(root));
    }
}
