package org.ams;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)throws Exception {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");  
		BillCollector bc= context.getBean("billcollector",BillCollector.class);
		bc.CollectPayment(50.00);
		
	}

}
