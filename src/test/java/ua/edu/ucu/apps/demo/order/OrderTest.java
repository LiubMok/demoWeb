package ua.edu.ucu.apps.demo.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerColor;
import ua.edu.ucu.apps.demo.flower.FlowerType;
import ua.edu.ucu.apps.demo.payment.PayPalPaymentStrategy;

public class OrderTest {
    Order order;

    @BeforeEach
    public void init(){
        order = new Order();
        order.addItem(new Flower(1, 12, FlowerColor.RED, 15, FlowerType.ROSE));
        order.addItem(new Flower(2, 12, FlowerColor.RED, 15, FlowerType.ROSE));
        order.addItem(new Flower(3, 12, FlowerColor.RED, 15, FlowerType.ROSE));
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
    }

    @Test
    public void testOrder(){
        Assertions.assertTrue(order.processOrder());
    }
}
