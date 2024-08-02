package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.image.service.AccountService;

@SpringBootApplication
public class CompsitePrimaryApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(CompsitePrimaryApplication.class, args);
		AccountService acService = ctx.getBean(AccountService.class);
		acService.getDetailsPk();
		//acService.saveData();
		ctx.close();
	}

}
