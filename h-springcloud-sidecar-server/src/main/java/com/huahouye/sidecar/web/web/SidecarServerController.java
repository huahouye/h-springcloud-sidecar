package com.huahouye.sidecar.web.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huahouye.sidecar.web.client.SidecarServerClient;

@RestController
@RequestMapping("/sidecar/server")
public class SidecarServerController {

	@Autowired
	private SidecarServerClient sidecarServerClient;

	@GetMapping("/test")
	public String test() {
		return sidecarServerClient.test();
	}
}
