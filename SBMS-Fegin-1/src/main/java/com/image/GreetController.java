package com.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController
{
	@Autowired
	private WelcomeApiClient welApiClient;

	@GetMapping("/greet")
	public String getGreet()
	{
		String greetMsg = "Hi Aamir";
		
		String welcomeMsg = welApiClient.welcomeApiInvoke();
		
		return greetMsg + welcomeMsg;
	}

}
