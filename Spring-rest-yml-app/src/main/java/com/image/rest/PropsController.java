package com.image.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.image.props.ApplicationProperties;

@RestController
public class PropsController
{
	@Autowired
	private ApplicationProperties apppro;

	@GetMapping("/")
	public String getWelcome()
	{
		Map<String, String> message = apppro.getMessage();
		return message.get("welcome");
		
	}
	@GetMapping("/greet")
	public String getGreet()
	{
		Map<String, String> message = apppro.getMessage();
		return   message.get("greet");
		
	}
}
