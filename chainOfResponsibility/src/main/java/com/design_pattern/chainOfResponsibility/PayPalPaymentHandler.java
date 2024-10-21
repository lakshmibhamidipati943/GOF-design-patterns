package com.design_pattern.chainOfResponsibility;

public class PayPalPaymentHandler extends PaymentHandler{

	@Override
	public void handlePayment(double amount) {
		// TODO Auto-generated method stub
		if(amount<=1500) {
			System.out.println("Paid using PayPal: $"+amount);
		}else {
			next.handlePayment(amount);
		}
	}

}
