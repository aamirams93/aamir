package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.image.entity.Product;
import com.image.repository.ProductRepository;

@SpringBootApplication
public class DataJpaTimesatmpingApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(DataJpaTimesatmpingApplication.class, args);
		ProductRepository rs = ctx.getBean(ProductRepository.class);
		Product p1 = new Product();
		p1.setPname("Almond");
		p1.setPrice(1100);
		rs.save(p1);
	}

}
