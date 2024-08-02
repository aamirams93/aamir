package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.image.service.EmployeeService;

@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		EmployeeService es = ctx.getBean(EmployeeService.class);
		es.saveData();
		ctx.close();
	}

}
