package medium.problem1_20;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Adam on 2015/5/18.
 */
public class BinaryTreePreorderTraversal {
    //recursive way
    public List<Integer> preorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root!=null){
            result.add(root.val);
            List<Integer> left = preorderTraversal(root.left);
            List<Integer> right = preorderTraversal(root.right);
            result.addAll(left);
            result.addAll(right);
        }
        return result;
    }


    //iterative way
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null){
            return result;
        }
        TreeNode pointer = root;
        Stack<TreeNode> tStack = new Stack<TreeNode>();
        while(pointer !=null || !tStack.isEmpty()){
            if(pointer!=null){
                result.add(pointer.val);
                tStack.push(pointer);
                pointer = pointer.left;
            }else if(!tStack.isEmpty()){
                pointer = tStack.pop();
                pointer = pointer.right;
            }

        }
        return result;
    }
}
