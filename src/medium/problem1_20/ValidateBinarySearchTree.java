package medium.problem1_20;


/**
 * Created by Adam on 2015/5/18.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
}

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidNodes(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean isValidNodes(TreeNode node,long min,long max){
        if(node==null){
            return true;
        }
        return min<node.val && max>node.val && isValidNodes(node.left,min,node.val)&&isValidNodes(node.right,node.val,max);
    }
}
