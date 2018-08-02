package com.huahouye.sidecar.server.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.ribbon.proxy.annotation.Hystrix;

@Component
public class SidecarServerGateway {
	
	@Autowired
	private SidecarServerClient sidecarServerClient;
	
	@Hystrix
	public String test() {
		return sidecarServerClient.test();
	}
	

}
