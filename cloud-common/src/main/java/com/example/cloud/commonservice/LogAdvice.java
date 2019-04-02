package com.example.cloud.commonservice;

/**
 * Created by Administrator on 2019/1/10.
 */
public class LogAdvice implements IAdvice {
    @Override
    public void before() {
        System.out.println("之前");
    }

    @Override
    public void after() {
        System.out.println("之后");
    }
}
