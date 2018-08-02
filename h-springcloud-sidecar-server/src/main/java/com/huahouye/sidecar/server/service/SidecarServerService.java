package com.huahouye.sidecar.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huahouye.sidecar.server.gateway.SidecarServerGateway;

@Service
public class SidecarServerService {
	
	@Autowired
	private SidecarServerGateway sidecarServerGateway;

	public String test() {
		return sidecarServerGateway.test();
	}

}
