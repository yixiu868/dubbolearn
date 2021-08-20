package com.ww.rpc.provider.impl;

import com.ww.rpc.api.AobingService;

public class AobingServiceImpl implements AobingService {

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

}
