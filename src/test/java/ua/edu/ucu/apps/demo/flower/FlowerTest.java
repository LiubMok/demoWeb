package ua.edu.ucu.apps.demo.flower;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerTest {
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testType(){
        flower.setFlowerType(FlowerType.ROSE);
        Assertions.assertEquals("Rose", flower.getFlowerType());
    }

    @Test
    public void testColor(){
        flower.setColor(FlowerColor.RED);
        Assertions.assertEquals("Red", flower.getColor());
    }

    @Test
    public void testPrice(){
        flower.setPrice(100);
        Assertions.assertEquals(100, flower.getPrice());
    }
}
