 package com.image;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SBMS-welcome-api-1")
public interface WelcomeApiClient
{
	@GetMapping("/welcome")
	public String welcomeApiInvoke();
	
}
