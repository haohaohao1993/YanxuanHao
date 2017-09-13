package com.dubbo.cpsconsumer;

import com.demo.consume.ConsumeDemo;
import org.junit.Test;

public class RemoteMethodTest {
    @Test
    public void sayHello(){
        ConsumeDemo consumeDemo = new ConsumeDemo();
        consumeDemo.sayHello("haoyanxuan");
    }
}
