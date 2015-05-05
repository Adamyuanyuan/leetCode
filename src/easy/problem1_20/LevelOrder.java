package easy.problem1_20;

/**
 * Created by Adam on 2015/5/4.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LevelOrder {
    // not a reverse way
    public List<List<Integer>> levelOrderNoReverse(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null){
            return result;
        }

        LinkedList<TreeNode> queue1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> queue2 = new LinkedList<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        queue1.add(root);

        while(!queue1.isEmpty()){
            TreeNode currentNode = queue1.pollFirst();
            list.add(currentNode.val);

            if(currentNode.left != null){
                queue2.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue2.add(currentNode.right);
            }
            if(queue1.isEmpty()){
                queue1 = new LinkedList<TreeNode>(queue2);
                queue2.clear();
                result.add(list);
                list = new ArrayList<Integer>();
            }

        }
        return result;
    }

    // a reverse way
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
/*        if(root==null){
            return result;
        }*/
        leverMaker(result,root,0);
        return result;
    }

    private void leverMaker(List<List<Integer>> list,TreeNode node,int level){
        if(node!=null){
            if(level>list.size()-1){
                list.add(new ArrayList<Integer>());
            }
            list.get(level).add(node.val);
            if(node.left!=null){
                leverMaker(list, node.left, level + 1);
            }
            if(node.right!=null) {
                leverMaker(list, node.right, level + 1);
            }
        }
    }
}
