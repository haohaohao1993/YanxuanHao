package com.haoyanxuan.demo.service.impl;

import com.haoyanxuan.demo.service.CloudTest;

public class CloudTestImpl implements CloudTest {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + "!!!");
    }
}
