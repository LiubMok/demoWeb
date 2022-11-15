package ua.edu.ucu.apps.demo.flower;
import ua.edu.ucu.apps.demo.item.Item;
import java.util.ArrayList;

public class FlowerBucket extends Item {
    private ArrayList<Flower> arr = new ArrayList<>();

    public ArrayList<Flower> getBucket() {
        return arr;
    }

    public void add(Flower flower) {
        this.arr.add(flower);
    }

    @Override
    public String getDescription() {
        return toString();
    }

    public double getPrice() {
        int result = 0;
        for (Flower element : this.arr) {
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
