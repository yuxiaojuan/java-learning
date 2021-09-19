package com.yusj.firstLearning.basic.concurrency.aqs;


import java.util.concurrent.CountDownLatch;

public class CountDownLatchTask {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(6);
        for(int i=0;i<6;i++){
            new Thread(()->{
                try {
                    System.out.println("子线程" + Thread.currentThread().getName()
                            + "正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程" + Thread.currentThread().getName()
                            + "执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        try {
            System.out.println("等待子线程执行完毕...");
            latch.await();
            System.out.println("子线程已经执行完毕");
            System.out.println("继续执行主线程");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
