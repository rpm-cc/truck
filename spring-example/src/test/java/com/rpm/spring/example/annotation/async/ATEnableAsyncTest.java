package com.rpm.spring.example.annotation.async;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by renpiming on 2018/6/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ATEnableAsyncTest {

    @Autowired
    ATEnableAsync service;

    @Test
    public void testTask(){

        for (int i=0;i<50;i++){
            service.taskA();
            service.taskB();
        }

    }



}