package easy.problem1_20;

/**
 * Created by Adam on 2015/5/5.
 */

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SymmetricTree {
    // recursive solutions
    public boolean isSymmetricRecursive(TreeNode root) {
        return root==null || isSymmetricChildren(root.left,root.right);
    }

    private boolean isSymmetricChildren(TreeNode leftNode,TreeNode rightNode){
        if(leftNode==null || rightNode==null){
            return leftNode==rightNode;
        }
        if(leftNode.val!=rightNode.val){
            return false;
        }else{
            return isSymmetricChildren(leftNode.left,rightNode.right) && isSymmetricChildren(leftNode.right,rightNode.left);
        }
    }


    //iteratively solutions
    public boolean isSymmetric(TreeNode root) {
        if(root==null || root.left==null&&root.right==null){
            return true;
        }else if(root.left==null || root.right==null){
            return false;
        }

        LinkedList<TreeNode> stackOfTreeNode = new LinkedList<TreeNode>();
        stackOfTreeNode.push(root.left);
        stackOfTreeNode.push(root.right);
        TreeNode left,right;
        while(!stackOfTreeNode.isEmpty()){
            if(stackOfTreeNode.size()%2 != 0){
                return false;
            }
            left = stackOfTreeNode.pop();
            right = stackOfTreeNode.pop();

            if(left.val != right.val){
                return false;
            }

            if(left.left!=null){
                if(right.right==null){
                    return false;
                }
                stackOfTreeNode.push(left.left);
                stackOfTreeNode.push(right.right);
            }else if(right.right!=null){
                return false;
            }

            if(left.right!=null){
                if(right.left==null){
                    return false;
                }
                stackOfTreeNode.push(left.right);
                stackOfTreeNode.push(right.left);
            }else if(right.left!=null){
                return false;
            }
        }
        return true;
    }
}






















