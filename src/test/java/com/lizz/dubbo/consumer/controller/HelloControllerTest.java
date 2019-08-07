package com.lizz.dubbo.consumer.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhenzhong.li
 * @date 19/3/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {
    @Autowired
    HelloController helloController;
    @Test
    public void sayHi() throws Exception {
        System.out.println(helloController.sayHi("ssss"));
    }

}