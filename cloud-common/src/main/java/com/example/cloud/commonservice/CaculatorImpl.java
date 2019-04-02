package com.example.cloud.commonservice;

/**
 * Created by Administrator on 2019/1/10.
 */
public class CaculatorImpl implements Caculator{
    @Override
    public int substrct(int a, int b) {
        System.out.println("方法执行中");
        return a - b;
    }
}
