package org.an;

public class BillCollector {
	private Ipayment payment;

	public BillCollector() {

	}

	public BillCollector(Ipayment payment) {
		this.payment = payment;
	}

	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}

	public void collectPayment(double amount) {
		String status = payment.pay(amount);
		System.out.println(status);
	}
}
