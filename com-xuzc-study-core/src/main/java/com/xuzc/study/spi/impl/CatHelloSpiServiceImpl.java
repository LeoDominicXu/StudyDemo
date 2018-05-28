package com.xuzc.study.spi.impl;

import com.xuzc.study.spi.HelloSpiService;

public class CatHelloSpiServiceImpl implements HelloSpiService {
    public void sayHello() {
        System.out.println("喵！Hello World");
    }
}
