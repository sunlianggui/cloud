package com.example.cloud.Utils;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Administrator on 2019/5/6.
 */
public class ModelAndEntity {


    /**
     * entity和model类之间的转换
     * 注意同名问题
     * @param src
     * @param target
     * @return target
     */
    public static Object populate(Object src, Object target) {

        Method[] srcMethods = src.getClass().getMethods();
        Method[] targetMethods = target.getClass().getMethods();
        for (Method m : srcMethods) {
            String srcName = m.getName();
            if (srcName.startsWith("get")) {
                try {
                    Object result = m.invoke(src);
                    for (Method mm : targetMethods) {
                        String targetName = mm.getName();
                        if (targetName.startsWith("set")
                                && targetName.substring(3, targetName.length())
                                .equals(srcName.substring(3, srcName.length()))) {
                            mm.invoke(target, result);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return target;
    }


    /**
     * entity集合和model集合间的互相转换
     * @param src
     * @param target
     * @param targetClass
     * @param <S>
     * @param <T>
     * @return
     */
    public static <S, T> List<T> populateList(List<S> src, List<T> target, Class<?> targetClass) {

        for (int i = 0; i < src.size(); i++) {
            try {
                Object object = targetClass.newInstance();
                target.add((T) object);
                populate(src.get(i), object);
            } catch (Exception e) {
                continue;// 某个方法反射异常
            }
        }
        return target;
    }
}
