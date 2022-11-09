package ua.edu.ucu.apps.demo.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/payment")
public class PaymentController {
    @GetMapping(path = "/all_payments")
    public List<Payment> getPayments(){
        return List.of(new PayPalPaymentStrategy(), new CreditCardPaymentStrategy());
    }
}
