package org.image;

public class UpiPaymemt implements Ipayment{

	@Override
	public String pay(double amount) {
		return "ayment successfull through UPI " +amount;
	}

}
