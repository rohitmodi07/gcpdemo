package com.techmaze.gcpdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GCPController {
	
	@GetMapping("/gke")
	public String gkeDeployment() {
		return "deployement to GKE is successful";
	}
	
	@GetMapping("/cloudrun")
	public String cloudRunDeployment() {
		return "deployement to cloud run is successful";
	}

}
