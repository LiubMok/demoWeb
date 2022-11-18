package ua.edu.ucu.apps.demo.delivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.List;

public class PostDeliveryStrategyTest {
    List<Item> order;
    Delivery postDelivery;

    @BeforeEach
    public void init(){
        order = List.of(new Flower(), new FlowerBucket());
        postDelivery = new PostDeliveryStrategy();
    }

    @Test
    public void testPost(){
        Assertions.assertTrue(postDelivery.deliver(order));
    }
}
