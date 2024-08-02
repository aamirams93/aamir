package org.image;

public class DebitCardPayment implements Ipayment {

	@Override
	public String pay(double amount) {
		
		return "paymet successfull withdrawl through Debit Crad " +amount ;
	}

}
