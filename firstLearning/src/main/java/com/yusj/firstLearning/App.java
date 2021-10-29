package com.yusj.firstLearning;

import com.yusj.firstLearning.basic.concurrency.thread.MyRunnable;

import java.lang.reflect.Proxy;
import java.text.Collator;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = "a" + "bc";
        String d = "a" + "b" + "c";
        String e = "ab" + "c";
        String f = new String("abc");
        String g = "a";
        String h = "bc";
        String k = g + h;
        String l = g + "bc";
        String m = "a" + h;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a == e);
        System.out.println(c == d);
        System.out.println(c == e);
        System.out.println(d == e);
        System.out.println(a == f);
        System.out.println(a == k);
        System.out.println(a == l);
        System.out.println(a == m);

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.print(r.nextInt(1000) + " ");
        }
        System.out.println("next");
        Random r1 = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.print(r1.nextInt(1000) + " ");
        }
        System.out.println("next");
        Random r2 = new Random(10);
        for (int i = 0; i < 20; i++) {
            System.out.print(r2.nextInt(1000) + " ");
        }
        System.out.println("next");
        Random r3 = new Random(10);
        for (int i = 0; i < 20; i++) {
            System.out.print(r3.nextInt(1000) + " ");
        }

        Set<String> set = new TreeSet();
//        Arrays.sort();
//        Collections.sort();
//        PriorityBlockingQueue;
        Map<String, String> map = new LinkedHashMap();
        map.put("a", "b");
//        ThreadLocal<String> threadLocal = new ThreadLocal<>();
//        Map<String,String> map = new HashMap<String, String>();
//        map.put("a","b");

//        String a;
//        Collections.reverse();
//        char[] s = new char[];
//        StringBuilder test = new StringBuilder();
//        test.length()
        Queue<Integer> queue = new LinkedList<>();
        List<String> test = new ArrayList<>();
        test.add("1 ");
        test.add("2 ");
        test.add("3 ");
        test.add("4 ");
        System.out.println(test.toString());


    }

    private enum Test {
        INTS1;
    }

}
