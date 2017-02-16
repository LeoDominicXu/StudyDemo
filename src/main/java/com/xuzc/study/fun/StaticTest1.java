package com.xuzc.study.fun;

/**
 * Created by Stronger-pc on 2017/2/15.
 */
public class StaticTest1 {
    public static void main(String[] args) {
        NullTest mynull = null;
        System.out.println(mynull.getInt());
    }
}
class NullTest{
    public static int getInt(){
        return 1;
    }
}