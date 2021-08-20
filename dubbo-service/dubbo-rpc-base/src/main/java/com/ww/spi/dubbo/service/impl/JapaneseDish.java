package com.ww.spi.dubbo.service.impl;

import com.ww.spi.dubbo.service.Eat;

public class JapaneseDish implements Eat {
    
    public static final String NAME = "japanese";

    @Override
    public void eat() {
        System.out.println("吃日本料理");
    }

}
