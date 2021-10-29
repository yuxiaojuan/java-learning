package com.yusj.firstLearning;

import java.util.HashMap;
import java.util.Map;

public class Application extends ClassLoader{
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        for(char c : t.toCharArray()) {
            if (need.get(c) != null) {
                need.put(c, need.get(c) + 1);
            } else {
                need.put(c, 1);
            }
        }

        int left = 0;
        int right = 0;
        int valid = 0;
        int len = Integer.MAX_VALUE;
        int start = 0;
        char[] sArray = s.toCharArray();
        while(right < sArray.length){

            char c = sArray[right];
            right++;

            if(need.get(c) != null){
                if (window.get(c) != null) {
                    window.put(c, window.get(c) + 1);
                } else {
                    window.put(c, 1);
                }

                if (need.get(c).equals(window.get(c))){
                    valid++;
                }
            }

            while(valid == need.size() && left <= right){
                if(right - left < len){
                    len = right - left;
                    start = left;
                }

                char leftChar = sArray[left];
                left++;
                if(window.get(leftChar) != null){
                    if(need.get(leftChar).equals(window.get(leftChar))){
                        valid--;
                    }

                    if(window.get(leftChar) == 1){
                        window.remove(leftChar);
                    }else{
                        window.put(leftChar,window.get(leftChar) - 1);
                    }
                }
            }

        }
        System.out.println(len == Integer.MAX_VALUE ? "hh" :s.substring(start,start + len));
    }
}
