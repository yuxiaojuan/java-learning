package com.yusj.firstLearning.algorithm;

/**
 * 最长回文子串
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abace";
        System.out.println(s.substring(0,2));
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        char[] strArray = s.toCharArray();
        String result = new String();
        for(int i = 0;i < strArray.length ;i++){
            String res1 = palindrome(strArray,i,i);
            String res2 = palindrome(strArray,i,i+1);
            result = result.length() > res1.length() ? result : res1;
            result = result.length() > res2.length() ? result : res2;
        }
        return result;
    }

    public static String palindrome(char[] array,int i,int j){

        while(i>=0 && j<array.length && array[i] == array[j]){
            i--;
            j++;
        }

        return new String(array,i+1,j-i-1);

    }
}
