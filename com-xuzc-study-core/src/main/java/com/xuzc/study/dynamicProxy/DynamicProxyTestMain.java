package com.xuzc.study.dynamicProxy;

/**
 * Created by Stronger-pc on 2016/12/6.
 */
public class DynamicProxyTestMain {
    public static void main(String[] args) {
        Cat xiaohei = new XiaoHeiCat();
        Dog xiaohuang = new XiaoHuangDog();
        ProxyCore proxy = new ProxyCore();
        Cat xiaohei1 = (Cat)proxy.bind(xiaohei);
        xiaohei1.eat();
        Dog xiaohuang1 = (Dog)proxy.bind(xiaohuang);
        xiaohuang1.search();
    }
}
