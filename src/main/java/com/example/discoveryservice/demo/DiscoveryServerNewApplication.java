package com.example.discoveryservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerNewApplication.class, args);
	}
	
	/*
	 * Start Discovery server, then instance 1, instance 2
	 * http://localhost:8050/
	 */

}

