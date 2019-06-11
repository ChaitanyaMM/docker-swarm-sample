package com.dockerswarm.sample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping (value = "/v1/api")
@RestController
public class SampleSwarmContoller {
	
	
	
	@GetMapping(value = "/sample")
	 private String SampleMethod() {
		
		
		return "Docker-Swarm Sample is Running ! ..";
	}

}
