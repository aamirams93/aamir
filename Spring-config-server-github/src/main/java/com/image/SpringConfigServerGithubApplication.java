package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerGithubApplication.class, args);
	}

}
