package easy.problem1_20;

/**
 * Created by Adam on 2015/4/30.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LevelOrderBottom {
    //mothod of BFS of tree
    public List<List<Integer>> levelOrderBottomBFS(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null){
            return result;
        }
        LinkedList<TreeNode> queue1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> queue2 = new LinkedList<TreeNode>();
        List<Integer> eachList = new ArrayList<Integer>();

        queue1.add(root);
        while(!queue1.isEmpty()){
            TreeNode node = queue1.pollFirst();
            eachList.add(node.val);
            if(node.left!=null){
                queue2.add(node.left);
            }
            if(node.right!=null){
                queue2.add(node.right);
            }
            if(queue1.isEmpty()){
                queue1 = new LinkedList<TreeNode>(queue2);
                queue2.clear();
                List<Integer> thisLayerList = new ArrayList<Integer>(eachList);
                result.add(0,thisLayerList);
                eachList.clear();
            }
        }
        return result;
    }

    //mothod of reverse of tree
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        levelMaker(result,root,0);
        return result;


    }

    public void levelMaker(List<List<Integer>> list, TreeNode node, int level){
        if(node==null){
            return;
        }
        if(level > list.size()-1){
            list.add(0,new LinkedList<Integer>());
        }
        levelMaker(list,node.left,level+1);
        levelMaker(list,node.right,level+1);
        list.get(list.size()-level-1).add(node.val);

    }
}
