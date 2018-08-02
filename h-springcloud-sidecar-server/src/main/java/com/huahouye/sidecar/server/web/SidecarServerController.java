package com.huahouye.sidecar.server.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huahouye.sidecar.server.service.SidecarServerService;

@RestController
@RequestMapping("/sidecar/server")
public class SidecarServerController {
	
	@Autowired
	private SidecarServerService sidecarServerService;

	@GetMapping("/test")
	public String test() {
		return sidecarServerService.test();
	}
}
