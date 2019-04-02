package com.example.cloud.commonservice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2019/1/10.
 */
public class JDKProxyImpl implements IProxyProvider {

    private IAdvice iAdvice;
    private Object target;

    public JDKProxyImpl() {
    }

    public JDKProxyImpl(IAdvice iAdvice, Object target) {
        this.iAdvice = iAdvice;
        this.target = target;
    }

    public IAdvice getiAdvice() {
        return iAdvice;
    }

    public void setiAdvice(IAdvice iAdvice) {
        this.iAdvice = iAdvice;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object getObj() {
        Object object = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (iAdvice != null){
                    iAdvice.before();
                }
                Object result = method.invoke(target, args);
                if (iAdvice != null){
                    iAdvice.after();
                }
                return  result;
            }
        });
        return object;
    }
}
