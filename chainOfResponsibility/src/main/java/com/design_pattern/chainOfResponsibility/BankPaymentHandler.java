package com.design_pattern.chainOfResponsibility;

public class BankPaymentHandler extends PaymentHandler{

	@Override
	public void handlePayment(double amount) {
		// TODO Auto-generated method stub
		if(amount<=500) {
			System.out.println("Paid using bank account: $"+amount);
		}else {
			next.handlePayment(amount);
		}
	}

}
