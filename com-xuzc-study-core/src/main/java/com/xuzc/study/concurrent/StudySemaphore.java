package com.xuzc.study.concurrent;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Auther: Dominic
 * @Date: 2019/4/19 16:02
 * @Description:
 */
public class StudySemaphore {
    private static final Semaphore semaphore = new Semaphore(5);
    public static void main(String[] args) {
        // 线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //信号量，只允许 5个线程同时访问


        //模拟客户端请求
        for (int i=0;i<20;i++){
            final long num = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        //获取许可
                        if (semaphore.tryAcquire()) {
                            System.out.println("Accessing: " + num);
                            //模拟执行时间
                            Thread.sleep(new Random().nextInt(10000));
                            //释放
                            semaphore.release();
                            //打印释放
                            System.out.println("Release...");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        try {
            Thread.sleep(10);
            System.out.println("执行完毕！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //退出线程池
        executorService.shutdown();
    }
}
