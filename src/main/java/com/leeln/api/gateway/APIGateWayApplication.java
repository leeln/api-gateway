package com.leeln.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableZuulProxy
public class APIGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(APIGateWayApplication.class, args);
	}
}
