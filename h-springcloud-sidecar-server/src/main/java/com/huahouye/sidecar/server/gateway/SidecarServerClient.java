package com.huahouye.sidecar.server.gateway;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("h-springcloud-sidecar-service")
public interface SidecarServerClient {
	
	@GetMapping("/users")
	String test();

}
