package ua.edu.ucu.apps.demo.payment;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    public List<Payment> getAllPayments(){
        return List.of(new PayPalPaymentStrategy(), new CreditCardPaymentStrategy());
    }
}
