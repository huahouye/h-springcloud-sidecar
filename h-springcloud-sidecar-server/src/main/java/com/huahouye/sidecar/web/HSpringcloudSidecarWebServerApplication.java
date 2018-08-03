package com.huahouye.sidecar.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class HSpringcloudSidecarWebServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HSpringcloudSidecarWebServerApplication.class, args);
	}
}
