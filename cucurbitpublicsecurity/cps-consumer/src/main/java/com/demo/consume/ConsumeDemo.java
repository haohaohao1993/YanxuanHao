package com.demo.consume;


import com.dubbo.test.dubboService.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ConsumeDemo {

    @Resource
    ClassPathXmlApplicationContext dubboContext;

    public void sayHello(String name){
        DemoService demoService = (DemoService) dubboContext.getBean("demoService"); // obtain proxy object for remote invocation
        //demoService.sayHello("world");
        demoService.sayHello("haohao");
    }
}
