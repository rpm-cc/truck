package com.rpm.spring.example.annotation.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by renpiming on 2018/6/14.
 */
@Service
public class ATEnableAsync {
    Logger logger = LoggerFactory.getLogger(ATEnableAsync.class);

    @Async
    public void taskA(){

        logger.info("TASK taskA");

    }
    @Async
    public void taskB(){

        logger.info("TASK taskB");

    }

}
