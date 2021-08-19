package com.ww.rpc;

import java.io.IOException;

import org.junit.Test;

import com.ww.rpc.provider.service.ProviderFramework;
import com.ww.rpc.provider.service.impl.AobingServiceImpl;
import com.ww.rpc.service.AobingService;

public class CustomRpcTest {

    @Test
    public void test01() throws IOException {
        AobingService service = new AobingServiceImpl();
        
        // 暴露服务提供者
        System.out.println("暴露服务提供者");
        ProviderFramework.export(service, 2233);        
    }
}
