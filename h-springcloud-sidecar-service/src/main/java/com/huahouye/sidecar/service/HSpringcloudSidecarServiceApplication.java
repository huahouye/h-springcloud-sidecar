package com.huahouye.sidecar.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class HSpringcloudSidecarServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HSpringcloudSidecarServiceApplication.class, args);
    }
}
