package easy.problem1_20;

/**
 * Created by Adam on 2015/4/29.
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BalanceBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(depthOfTree(root,0)!= Integer.MAX_VALUE){
            return true;
        }else{
            return false;
        }


    }
    private int depthOfTree(TreeNode root,int depth){
        if(root==null){
            return depth;
        }
        if(depth==Integer.MAX_VALUE){
            return depth;
        }

        int lDepth = depthOfTree(root.left,depth+1);
        int rDepth = depthOfTree(root.right,depth+1);
        if(Math.abs(lDepth-rDepth)>1){
            return Integer.MAX_VALUE;
        }else{
            return Math.max(lDepth,rDepth);
        }
    }
}
