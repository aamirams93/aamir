package in.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.image.service.ReportService;

@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		ReportService rs = ctx.getBean(ReportService.class);
		rs.genrateReport();
	}

}
