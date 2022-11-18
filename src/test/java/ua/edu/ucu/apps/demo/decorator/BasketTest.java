package ua.edu.ucu.apps.demo.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.item.BasketDecorator;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.Random;

public class BasketTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Item item;

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        Flower flower = new Flower();
        flower.setPrice(price);
        item = new BasketDecorator(flower);
        Assertions.assertEquals(price+4, item.getPrice());
    }
}