package ua.edu.ucu.apps.demo.flower;

import ua.edu.ucu.apps.demo.item.Item;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    private ArrayList<FlowerPack> arr = new ArrayList<>();

    public ArrayList<FlowerPack> getBucket() {
        return arr;
    }

    public void add(FlowerPack flowerPack) {
        this.arr.add(flowerPack);
    }

    @Override
    public String getDescription() {
        return toString();
    }

    public double getPrice() {
        int result = 0;
        for (FlowerPack element : this.arr) {
            result += element.getPrice();
        }
        return result;
    }

    @Override
    public String toString() {
        return "FlowerBucket{" +
                "arr=" + arr +
                '}';
    }
}
