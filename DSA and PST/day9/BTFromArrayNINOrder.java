package day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTFromArrayNINOrder {
    public static TreeNode construct(int[] arr){
        if(arr.length==0) return null;
        TreeNode root = new TreeNode(arr[0]);
        int size = arr.length, ind=1;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(ind<size&&!que.isEmpty()){
            TreeNode cur = que.poll();
            if(ind<size){
                cur.left = new TreeNode(arr[ind++]);
                que.offer(cur.left);
            }
            if(ind<size){
                cur.right = new TreeNode(arr[ind++]);
                que.offer(cur.right);
            }
        }
        return root;
    }
    public static void depth(
                TreeNode cur, List<Integer> store){
        if(cur==null) return;
        depth(cur.left, store);
        store.add(cur.val);
        depth(cur.right, store);
    }
    public static List<Integer> inorderTraversal(
                    TreeNode root){
        List<Integer> items = new ArrayList<>();
        depth(root, items);
        return items;
    }
    public static void main(String[] args) {
        int[] arr = {59,63,84,28,32,77};
        TreeNode root = construct(arr);
        System.out.println(inorderTraversal(root));
    }
}
