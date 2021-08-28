package com.yusj.firstLearning.algorithm.sort.quick_sort;

import java.util.Arrays;

/**
 * 快速排序
 * 使用了分治法，在每一轮挑选一个基准元素，并让其他比它大的元素移动到数列一边，比它小的元素移动到数列的另一边，从而把数列拆解成了两个部分
 */
public class QuickSort {

    public static void main(String[] args) {
        System.out.println("Quick Sort.");
        int[] list = {2,4,6,3,1,5,8,23,12,7,9};
        sort(list,0,list.length - 1);
        System.out.println(Arrays.toString(list));
    }

    public static void sort(int[] list,int start,int end){
        if (start >= end) return;
        int j = partition(list,start,end);
        sort(list,start,j - 1);
        sort(list,j+1,end);
    }

    public static int partition(int[] list,int start,int end){
        int result = list[start];
        int i = start;
        int j = end + 1;
        while(i < j){
            while (list[++i] < result){
                 if (i == end) break;
            }
            while (list[--j] > result){
                if (j == start) break;
            }
            if(i < j){
                swap(list,i,j);
            }
        }
        swap(list,start,j);
        return j;
    }

    private static void swap(int[] list,int a,int b){
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }
}
