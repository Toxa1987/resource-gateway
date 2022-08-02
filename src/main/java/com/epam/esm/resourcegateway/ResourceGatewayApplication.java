package com.epam.esm.resourcegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ResourceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceGatewayApplication.class, args);
	}

}
