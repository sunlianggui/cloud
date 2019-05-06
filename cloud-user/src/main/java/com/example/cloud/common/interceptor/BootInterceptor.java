package com.example.cloud.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Administrator on 2019/4/11.
 */
public class BootInterceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(BootInterceptor.class);

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        String url = request.getRequestURL().toString();
        String method = request.getMethod();
        String uri = request.getRequestURI();

        Map<String, String[]> map=request.getParameterMap();
        System.out.println("---------------------------------------------------------------------------------------------------");
        map.forEach((k,v) ->{
            logger.info("请求参数-- "+k+": "+v[0]);
        });
        logger.info("url--"+url);
        logger.info("method--"+method);
        logger.info("uri--"+uri);
        System.out.println("---------------------------------------------------------------------------------------------------");

    }
}
