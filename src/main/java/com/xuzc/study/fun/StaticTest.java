package com.xuzc.study.fun;

/**
 * Created by Stronger-pc on 2017/2/15.
 */
public class StaticTest {
    private static String data1;
    private final String data2;
    private int data3;
    static {
        System.out.println(data1);
    }
    public StaticTest(){
        data1 = "data1";
        data2 = "data2";
    }

    public static void main(String[] args) {
        //System.out.println(data1);
    }
}
