package com.yusj.firstLearning.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层序遍历
 */
public class LevelOrderTraversal {

    public static List<List<Integer>> levelorderTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        //先将根节点放入队列
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> curResult = new ArrayList<>();
            //遍历队列，把当前层的元素从队列中取出，将下一层放入队列
            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                curResult.add(node.val);
                if (node.left != null){
                    //把当前节点的左儿子放入队列
                    queue.add(node.left);
                }
                if (node.right != null){
                    //把当前节点的右儿子放入队列
                    queue.add(node.right);
                }
            }
            result.add(curResult);
        }

        return result;
    }
}
