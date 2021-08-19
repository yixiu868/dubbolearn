package com.ww.rpc.provider.service.impl;

import com.ww.rpc.service.AobingService;

public class AobingServiceImpl implements AobingService {

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

}
