package org.an;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
	
		ApplicationContext ctx =new ClassPathXmlApplicationContext("application.xml");
		BillCollector bc =  (BillCollector)ctx.getBean("billCollector");
		bc.collectPayment(400.00);
	}
}
