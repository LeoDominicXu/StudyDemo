package com.xuzc.study.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: The description of the file.
 * @Author: Dominic
 * @Date: 2017/2/13
 */
public class ThreadTest_1 {
    static int index;
    static AtomicInteger index1 = new AtomicInteger(0);
    static int index2;
    static{
        for (int i = 0; i < 10000; i++) {
            index2++;
        }
    }

    static class MyThread implements Runnable {
        public void run() {
            for (int i = 0; i < 10000; i++) {
                index++;
                index1.getAndIncrement();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread runner = new MyThread();
        Thread thread1 = new Thread(runner);
        Thread thread2 = new Thread(runner);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(index);
        System.out.println(index1);
        System.out.println(index2);
    }

}
