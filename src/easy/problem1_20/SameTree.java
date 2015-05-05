package easy.problem1_20;

/**
 * Created by Adam on 2015/5/5.
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
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

/*      also can change codes to this way:
        if(p==null || q==null){
            return p==q;
        }
*/

        if(p==null && q==null){
            return true;
        }else if(p==null || q==null){
            return false;
        }else{
            if(p.val!=q.val){
                return false;
            }else{
                return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
            }
        }
    }
}
