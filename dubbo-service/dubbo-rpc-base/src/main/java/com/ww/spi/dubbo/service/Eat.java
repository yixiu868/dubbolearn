package com.ww.spi.dubbo.service;

import org.apache.dubbo.common.extension.SPI;

import com.ww.spi.dubbo.service.impl.ChineseDish;

@SPI(ChineseDish.NAME)
public interface Eat {

    void eat();
}
