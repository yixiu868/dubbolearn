package com.ww.spi.java.service.impl;

import com.ww.spi.java.service.Speaker;

public class ChineseSpeaker implements Speaker {

    @Override
    public void speak() {
        System.out.println("请讲中文");
    }

}
