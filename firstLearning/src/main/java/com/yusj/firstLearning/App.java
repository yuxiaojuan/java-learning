package com.yusj.firstLearning;

import com.yusj.firstLearning.basic.concurrency.thread.MyRunnable;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String a = "abc";
        String b = "abc";
        String c = "a" + "bc";
        String d = "a" + "b" +"c";
        String e = "ab" + "c";
        String f = new String("abc");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a == e);
        System.out.println(c == d);
        System.out.println(c == e);
        System.out.println(d == e);
        System.out.println(a == f);

        Map<String,String> map = new HashMap<String, String>();
        map.put("a","b");


      }

}
