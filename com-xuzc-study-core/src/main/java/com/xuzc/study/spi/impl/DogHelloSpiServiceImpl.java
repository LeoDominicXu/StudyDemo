package com.xuzc.study.spi.impl;

import com.xuzc.study.spi.HelloSpiService;

public class DogHelloSpiServiceImpl implements HelloSpiService {
    public void sayHello() {
        System.out.println("汪！Hello World");
    }
}
