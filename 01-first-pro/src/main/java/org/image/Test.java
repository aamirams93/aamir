package org.image;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		BillCollector bc =  ctx.getBean("billCollector", BillCollector.class);
		bc.collectPayment(400.00);
	}
}
