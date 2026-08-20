package day9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ZigZagLevelOrderTraversalBT {
    public static List<List<Integer>> zigzag(TreeNode root){
        List<List<Integer>> items = new ArrayList<>();
        if(root==null) return items;
        Deque<TreeNode> oq = new ArrayDeque<>();
        oq.offer(root); boolean l2r=true; int size=0;
        while(!oq.isEmpty()){
            size = oq.size();
            Deque<Integer> lq = new ArrayDeque<>();
            for(int ind=0;ind<size;ind++){
                TreeNode cur = oq.poll();
                if(l2r) lq.offer(cur.val);
                else lq.offerFirst(cur.val);
                if(cur.left!=null) oq.offer(cur.left);
                if(cur.right!=null) oq.offer(cur.right);
            }
            items.add(new ArrayList<>(lq));
            l2r=!l2r;
        }
        return items;
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
        System.out.println(zigzag(root));
    }
}
