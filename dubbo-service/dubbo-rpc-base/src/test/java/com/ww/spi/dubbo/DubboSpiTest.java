package com.ww.spi.dubbo;

import com.ww.spi.dubbo.service.Eat;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @author xiaohua
 * @description Dubbo SPI测试
 * @date 2021-8-23 16:27
 */
public class DubboSpiTest {

    @Test
    public void test01() {
        Eat defaultEat = ExtensionLoader.getExtensionLoader(Eat.class).getExtension("japanese");
        defaultEat.eat();
    }
}
