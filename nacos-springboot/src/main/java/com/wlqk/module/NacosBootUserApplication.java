package com.wlqk.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@NacosPropertySource(dataId = "example", autoRefreshed = true)
@EnableDiscoveryClient
public class NacosBootUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosBootUserApplication.class, args);
    }

}
