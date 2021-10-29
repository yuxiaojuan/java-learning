package com.yusj.firstLearning.algorithm.leetcode.tree;

import org.checkerframework.checker.units.qual.A;
import scala.Int;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArrayToTree {
    public static void main(String[] args) {
        System.out.println("hello");

        Integer[] input = new Integer[]{1,2,3,null,null,4,5,null,6};
        TreeNode root = arrayToTreeNode(input);

        List<List<Integer>> list = LevelOrderTraversal.levelorderTraversal(root);
        System.out.println(list);
    }

    public static TreeNode arrayToTreeNode(Integer[] array){
        if(array.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        //加在最后
        queue.add(root);
        boolean isLeft = true;
        for(int i = 1; i < array.length; i++){
            //从头取数据，但是不删除
            TreeNode node = queue.peek();
            if(isLeft){
                if(array[i] != null){
                    node.left = new TreeNode(array[i]);
                    //加在最后
                    queue.offer(node.left);
                }
                isLeft = false;
            }else {
                if(array[i] != null){
                    node.right = new TreeNode(array[i]);
                    queue.offer(node.right);
                }
                //从头取数据，并删除队列中的这个数据
                queue.poll();
                isLeft = true;
            }
        }
        return root;
    }
}
