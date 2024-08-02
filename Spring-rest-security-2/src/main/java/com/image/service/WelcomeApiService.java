package com.image.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class WelcomeApiService
{
	String apiUrl= "http://localhost:8081/";
	
	public void invokeApi()
	{
		RestTemplate rt = new  RestTemplate();
		HttpHeaders ht = new HttpHeaders();
		ht.setBasicAuth("ams","ams123");
		HttpEntity<String> entity = new HttpEntity<>(ht);
		ResponseEntity<String> rs = rt.exchange(apiUrl, HttpMethod.GET, entity, String.class);
		String body = rs.getBody();
		System.out.println(body);
	}
	
	public void invokeAPi2()
	{
		WebClient webClient = WebClient.create();
		String block = webClient.get()
				         .uri(apiUrl)
				         .headers(headers -> headers.setBasicAuth("ams", "ams123"))
				         .retrieve()
				         .bodyToMono(String.class)
						 .block();
		System.out.println(block);
		
	}

	
	

}
