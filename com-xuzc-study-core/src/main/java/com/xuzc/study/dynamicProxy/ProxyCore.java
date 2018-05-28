package com.xuzc.study.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Stronger-pc on 2016/12/6.
 */
public class ProxyCore implements InvocationHandler{
    private Object object;
    public Object bind(Object obj){
        this.object = obj;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备工作···");
        method.invoke(object, args);
        System.out.println("收尾工作···");
        return null;
    }
}
