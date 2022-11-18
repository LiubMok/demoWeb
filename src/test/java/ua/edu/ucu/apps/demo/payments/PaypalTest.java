package ua.edu.ucu.apps.demo.payments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.Payment;

public class PaypalTest {
    private Payment paypalStrategy;

    @BeforeEach
    public void init(){
         paypalStrategy = new PayPalPaymentStrategy();
    }

    @Test
    public void testPay(){
        Assertions.assertTrue(paypalStrategy.pay());
    }
}
