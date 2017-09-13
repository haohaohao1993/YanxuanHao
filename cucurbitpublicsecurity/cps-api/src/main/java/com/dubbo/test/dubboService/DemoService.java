package com.dubbo.test.dubboService;

import org.springframework.stereotype.Service;

@Service("demoService")
public interface DemoService {
    public void sayHello(String name);
}
