package com.image.rest;

import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoRest
{
	@GetMapping("/")
	//@CircuitBreaker(name = "redisService",fallbackMethod="getDataFromDB")
	
	public String getDataFromRedis() {
		System.out.println("**Redis() method called**");
		
		if (new Random().nextInt(10) <= 10) {
			throw new RuntimeException("Redis Server Is Down");
		}
		// logic to access data from redis
		return "data accessed from redis (main logic) ....";
	}

	public String getDataFromDB() {
		System.out.println("**DB() method called**");
		// logic to access data from db
		return "data accessed from database (fall back logic) ....";
	}
	
	
}
