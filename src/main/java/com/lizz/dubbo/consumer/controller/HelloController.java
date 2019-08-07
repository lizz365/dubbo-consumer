package com.lizz.dubbo.consumer.controller;

import com.lizz.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author lizz365
 * @date 19/3/21
 */
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    public String sayHi(String name){
        return helloService.getHello(name);
    }
}
