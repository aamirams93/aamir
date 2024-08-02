package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SbmsAdminServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmsAdminServer2Application.class, args);
	}

}
