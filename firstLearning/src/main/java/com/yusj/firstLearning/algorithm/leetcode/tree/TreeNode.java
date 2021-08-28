package com.yusj.firstLearning.algorithm.leetcode.tree;

public class TreeNode {

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int val;
    public TreeNode left;
    public TreeNode right;

}
