package ua.edu.ucu.apps.demo.payments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.Payment;

public class CreditCardTest {
    private Payment creditCardPayment;

    @BeforeEach
    public void init(){
        creditCardPayment = new CreditCardPaymentStrategy();
    }

    @Test
    public void testPay(){
        Assertions.assertTrue(creditCardPayment.pay());
    }
}
