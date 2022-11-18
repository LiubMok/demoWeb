package ua.edu.ucu.apps.demo.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.item.Item;
import ua.edu.ucu.apps.demo.item.PaperDecorator;

import java.util.Random;

public class PaperTest {
    private Item item;

    @Test
    public void testPrice() {
        double price = 20D;
        Flower flower = new Flower();
        flower.setPrice(price);
        item = new PaperDecorator(flower);
        Assertions.assertEquals(price+13, item.getPrice());
    }
}
