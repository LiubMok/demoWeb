package ua.edu.ucu.apps.demo.flower;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice(){
        flowerBucket.add(new Flower(1, 25, FlowerColor.RED, 25, FlowerType.ROSE));
        flowerBucket.add(new Flower(2, 25, FlowerColor.RED, 25, FlowerType.ROSE));
        flowerBucket.add(new Flower(3, 25, FlowerColor.RED, 25, FlowerType.ROSE));
        Assertions.assertEquals(75, flowerBucket.getPrice());
    }
}