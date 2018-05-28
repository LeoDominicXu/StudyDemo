package com.xuzc.study.distributed.lock;

/**
 * @Description: The description of the file.
 * @Author: Dominic
 * @Date: 2017/2/13
 */
public class TestCurrentZk {
    public static void main(String[] args) throws Exception {
        Thread threads[] = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    DistributedLock clientTest = new DistributedLock(
                            "10.1.200.39:2181", "locknametest");
                    clientTest.getLocks();
                }
            });

            threads[i].start();
            Thread.sleep(Integer.MAX_VALUE);
        }

    }
}
