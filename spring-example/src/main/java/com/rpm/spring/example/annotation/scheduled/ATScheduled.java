package com.rpm.spring.example.annotation.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by renpiming on 2018/6/14.
 */
@Service
public class ATScheduled {
    Logger  logger = LoggerFactory.getLogger(ATScheduled.class);
    @Scheduled(fixedRate = 2000L,initialDelay = 5000L)
    public void testFixeRate(){
        logger.info("SCHEDULE fixedRate:{}",String.format("%tT",new Date()));
    }
    @Scheduled(fixedDelay = 2000L)
    public void testFixeDelay(){

        logger.info("SCHEDULE fixedDelay:{}",String.format("%tT",new Date()));
    }
    @Scheduled(cron = "0/3 * * * * ?")
    public void testCorn(){
        logger.info("SCHEDULE corn:{}",String.format("%tT",new Date()));
    }

}
