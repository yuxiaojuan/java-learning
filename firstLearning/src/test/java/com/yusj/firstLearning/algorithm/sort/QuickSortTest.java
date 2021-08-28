package com.yusj.firstLearning.algorithm.sort;


import com.yusj.firstLearning.algorithm.sort.quick_sort.QuickSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortTest {


    @Test
    public void testQuickTest(){
        List<int[]> inputs = new ArrayList<int[]>();
        inputs.add(new int[]{1,5,8,3,7});
        inputs.add(new int[]{3,7,2,9,1});
        inputs.add(new int[]{8,5,0,3,6});
        inputs.add(new int[]{11,67,0,35,2});
        for (int[] input : inputs){
            QuickSort.sort(input,0,input.length - 1);
            System.out.println(Arrays.toString(input));
        }
    }
}
