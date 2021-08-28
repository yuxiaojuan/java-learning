package com.yusj.firstLearning.algorithm;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array,int value){
        if (array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length -1;
        while(left <= right){
            int middle = (left + right) /2;
            if (array[middle] == value){
                return middle;
            }else if(array[middle] > value){
                right = middle - 1;
            }else if(array[middle] < value){
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,4,5,8,14,45};
        int result = binarySearch(array,5);
        System.out.printf("result:" + result);
        int[] newArray = Arrays.copyOf(array,array.length);
    }
}
