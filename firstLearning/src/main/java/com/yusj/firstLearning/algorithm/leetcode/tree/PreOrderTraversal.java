package com.yusj.firstLearning.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 前序遍历
 */
public class PreOrderTraversal {

    /**
     * 循环写法
     * @param root
     * @return
     */
    public static List<Integer> preorderInteration(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        TreeNode cur;
        while (!stack.isEmpty()){
            cur = stack.pop();
            list.add(cur.val);
            if(cur.right != null){
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
        return list;
    }


    /**
     * 迭代写法
     * @param root
     * @return
     */
    public static List<Integer> preorderRecursion(TreeNode root){
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }

    public static void preorder(TreeNode node,List<Integer> list){
        if (node == null){
            return;
        }
        list.add(node.val);
        preorder(node.left,list);
        preorder(node.right,list);
    }
}
