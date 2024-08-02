package org.image;

public class CreditCardPayment implements Ipayment {

	@Override
	public String pay(double amount) {
		
		return "payment successfull withdrwal through credit Card " +amount;
	}

}
