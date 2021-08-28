package com.yusj.firstLearning.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
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
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.right == null || root.right == pre){
                list.add(root.val);
                pre = root;
                root = null;
            }else{
                stack.push(root);
                root = root.right;
            }

        }

        return list;
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
