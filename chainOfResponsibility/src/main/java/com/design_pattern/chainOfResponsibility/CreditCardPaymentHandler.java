package com.design_pattern.chainOfResponsibility;

public class CreditCardPaymentHandler extends PaymentHandler{

	@Override
	public void handlePayment(double amount) {
		// TODO Auto-generated method stub
		if(amount<=1000) {
			System.out.println("Paid using credit card: $"+amount);
		}else {
			next.handlePayment(amount);
		}
	}

}
