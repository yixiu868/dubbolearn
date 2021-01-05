package com.ww.provider.dubbo.conf;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.MonitorConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {

    /**
     * 配置应用
     * @return
     */
    @Bean
    // <dubbo:application name="provider-service" />
    public ApplicationConfig applicationConfig() {
        ApplicationConfig config = new ApplicationConfig();
        config.setName("provider-service");
        // config.setQosEnable(false);
        return config;
    }
    
    /**
     * 配置注册
     * @return
     */
    @Bean
    // <dubbo:registry protocol="zookeeper" address="127.0.0.1:2181" />
    public RegistryConfig registryConfig() {
        RegistryConfig config = new RegistryConfig();
        config.setProtocol("zookeeper");
        config.setAddress("127.0.0.1:2181");
        return config;
    }
    
    /**
     * 配置协议
     * @return
     */
    @Bean
    // <dubbo:protocol name="dubbo" port="20880" />
    public ProtocolConfig protocolConfig() {
        ProtocolConfig config = new ProtocolConfig();
        config.setName("dubbo");
        config.setPort(20880);
        return config;
    }
    
    // <dubbo:provider timeout="1000" />
    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig config = new ProviderConfig();
        config.setTimeout(5000);
        return config;
    }
    
    // <dubbo:monitor address="127.0.0.1:7010" />
    @Bean
    public MonitorConfig monitorConfig() {
        MonitorConfig config = new MonitorConfig();
        config.setProtocol("registry");
        return config;
    }
}
