package com.yuheng.pangolin.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

//    private final AuthorizeInterceptor authorizeInterceptor;
//
//    @Autowired
//    WebMvcConfig(AuthorizeInterceptor authorizeInterceptor) {
//        this.authorizeInterceptor = authorizeInterceptor;
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        WebMvcConfigurer.super.addInterceptors(registry);
//
//        registry.addInterceptor(authorizeInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/signIn", "/signUp");
//    }
}
