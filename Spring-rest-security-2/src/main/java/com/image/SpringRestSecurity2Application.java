package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.image.service.WelcomeApiService;

@SpringBootApplication
public class SpringRestSecurity2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringRestSecurity2Application.class, args);
		WelcomeApiService bean = ctx.getBean(WelcomeApiService.class);
		//bean.invokeApi();
		bean.invokeAPi2();
	}

}
