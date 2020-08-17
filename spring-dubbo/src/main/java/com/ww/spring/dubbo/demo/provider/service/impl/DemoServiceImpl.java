package com.ww.spring.dubbo.demo.provider.service.impl;

import com.ww.spring.dubbo.demo.provider.service.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
