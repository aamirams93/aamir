package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbmsEureka1Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmsEureka1Application.class, args);
	}

}
