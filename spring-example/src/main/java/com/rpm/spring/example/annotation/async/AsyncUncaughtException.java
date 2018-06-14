package com.rpm.spring.example.annotation.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

/**
 * Created by renpiming on 2018/6/14.
 */
public class AsyncUncaughtException implements AsyncUncaughtExceptionHandler {
    Logger logger  = LoggerFactory.getLogger(AsyncUncaughtException.class);
    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
        logger.error("Exception {},{}",throwable.getMessage(),method.getName());
    }
}
