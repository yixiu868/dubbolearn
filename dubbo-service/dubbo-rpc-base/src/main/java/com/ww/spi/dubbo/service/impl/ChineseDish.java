package com.ww.spi.dubbo.service.impl;

import com.ww.spi.dubbo.service.Eat;

public class ChineseDish implements Eat {
    
    public static final String NAME = "chinese";

    @Override
    public void eat() {
        System.out.println("吃中国菜");
    }

}
