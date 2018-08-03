package com.huahouye.sidecar.web.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.netflix.ribbon.proxy.annotation.Hystrix;

@FeignClient("h-springcloud-sidecar-service")
public interface SidecarServerClient {
	
	@GetMapping("/users")
	@Hystrix
	String test();

}
