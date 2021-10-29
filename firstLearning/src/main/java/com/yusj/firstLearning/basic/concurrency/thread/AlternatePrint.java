package com.yusj.firstLearning.basic.concurrency.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AlternatePrint {

    private int state;
    private int time;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public AlternatePrint(int time){
        this.time = time;
    }

    private void printABC(String target,int targetNum){

        for(int i= 0;i<time;){
            lock.lock();

            if(state % 3 == targetNum){
                System.out.printf(target);
                i++;
                state++;
            }

            lock.unlock();
        }

    }

    private void printABC1(String target,int targetNum){
        for(int i= 0;i<time;) {
            lock.lock();

            while(state % 3 != targetNum){
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.printf(target);
            i++;
            state++;
            condition.signalAll();

            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        AlternatePrint alternatePrint = new AlternatePrint(10);

        Thread a = new Thread(() -> {
            alternatePrint.printABC1("A",0);
        },"A");

        Thread b = new Thread(() -> {
            alternatePrint.printABC1("B",1);
        });

        Thread c = new Thread(() -> {
            alternatePrint.printABC1("C",2);
        });

        a.start();
//        a.join();

        b.start();
//        b.join();

        c.start();
//        c.join();




    }
}
