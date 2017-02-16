package com.xuzc.study.fun;

/**
 * Created by Stronger-pc on 2017/2/15.
 */
public class StaticTest2 {
    static {
        data1 = "data1";
        //System.out.println(data1);
    }
    private static String data1;
    public StaticTest2(){
        data1 = "data1";
    }

    public static void main(String[] args) {
        //System.out.println(data1);
    }
}
