package com.yusj.firstLearning.algorithm.leetcode.offer;


import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> newNums = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if (!newNums.add(nums[i])){
                return nums[i];
            }
        }
        int[][] a = new int[2][3];
//        a.length;
        return -1;
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int y = matrix.length - 1;
        int x = matrix[0].length - 1;
        for(int i = 0;i<matrix[0].length - 2;i++){
            if(matrix[0][i] == target){
                return true;
            }else if(matrix[0][i] < target && matrix[0][i+1] > target){
                x = i;
            }
        }
        for(int j = 0;j<matrix.length-2;j++){
            if(matrix[j][x] == target){
                return true;
            }else if(matrix[j][x] < target && matrix[j+1][x] > target){
                y = j+1;
            }
        }
        for(int i = x;i>=0;i--){
            for(int j = y;j>=0;j--){
                if(matrix[i][j] == target){
                    return true;
                }
                // if(matrix[i][j] < target){

                // }
            }
        }
        return false;
    }

    public static void main(String[] args) {


    }
}
