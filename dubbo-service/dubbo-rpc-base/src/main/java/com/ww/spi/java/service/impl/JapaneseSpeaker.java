package com.ww.spi.java.service.impl;

import com.ww.spi.java.service.Speaker;

public class JapaneseSpeaker implements Speaker {

    @Override
    public void speak() {
        System.out.println("日本语");
    }

}
