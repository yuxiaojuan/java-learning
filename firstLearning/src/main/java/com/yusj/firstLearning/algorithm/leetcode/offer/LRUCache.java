package com.yusj.firstLearning.algorithm.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private int capacity;
    Map<Integer,ListNode> map;
    ListNode head;
    ListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new ListNode(-1,-1);
        tail = new ListNode(-1,-1);
        head.next = tail;
        tail.pre = head;
        tail.next = null;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        moveToHead(map.get(key));
        return map.get(key).value;
    }

    public void put(int key, int value) {
        if(get(key) != -1){
            map.get(key).value = value;
            return;
        }

        if(map.size() >= capacity){
            ListNode removeNode = tail.pre;
            tail.pre = removeNode.pre;
            removeNode.pre.next = tail;
            map.remove(removeNode.key);
        }
        ListNode addNode = new ListNode(key,value);
        map.put(key,addNode);
        addNode.next = head.next;
        addNode.pre = head;
        head.next.pre = addNode;
        head.next = addNode;

    }

    private void moveToHead(ListNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }

    private class ListNode{
        int key;
        int value;
        ListNode next;
        ListNode pre;
        ListNode(int key,int value){
            this.key = key;
            this.value = value;
            next = null;
            pre = null;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */