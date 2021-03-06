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
public class MinimumDepthOfBTree {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }else if(root.left==null){
            return minDepth(root.right)+1;
        }else if(root.right==null){
            return minDepth(root.left)+1;
        }else{
            return Math.min(minDepth(root.left)+1,minDepth(root.right)+1);
        }
    }
}
