package com.yusj.firstLearning.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历
 */
public class InOrderTraversal {

    /**
     * 循环写法
     * @param root
     * @return
     */
    public static List<Integer> inorderInteration(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }


    }

    /**
     * 迭代写法
     * @param root
     * @return
     */
    public static List<Integer> inorderRecursion(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    public static void inorder(TreeNode node,List<Integer> list){
        if (node == null){
            return;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
}
