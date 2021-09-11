package com.yusj.firstLearning.algorithm;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array,int target){
        if (array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length -1;
        while(left <= right){
            int middle = (left + right) /2;
            if (array[middle] == target){
                return middle;
            }else if(array[middle] > target){
                right = middle - 1;
            }else if(array[middle] < target){
                left = middle + 1;
            }
        }
        return -1;
    }

    public static int leftBound(int[] array,int target){
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int middle = left + (right - left)/2;
            if(array[middle] < target){
                left = middle + 1;
            }else if(array[middle] > target){
                right = middle - 1;
            }else if(array[middle] == target){
                right = middle - 1;
            }
        }
        if(left >= array.length || array[left] != target){
            return -1;
        }
        return left ;
    }

    public static int rightBound(int[] array,int target){
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int middle = left + (right - left)/2;
            if(array[middle] < target){
                left = middle + 1;
            }else if(array[middle] > target){
                right = middle - 1;
            }else if(array[middle] == target){
                left = middle + 1;
            }
        }
        if(right < 0 || array[right] != target){
            return -1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,4,5,5,5,5,8,14,45};
        int result = binarySearch(array,5);
        System.out.println("result: " + result);
        System.out.println("Left Round: " + leftBound(array,60));
        System.out.println("Right Round: " + rightBound(array,0));
    }
}
