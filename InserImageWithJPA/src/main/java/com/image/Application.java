package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.image.service.UserService;

@SpringBootApplication
public class Application
{

	public static void main(String[] args) throws Exception
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UserService us = ctx.getBean(UserService.class);
		us.saveData();
		ctx.close();

	}

}
