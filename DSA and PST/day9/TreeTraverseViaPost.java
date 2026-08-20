package day9;

import java.util.ArrayList;
import java.util.List;

public class TreeTraverseViaPost {
    public static void depth(
                TreeNode cur, List<Integer> store){
        if(cur==null) return;
        depth(cur.left, store);
        depth(cur.right, store);
        store.add(cur.val);
    }
    public static List<Integer> postorderTraversal(
                    TreeNode root){
        List<Integer> items = new ArrayList<>();
        depth(root, items);
        return items;
    }
    public static void main(String[] args) {
        int[] arr = {59,63,84,28,32,77};
        TreeNode root = BTFromArrayNINOrder.construct(arr);
        System.out.println(postorderTraversal(root));
    }
}
