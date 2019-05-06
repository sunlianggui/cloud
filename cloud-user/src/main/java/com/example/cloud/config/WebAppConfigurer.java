package com.example.cloud.config;

import com.example.cloud.common.interceptor.BootInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Administrator on 2019/4/11.
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Bean
    public WebAppConfigurer getInterfaceAuthCheckInterceptor() {
        return new WebAppConfigurer();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new BootInterceptor())    //指定拦截器类
                .addPathPatterns("/**");
    }
}
