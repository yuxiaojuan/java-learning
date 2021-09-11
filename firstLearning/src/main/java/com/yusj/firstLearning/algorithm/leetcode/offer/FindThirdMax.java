package com.yusj.firstLearning.algorithm.leetcode.offer;

public class FindThirdMax {
    public static int thirdMax(int[] nums){
        long v1= Long.MIN_VALUE;
        long v2= Long.MIN_VALUE;
        long v3= Long.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if (v1 == nums[i] || v2 == nums[i] || v3 == nums[i]) continue;
            if(nums[i] > v1){
                v3 = v2;
                v2 = v1;
                v1 = nums[i];
            }else if(nums[i] > v2){
                v3 = v2;
                v2 = nums[i];
            }else if(nums[i] > v3){
                v3 = nums[i];
            }
        }
        if(v2 == Long.MIN_VALUE || v3 == Long.MIN_VALUE){
            return (int)v1;
        }
        return (int)v3;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,5,3,5};
        System.out.println(thirdMax(nums));
    }
}
