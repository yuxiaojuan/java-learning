package com.yusj.firstLearning.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 后续遍历
 */
public class PostOrderTraversal {
    /**
     * 循环写法
     * @param root
     * @return
     */
    public static List<Integer> postorderInteration(TreeNode root) {

    }

    /**
     * 迭代写法
     * @param root
     * @return
     */
    public static List<Integer> postorderRecursion(TreeNode root){
        List<Integer> list = new ArrayList<>();
        portorder(root,list);
        return list;
    }

    public static void portorder(TreeNode node,List<Integer> list){
        if (node == null){
            return;
        }
        portorder(node.left,list);
        portorder(node.right,list);
        list.add(node.val);
    }
}
