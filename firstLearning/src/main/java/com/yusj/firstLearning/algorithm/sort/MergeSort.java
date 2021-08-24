package com.yusj.firstLearning.algorithm.sort;


public class MergeSort {

    public static void mergeSort(int[] array,int start,int end){
        if (start == end){
            return;
        }
        int mid = start + (end - start)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid + 1,end);
        merge(array,start,mid,end);
    }

    public static void merge(int[] array,int l,int mid,int r){
        int[] tmp = new int[r-l+1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        while(p1 <= mid && p2 <= r){
            tmp[i++] = array[p1] < array[p2] ? array[p1++] : array[p2++];
        }
        while (p1 <= mid){
            tmp[i++] = array[p1++];
        }
        while (p2 <= r){
            tmp[i++] = array[p2++];
        }
        for (int j=0;j<tmp.length;j++){
            array[l + j] = tmp[j];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,5,7,3,6,1};
        mergeSort(array,0,array.length - 1);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
