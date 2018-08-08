package com.seb.eureakaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.seb.movieservice.MovieController;

@EnableEurekaServer
@SpringBootApplication
public class EureakaServiceApplication {
	
	MovieController movie = new MovieController();

	public static void main(String[] args) {
		SpringApplication.run(EureakaServiceApplication.class, args);
	}
}
