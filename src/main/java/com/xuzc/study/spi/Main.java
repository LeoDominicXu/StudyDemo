package com.xuzc.study.spi;

import com.sun.tools.javac.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<HelloSpiService> loaders = ServiceLoader.load(HelloSpiService.class);
        for (HelloSpiService helloSpiService : loaders) {
            helloSpiService.sayHello();
        }
    }
}
