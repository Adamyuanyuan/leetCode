package easy.problem1_20;

/**
 * Created by Adam on 2015/4/30.
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int result = calDepthOfTree(root,0);
        return result;
    }

    private int calDepthOfTree(TreeNode node, int level){
        if(node.left==null&&node.right==null){
            return level+1;
        }else if(node.right==null){
            return calDepthOfTree(node.left,level+1);

        }else if(node.left==null){
            return calDepthOfTree(node.right,level+1);
        }else{
            return Math.max(calDepthOfTree(node.left,level+1),calDepthOfTree(node.right,level+1));
        }
    }
}
