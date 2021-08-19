package com.ww.rpc;

import java.io.IOException;

import org.junit.Test;

import com.ww.rpc.consumer.ConsumerFramework;
import com.ww.rpc.service.AobingService;

public class CustomRpcTest2 {

    @Test
    public void test01() throws IOException {
        AobingService refer = ConsumerFramework.refer(AobingService.class, "127.0.0.1", 2233);
        refer.hello("how are you");
    }
}
