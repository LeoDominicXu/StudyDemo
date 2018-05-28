package com.xuzc.study;

import com.xuzc.study.agent.FirstAgent;

import java.lang.instrument.Instrumentation;

public class App {
    public static void premain(String agentOps, Instrumentation inst){
        System.out.println("=========premain方法执行========");
        System.out.println(agentOps);
        // 添加Transformer
        inst.addTransformer(new FirstAgent());
    }
}
