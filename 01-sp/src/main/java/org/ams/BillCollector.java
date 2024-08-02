package org.ams;

public class BillCollector {
		private Ipayment payment;
		
		
		public void setPayment(Ipayment payment)
		{
			this.payment = payment;
		}
		
		public BillCollector()
		{
			
		}
		public BillCollector(Ipayment payment)
		{
			this.payment = payment;
		}
		
		public void CollectPayment(double amount)
		{
			String status = payment.pay(amount);
			System.out.println(status);
		}
		
		
	
}
