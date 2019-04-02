package com.example.cloud.commonservice;

/**
 * Created by Administrator on 2019/1/10.
 */
public class JVM {
    public static void main(String[] args) {

        IAdvice advice = new LogAdvice();
        Caculator caculator = new CaculatorImpl();
        IProxyProvider proxyProvider = new JDKProxyImpl(advice, caculator);
        Caculator proxy =  (Caculator)proxyProvider.getObj();
        System.out.println(proxy.substrct(1, 3));
    }
}
