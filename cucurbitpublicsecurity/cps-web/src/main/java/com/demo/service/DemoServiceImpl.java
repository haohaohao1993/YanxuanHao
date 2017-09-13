package com.demo.service;



import com.dubbo.test.dubboService.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
