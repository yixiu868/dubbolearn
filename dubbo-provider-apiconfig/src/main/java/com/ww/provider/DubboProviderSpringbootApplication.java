package com.ww.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan(basePackages = "com.ww.provider.dubbo.service")
@SpringBootApplication
public class DubboProviderSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderSpringbootApplication.class, args);
	}

}
