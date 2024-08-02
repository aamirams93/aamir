package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringRestWebApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestWebApiClientApplication.class, args);
		
		
		String apiUrl = "https://www.javatpoint.com/java-tutorial";
		RestTemplate rs = new RestTemplate();
		ResponseEntity<String> forEntity  = rs.getForEntity(apiUrl, String.class);
		String body = forEntity.getBody();
		System.out.println(body);
	}

}
