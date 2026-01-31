package com.adeshsrivastava.store;

import org.springframework.stereotype.Service;

//@Service("paypal")
public class PayPalPaymentService implements PaymentService {

    public PayPalPaymentService() {
        System.out.println("PayPalPaymentService created");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("=================================");
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
