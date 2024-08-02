package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.image.Entity.Player;
import com.image.repository.PlayerRepository;

@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		PlayerRepository rs = ctx.getBean(PlayerRepository.class);

		Player ps = new Player();
		ps.setPlayerId(2);
		ps.setPlayerName("Ams");
		ps.setPlayerAge(29);
		ps.setLocation("kne");
		rs.save(ps);
	}

}
