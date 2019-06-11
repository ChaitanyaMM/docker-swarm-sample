package com.dockerswarm.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@ComponentScan(basePackages = "com.*")
public class DockerSwarmSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSwarmSampleApplication.class, args);
	}

}
