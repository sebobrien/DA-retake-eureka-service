package com.seb.eureakaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EureakaServiceApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(EureakaServiceApplication.class, args);
	}
}
